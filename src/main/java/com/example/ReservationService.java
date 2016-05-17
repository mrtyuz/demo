package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.Collection;

/**
 * Created by murat on 11/05/16.
 */
@RepositoryRestController
public class ReservationService {

    ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @RestResource(path = "reservations")
    public Collection getReservation(@Param("rn") String rn) {
        return reservationRepository.findByReservationName(rn);
    }

}
