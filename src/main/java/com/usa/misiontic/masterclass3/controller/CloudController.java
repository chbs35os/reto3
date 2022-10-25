package com.usa.misiontic.masterclass3.controller;




import com.usa.misiontic.masterclass3.entities.Cloud;
import com.usa.misiontic.masterclass3.service.CloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/Cloud")
@CrossOrigin(origins = "*")

public class CloudController {
    @Autowired
    private CloudService cloudService;

    @GetMapping( "/all")
    public List<Cloud> getAll(){

        return cloudService.getALL();
        }


    @PostMapping( "/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cloud save(@RequestBody Cloud p){
        return cloudService.save(p);

    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Cloud update(@RequestBody Cloud p){

        return cloudService.update(p);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){

        return cloudService.deleteCloud(id);
    }

}
