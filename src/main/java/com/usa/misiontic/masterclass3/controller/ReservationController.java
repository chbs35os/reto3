package com.usa.misiontic.masterclass3.controller;


import com.usa.misiontic.masterclass3.entities.Product;
import com.usa.misiontic.masterclass3.entities.Reservation;
import com.usa.misiontic.masterclass3.service.ProductService;
import com.usa.misiontic.masterclass3.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping( "/all")
    public List<Reservation> getAll(){
        return reservationService.getALL();
        }

    @PostMapping( "/save")
    public Reservation save(@RequestBody Reservation p){
        return reservationService.save(p);
    }


}
