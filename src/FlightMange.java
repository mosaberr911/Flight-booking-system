import java.util.ArrayList;
import java.util.stream.Collectors;


public class FlightMange {
    

   private static ArrayList<Flight> Flights = new ArrayList<>();







    // method to add a new flight

    public void addNewFlight(Flight flight){
        this.Flights.add(flight);
    }

    // method to cancel a flight via flight id

    public void cancelFlight(String Id){
       Flights = Flights.stream()
               .filter(flight -> !Id.equals( flight.getFlightId()) )
               .collect(Collectors.toCollection(ArrayList::new));
    }

    // getter

    public static ArrayList<Flight> getFlights() {
        return Flights;
    }


}
