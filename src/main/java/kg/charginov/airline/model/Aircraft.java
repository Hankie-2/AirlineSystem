package kg.charginov.airline.model;

import kg.charginov.airline.model.enums.AirplaneType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class Aircraft implements Comparable<Aircraft> {

    Integer id;

    String name;

    Integer peopleCapacity;

    Integer kmH;

    Integer weight;

    Integer carryingCapacity;

    Integer rangeOfFlight;

    AirplaneType type;

    public Aircraft(Integer id, String name, Integer peopleCapacity, Integer carryingCapacity,Integer kmH,Integer weight,Integer rangeOfFlight,AirplaneType type) {

        if(name.isEmpty()){
            throw new NullPointerException("Имя не должен быть пустым!");
        }else if(peopleCapacity<0 || carryingCapacity <0 || rangeOfFlight < 0 || kmH<0 || weight <0){
            throw new IllegalArgumentException("Значения должны быть больше 0");
        }

        this.id = id;
        this.name = name;
        this.peopleCapacity = peopleCapacity;
        this.carryingCapacity = carryingCapacity;
        this.type = type;
        this.rangeOfFlight = rangeOfFlight;
        this.kmH = kmH;
        this.weight = weight;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPeopleCapacity() {
        return peopleCapacity;
    }

    public Integer getKmH() {
        return kmH;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getCarryingCapacity() {
        return carryingCapacity;
    }

    public Integer getRangeOfFlight() {
        return rangeOfFlight;
    }

    public AirplaneType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", peopleCapacity=" + peopleCapacity +
                ", kmH=" + kmH +
                ", weight=" + weight +
                ", carryingCapacity=" + carryingCapacity +
                ", rangeOfFlight=" + rangeOfFlight +
                ", type=" + type +
                '}';
    }
}
