package com.RimAirV3.VersionSpring.repository;

import com.RimAirV3.VersionSpring.model.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AircraftRepository extends JpaRepository<Aircraft, Long> {
}
