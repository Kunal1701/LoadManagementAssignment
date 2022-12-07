package com.example.loadmanagement.services;

import com.example.loadmanagement.Dao.LoadDao;
import com.example.loadmanagement.model.Load;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadServiceImpl implements LoadService {
    // Autowire the LoadDao
    @Autowired
    private LoadDao loadDao;
    public LoadServiceImpl() {
        super();
    }
    // Implement the methods
    @Override
    public List<Load> getLoads() {
        return this.loadDao.findAll();
    }

    @Override
    public Load getLoad(long id) {
        return this.loadDao.findById(id).get();
    }

    @Override
    public Load addLoad(Load load) {
        return this.loadDao.save(load);
    }

    @Override
    public Load updateLoad(Load load) {
        return this.loadDao.save(load);
    }

    @Override
    public Load deleteLoad(long id) {
        Load load = this.loadDao.findById(id).get();
        this.loadDao.deleteById(id);
        return load;
    }
}

