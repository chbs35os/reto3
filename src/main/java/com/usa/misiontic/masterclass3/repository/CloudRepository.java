package com.usa.misiontic.masterclass3.repository;

import com.usa.misiontic.masterclass3.entities.Cloud;
import com.usa.misiontic.masterclass3.repository.crudRepository.CloudCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CloudRepository {
    @Autowired
    private CloudCrudRepository cloudCrudRepository;
    public List<Cloud> getAll(){

        return (List<Cloud>) cloudCrudRepository.findAll();
    }
    public Optional<Cloud> getCloud(int id){

        return cloudCrudRepository.findById(id);
    }
    public Cloud save(Cloud p){

        return cloudCrudRepository.save(p);
    }
    public void delete(Cloud p){

        cloudCrudRepository.delete(p);
    }
}
