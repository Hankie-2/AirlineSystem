package kg.charginov.airline.model.service.impl;

import kg.charginov.airline.model.Aircraft;
import kg.charginov.airline.model.Airline;
import kg.charginov.airline.model.service.FindInt;

import java.util.List;

public class FindAirplane implements FindInt {

    @Override
    public void findAirplanesByFuelConsumption(Airline airline, int min, int max){
        List<Aircraft> aircrafts = airline.getAirplanes();
        for(Aircraft aircraft:aircrafts){
            if(getAverageOfFuelConsumption(aircraft)>min && getAverageOfFuelConsumption(aircraft)<max){
                System.out.println(aircraft);
            }
        }
    }

    private int getAverageOfFuelConsumption(Aircraft aircraft){
        int ans = (aircraft.getWeight() + aircraft.getCarryingCapacity()
                    + aircraft.getPeopleCapacity()*64 + aircraft.getRangeOfFlight())/24;

        return ans;
    }

}
