package com.santicodev.demospringwebthymeleaf.data.repository;

import com.santicodev.demospringwebthymeleaf.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
