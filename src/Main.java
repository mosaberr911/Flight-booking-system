import Enums.SeatClass;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight("A4332" ,"Cairo Airport" ,"Hael Airport", LocalDate.ofYearDay(2024,  28),LocalDate.ofYearDay(2024,  29));
        Flight flight1 = new Flight("A4332" ,"Cairo Airport" ,"Hael Airport", LocalDate.ofYearDay(2024,  28),LocalDate.ofYearDay(2024,  29));
        FlightMange mange = new FlightMange();
        mange.addNewFlight(flight);
        mange.addNewFlight(flight1);

        System.out.println(FlightMange.getFlights());

    }

}