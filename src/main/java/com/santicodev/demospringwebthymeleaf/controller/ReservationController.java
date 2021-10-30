package com.santicodev.demospringwebthymeleaf.controller;

import com.santicodev.demospringwebthymeleaf.data.entity.Reservation;
import com.santicodev.demospringwebthymeleaf.data.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping
    public Iterable<Reservation> getReservations() {
        return this.reservationRepository.findAll();
    }
}
