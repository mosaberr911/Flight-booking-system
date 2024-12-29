import java.util.ArrayList;
import java.time.LocalDate;
import java.util.UUID;

public class Flight {
    private String flightId  ;
    private String arrivalAirport ;
    private String departureAirport ;
    private LocalDate arrivalDate ;
    private LocalDate departureDate ;

    // default constructor

    public Flight() {
        this.flightId = "N/A" ;
        this.arrivalAirport = "NA" ;
        this.departureAirport = "NA" ;
        this.arrivalDate = null ;
        this.departureDate =null ;
    }

    // parameterized constructor

    public Flight(String flightId, String arrivalAirport, String departureAirport, LocalDate arrivalDate, LocalDate departureDate) {
        this.flightId = flightId;
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
    }

    // setters

    // Use UUID class to generate unique flight id

    public void setFlightId() {
        this.flightId = 'A' + UUID.randomUUID().toString().substring( 0 , 6 ) ;
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

    public String getFlightId() {
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

    // override toString method to print Flights arraylist

    @Override
    public String toString() {
        return "Flight{" +
                "flightId='" + flightId + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalDate=" + arrivalDate +
                ", departureDate=" + departureDate +
                '}';
    }

    public String displayFlightDetails(){
        return "Flight id : " + flightId + "\n"
                +"Departure Airport : " + departureAirport + "\n"
                +"Arrival Airport : " + arrivalAirport + "\n"
                +"Departure Date : " + departureDate + "\n"
                +"Arrival Date : " + arrivalDate + "\n" ;
    }
}
