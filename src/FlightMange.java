import java.util.ArrayList;

public class FlightMange {




   static ArrayList<Flight> Flights = new ArrayList<>();

    public void addNewFlight(Flight flight){
        this.Flights.add(flight);
    }

    public static ArrayList<Flight> getFlights() {
        return Flights;
    }

    @Override
    public String toString() {
        return "FlightMange{}";
    }
}
