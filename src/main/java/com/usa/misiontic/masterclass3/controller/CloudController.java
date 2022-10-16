package com.usa.misiontic.masterclass3.controller;


import com.usa.misiontic.masterclass3.entities.Cloud;
import com.usa.misiontic.masterclass3.entities.Product;
import com.usa.misiontic.masterclass3.service.CloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Cloud")
public class CloudController {
    @Autowired
    private CloudService cloudService;

    @GetMapping( "/all")
    public List<Cloud> getAll(){
        return cloudService.getALL();
        }

    @PostMapping( "/save")
    public Cloud save(@RequestBody Cloud p){
        return cloudService.save(p);

    }


}
