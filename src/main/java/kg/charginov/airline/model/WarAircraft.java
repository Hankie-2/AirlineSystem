package kg.charginov.airline.model;

import kg.charginov.airline.model.enums.AirplaneType;

public class WarAircraft extends Aircraft{

    public WarAircraft(Integer id, String name, Integer peopleCapacity, Integer carryingCapacity, Integer kmH, Integer weight, Integer rangeOfFlight) {
        super(id, name, peopleCapacity, carryingCapacity, kmH, weight, rangeOfFlight, AirplaneType.WAR);
    }

    @Override
    public int compareTo(Aircraft o) {
        return o.getRangeOfFlight().compareTo(this.getRangeOfFlight());
    }
}
