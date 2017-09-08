package com.ankur.repository;

import com.ankur.entity.Reservation;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends CrudRepository<Reservation,Long> {
    List<Reservation> findByDate (Date date);
}
