package kg.charginov.airline.model.service;

import kg.charginov.airline.model.Airline;

public interface FindInt {

    public void findAirplanesByFuelConsumption(Airline airline, int min, int max);

}
