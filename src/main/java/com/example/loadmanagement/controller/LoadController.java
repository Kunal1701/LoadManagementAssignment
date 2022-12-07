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
    public Load addLoad(@RequestBody Load load) {
        return this.loadService.addLoad(load);
    }

    // Update a load
    @PutMapping("/load")
    public Load updateLoad(@RequestBody Load load) {
        return this.loadService.updateLoad(load);
    }

    // Delete a load
    @DeleteMapping("/load/{id}")
    public Load deleteLoad(@PathVariable long id) {
        return this.loadService.deleteLoad(id);
    }


}
