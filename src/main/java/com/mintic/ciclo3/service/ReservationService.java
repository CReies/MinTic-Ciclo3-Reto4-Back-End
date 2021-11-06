package com.mintic.ciclo3.service;

import java.util.List;
import java.util.Optional;

import com.mintic.ciclo3.model.Reservation;
import com.mintic.ciclo3.repository.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
  @Autowired
  private ReservationRepository reservationRepository;

  public List<Reservation> getAll() {
    return reservationRepository.getAll();
  }

  public Optional<Reservation> getReservation(int id) {
    return reservationRepository.getReservation(id);
  }

  public Reservation save(Reservation r) {
    if (r.getIdReservation() == null) {
      return reservationRepository.save(r);
    } else {
      Optional<Reservation> raux = reservationRepository.getReservation(r.getIdReservation());
      if (raux.isEmpty()) {
        return reservationRepository.save(r);
      } else {
        return r;
      }
    }
  }

  public Reservation edit(Reservation r) {
    return reservationRepository.edit(r);
  }

  public void delete(int id) {
    reservationRepository.delete(id);
  }
}
