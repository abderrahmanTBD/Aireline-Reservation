package com.RimAirV3.VersionSpring.repository;

import com.RimAirV3.VersionSpring.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {
}
