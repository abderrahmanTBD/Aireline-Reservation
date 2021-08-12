package com.RimAirV3.VersionSpring.repository;

import com.RimAirV3.VersionSpring.model.Flight;
import com.RimAirV3.VersionSpring.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findAllByDepartureAirportEqualsAndDestinationAirportEqualsAndDepartureDateEquals(Airport depAirport, Airport destAirport, LocalDate depDate);

}
