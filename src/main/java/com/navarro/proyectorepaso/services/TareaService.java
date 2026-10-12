package com.navarro.proyectorepaso.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.navarro.proyectorepaso.model.Tarea;

@Service
public class TareaService {

    private List<Tarea> tareas = new ArrayList<>();
    private Long nextId = 1L;

    public List<Tarea> getAllTareas() {
        return tareas;
    }

    public Tarea getTareaById(Long id) {
        return tareas.stream()
                .filter(tarea -> tarea.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Tarea createTarea(Tarea tarea) {
        tarea.setId(nextId++);
        tareas.add(tarea);
        return tarea;
    }

    public Tarea updateTarea(Tarea tareaActualizada) {
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getId().equals(tareaActualizada.getId())) {
                tareas.set(i, tareaActualizada);
                return tareaActualizada;
            }
        }
        return null; 
    }

    public Long deleteTarea(Long id) {
        tareas.removeIf(tarea -> tarea.getId().equals(id));
        return id;
    }

}
