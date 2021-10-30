package com.santicodev.demospringwebthymeleaf.data.repository;

import com.santicodev.demospringwebthymeleaf.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
