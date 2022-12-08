package com.example.loadmanagement.services;

import com.example.loadmanagement.model.Load;

import java.util.List;

public interface LoadService {
    // Get all loads
    List<Load> getLoads();

    // Get a specific load
    Load getLoad(long id);

    // Add a load
    Load addLoad(Load load);

    // Update a load
    Load updateLoad(Load load,long id);

    // Delete a load
    Load deleteLoad(long id);
}
