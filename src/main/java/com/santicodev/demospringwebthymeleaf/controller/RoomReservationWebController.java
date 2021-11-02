package com.santicodev.demospringwebthymeleaf.controller;

import com.santicodev.demospringwebthymeleaf.business.domain.RoomReservation;
import com.santicodev.demospringwebthymeleaf.service.ReservationService;
import com.santicodev.demospringwebthymeleaf.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/room/reservations")
public class RoomReservationWebController {

    private final ReservationService reservationService;

    @Autowired
    public RoomReservationWebController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public String getReservations(@RequestParam(value = "date", required = false) String dateString, Model model) {
        Date date = DateUtils.createDateFromDateString(dateString);
        List<RoomReservation> roomReservationList = this.reservationService.getRoomReservationForDate(date);
        model.addAttribute("roomReservations", roomReservationList);
        return "reservations";
    }
}
