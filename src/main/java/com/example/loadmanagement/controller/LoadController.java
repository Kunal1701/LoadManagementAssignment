package com.example.loadmanagement.controller;

import com.example.loadmanagement.model.Load;
import com.example.loadmanagement.services.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoadController {
    // Autowire the LoadService
    @Autowired
    private LoadService loadService;

    // Show all loads
    @GetMapping("/load")
    public List<Load> getLoads() {
        return this.loadService.getLoads();
    }

    // Show a specific load
    @GetMapping("/load/{id}")
    public Load getLoad(@PathVariable long id) {
        return this.loadService.getLoad(id);
    }

    // Add a load
    @PostMapping("/load")
    public String addLoad(@RequestBody Load load) {
        this.loadService.addLoad(load);
        return "Load added successfully";
    }

    // Update a load
    @PutMapping("/load/{id}")
    public String updateLoad(@RequestBody Load load, @PathVariable long id) {
        this.loadService.updateLoad(load,id);
        return "Load updated successfully";
    }

    // Delete a load
    @DeleteMapping("/load/{id}")
    public String deleteLoad(@PathVariable long id) {
        this.loadService.deleteLoad(id);
        return "Load deleted successfully";
    }


}
