package com.usa.misiontic.masterclass3.controller;




import com.usa.misiontic.masterclass3.entities.Reservation;
import com.usa.misiontic.masterclass3.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*")

public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping( "/all")
    public List<Reservation> getAll(){

        return reservationService.getALL();
    }

    @PostMapping( "/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation p){

        return reservationService.save(p);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation update(@RequestBody Reservation p){

        return reservationService.update(p);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){

        return reservationService.deleteReservation(id);
    }


}