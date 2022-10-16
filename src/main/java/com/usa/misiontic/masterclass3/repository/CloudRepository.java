package com.usa.misiontic.masterclass3.repository;

import com.usa.misiontic.masterclass3.entities.Category;
import com.usa.misiontic.masterclass3.entities.Cloud;
import com.usa.misiontic.masterclass3.repository.crudRepository.CategoryCrudRepository;
import com.usa.misiontic.masterclass3.repository.crudRepository.CloudCrudRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CloudRepository {
    @Autowired
    private CloudCrudRespository cloudCrudRespository;
    public List<Cloud> getAll(){
        return (List<Cloud>) cloudCrudRespository.findAll();
    }
    public Optional<Cloud> getCloud(int id){
        return cloudCrudRespository.findById(id);
    }
    public Cloud save(Cloud p){
        return cloudCrudRespository.save(p);
    }
    public void delete(Cloud p){
        cloudCrudRespository.delete(p);
    }
}
