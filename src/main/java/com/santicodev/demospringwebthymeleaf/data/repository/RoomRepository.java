package com.santicodev.demospringwebthymeleaf.data.repository;

import com.santicodev.demospringwebthymeleaf.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
