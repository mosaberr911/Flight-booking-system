import java.util.ArrayList;
import java.time.LocalDate;

public class Flight {
    private int flightId  ;
    private String arrivalAirport ;
    private String departureAirport ;
    private LocalDate arrivalDate ;
    private LocalDate departureDate ;

    // default constructor

    public Flight() {
        this.flightId = 0 ;
        this.arrivalAirport = "NA" ;
        this.departureAirport = "NA" ;
        this.arrivalDate = null ;
        this.departureDate =null ;
    }

    // parameterized constructor

    public Flight(int flightId, String arrivalAirport, String departureAirport, LocalDate arrivalDate, LocalDate departureDate) {
        this.flightId = flightId;
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
    }

    // setters


    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    // getters

    public int getFlightId() {
        return flightId;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }
    // override tostring method to print Flights arraylists

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", arrivalAirport = '" + arrivalAirport + '\'' +
                ", departureAirport = '" + departureAirport + '\'' +
                ", arrivalDate = " + arrivalDate +
                ", departureDate = " + departureDate +
                '}';
    }
}
