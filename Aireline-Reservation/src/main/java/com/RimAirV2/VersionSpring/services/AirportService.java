package com.RimAirV3.VersionSpring.services;

import com.RimAirV3.VersionSpring.model.Airport;
import org.springframework.data.domain.Page;

import java.util.List;

public interface AirportService {
    public abstract Page<Airport> getAllAirportsPaged(int pageNum);
    public abstract List<Airport> getAllAirports();
    public abstract Airport getAirportById(Integer airportId);
    public abstract Airport saveAirport(Airport airport);
    public abstract void deleteAirport(Integer airpportId);
}
