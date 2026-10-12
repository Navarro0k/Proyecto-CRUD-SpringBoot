package com.navarro.proyectorepaso.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.navarro.proyectorepaso.model.Tarea;
import com.navarro.proyectorepaso.services.TareaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin(origins = "*")  
public class TareaController {

    private final TareaService tareaService;

    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    @GetMapping("/tareas")
    public List<Tarea> getTareas() {
        return tareaService.getAllTareas();
    }
    
    @GetMapping("/tareas/{id}")
    public Tarea getTarea(@PathVariable Long id) {
        return tareaService.getTareaById(id);
    }
    
    @PostMapping("/tareas") 
    public Tarea newTarea(@RequestBody Tarea tarea) {
        return tareaService.createTarea(tarea);

    }

    @PutMapping("/tareas")
    public Tarea updateTareaMethod(@RequestBody Tarea tarea) {
        return tareaService.updateTarea(tarea);
        
    }

    @DeleteMapping("/tareas/{id}")
    public Long deleteTareaMethod(@PathVariable Long id){
        return tareaService.deleteTarea(id);
    }
    

    
}
