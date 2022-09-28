package kg.charginov.airline.model.service.impl;

import kg.charginov.airline.model.Aircraft;
import kg.charginov.airline.model.Airline;
import kg.charginov.airline.model.service.PrintInt;

import java.util.List;

public class PrintAirplaneFields implements PrintInt {

    @Override
    public void getAllPeopleCapacity(Airline airline){
        int amount = 0;
        List<Aircraft> aircrafts = airline.getAirplanes();
        for(Aircraft aircraft:aircrafts){
            amount+=aircraft.getPeopleCapacity();
        }
        System.out.println("Общее количество мест у авиакомпании '"+ airline.getName() +"' равно = " + amount);
    }

    @Override
    public void getAllCarryingCapacity(Airline airline){
        int amount = 0;
        List<Aircraft> aircrafts = airline.getAirplanes();
        for(Aircraft aircraft:aircrafts){
            amount+=aircraft.getCarryingCapacity();
        }
        System.out.println("Общая грузоподъемность у авиакомпании '"+ airline.getName() +"' равно = " + amount);
    }

}
