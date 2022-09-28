package kg.charginov.airline;

import kg.charginov.airline.model.Aircraft;
import kg.charginov.airline.model.Airline;
import kg.charginov.airline.model.PassengerAircraft;
import kg.charginov.airline.model.WarAircraft;
import kg.charginov.airline.model.service.FindInt;
import kg.charginov.airline.model.service.PrintInt;
import kg.charginov.airline.model.service.impl.FindAirplane;
import kg.charginov.airline.model.service.impl.PrintAirplaneFields;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aircraft> aircrafts = new ArrayList<>();

        Aircraft warAircraft1 = new WarAircraft(1,"CPP-22",4,500,240,2000,500);
        Aircraft warAircraft2 = new WarAircraft(2,"AIR-2",4,300,340,1500,300);
        Aircraft warAircraft3 = new WarAircraft(3,"MARS-242",4,200,440,1000,200);
        Aircraft passengerAircraft1 = new PassengerAircraft(4,"BOEING-133",200,1000,300,3500,2000);
        aircrafts.add(warAircraft1);
        aircrafts.add(warAircraft2);
        aircrafts.add(warAircraft3);
        aircrafts.add(passengerAircraft1);

        Airline airline1 = new Airline(1,"MarsAirline",aircrafts);

        PrintInt airplaneFields = new PrintAirplaneFields();

        airplaneFields.getAllCarryingCapacity(airline1);
        airplaneFields.getAllPeopleCapacity(airline1);

        FindInt findAirplane = new FindAirplane();
        findAirplane.findAirplanesByFuelConsumption(airline1,10,100);

    }
}
