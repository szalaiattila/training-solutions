package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {
    private final Boat boat;
    private final LocalDate sailing;
    private final double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }
    public void bookPassenger(Passenger passenger) {
        if(passengers.size() < boat.getMaxPassengers()) {
            passengers.add(passenger);
        } else {
            throw new IllegalArgumentException("Megtelt!");
        }

    }

    public double getPriceForPassenger(Passenger passenger) {
        double result = 0;
        if(passenger.getCruiseClass() == CruiseClass.LUXURY) {
            result = basicPrice * 3.0;
        }
        if(passenger.getCruiseClass() == CruiseClass.FIRST) {
            result = basicPrice * 1.8;
        }
        if(passenger.getCruiseClass() == CruiseClass.SECOND) {
            result = basicPrice * 1.0;
        }

        return result;
    }

    public Passenger findPassengerByName(String name) {
        for(Passenger passenger : passengers) {
            if (passenger.getName().equals(name)) {
                return passenger;
            }
        }
        throw new IllegalArgumentException("Utas nem található!");
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> result = new ArrayList<>();
        for(Passenger passenger : passengers) {
            result.add(passenger.getName());
        }
        Collections.sort(result);
        return result;
    }

    public double sumAllBookingsCharged() {
        double result = 0;
        for(Passenger passenger : passengers) {
            result +=  getPriceForPassenger(passenger);
        }
        return result;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> result = new HashMap<>();
        for(Passenger passenger : passengers) {
            if(!result.containsKey(passenger.getCruiseClass())) {
                result.put(passenger.getCruiseClass(),0);
            }
            int counter = result.get(passenger.getCruiseClass());
            result.put(passenger.getCruiseClass(), counter + 1);
        }
        return result;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

}