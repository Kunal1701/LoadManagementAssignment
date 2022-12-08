package com.example.loadmanagement.services;

import com.example.loadmanagement.dao.LoadDao;
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

        if (load.getShipmentId()==this.loadDao.findById(load.getShipmentId()).get().getShipmentId()) {
            return null;
        }
        else {
            this.loadDao.save(load);
            return load;
        }
    }

    @Override
    public Load updateLoad(Load load,long id) {
        Load existingLoad = this.loadDao.findById(id).get();
        existingLoad.setShipmentId(load.getShipmentId());
        existingLoad.setDate(load.getDate());
        existingLoad.setLoadingPoint(load.getLoadingPoint());
        existingLoad.setUnloadingPoint(load.getUnloadingPoint());
        existingLoad.setProductType(load.getProductType());
        existingLoad.setTruckType(load.getTruckType());
        existingLoad.setNoOfTrucks(load.getNoOfTrucks());
        existingLoad.setWeight(load.getWeight());
        existingLoad.setComment(load.getComment());
        return this.loadDao.save(existingLoad);
    }

    @Override
    public Load deleteLoad(long id) {
        Load load = this.loadDao.findById(id).get();
        this.loadDao.deleteById(id);
        return load;
    }
}

