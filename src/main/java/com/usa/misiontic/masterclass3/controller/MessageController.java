package com.usa.misiontic.masterclass3.controller;


import com.usa.misiontic.masterclass3.entities.Message;
import com.usa.misiontic.masterclass3.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*")

public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping( "/all")
    public List<Message> getAll(){

        return messageService.getALL();
    }


    @PostMapping( "/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save(@RequestBody Message p){

        return messageService.save(p);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Message update(@RequestBody Message p){

        return messageService.update(p);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){

        return messageService.deleteMessage(id);
    }



}   