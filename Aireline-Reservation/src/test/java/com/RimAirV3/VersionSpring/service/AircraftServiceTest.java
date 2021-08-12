package com.RimAirV3.VersionSpring.service;

import com.RimAirV3.VersionSpring.model.Aircraft;
import com.RimAirV3.VersionSpring.services.AircraftService;
import com.RimAirV3.VersionSpring.repository.AircraftRepository;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AircraftServiceTest {

    @Autowired
    private AircraftService aircraftService;

    @MockBean
    private AircraftRepository aircraftRepository;

    Aircraft aircraft = new Aircraft("Boing", "737", 700);


    //test if the saveAircraft() method.
    @Test
    public void saveAircraftTest(){
        when(aircraftRepository.save(aircraft)).thenReturn(aircraft);
        Assert.assertEquals(aircraft, aircraftService.saveAircraft(aircraft));
        aircraftService.saveAircraft(aircraft);
    }

    //saveAircraft should throw exception if the argument passed is null
    @Test(expected = IllegalArgumentException.class)
    public void saveAircraftThrowsIllegalArgumentException(){
//        AssertionErrors.assertEquals("Exception not handled", new IllegalArgumentException(), aircraftService.saveAircraft(null));
        aircraftService.saveAircraft(null);
    }

    //test if the aircraftRepository.save() is called
    @Test
    public void isCalled(){
        Aircraft aircraft = new Aircraft("Boing", "737", 700);
        when(aircraftRepository.save(aircraft)).thenReturn(aircraft);
        aircraftService.saveAircraft(aircraft);
        verify(aircraftRepository, times(1)).save(aircraft);
    }


}
