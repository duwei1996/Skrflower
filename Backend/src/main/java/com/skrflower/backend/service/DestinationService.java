package com.skrflower.backend.service;

import com.skrflower.backend.bean.Destination;
import com.skrflower.backend.dao.DestinationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationService {

    @Autowired
    DestinationDao destinationDao;

    public Destination findById(Integer id){
        return destinationDao.findById(id);
    }

    public Destination findByName(String name){
        return destinationDao.findByDestName(name);
    }

    public List<Destination> findByRegion(Integer regionNum){
        return destinationDao.findByRegion(regionNum);
    }

    public List<Destination> findByCategory(String categoryName){
        return destinationDao.findByCategory(categoryName);
    }

    public List<Destination> findByTags(List<String> tags){
        return destinationDao.findByTags(tags);
    }
}
