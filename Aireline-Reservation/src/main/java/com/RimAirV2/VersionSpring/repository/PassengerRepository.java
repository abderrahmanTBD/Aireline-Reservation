package com.RimAirV3.VersionSpring.repository;

import com.RimAirV3.VersionSpring.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
