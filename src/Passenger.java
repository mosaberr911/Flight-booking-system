public class Passenger {
    private  String ssn ;
    private  String name ;
    private  String passportId ;
    private  String nationality ;
    private  String Email ;

    // default constructor

    public Passenger(){
        this.ssn = "N/A" ;
        this.name = "N/A" ;
        this.passportId = "N/a" ;
        this.nationality = "N/A" ;
    }

    // parameterized constructor

    public Passenger(String ssn, String name, String passportId, String nationality , String Email) {
        this.ssn = ssn;
        this.name = name;
        this.passportId = passportId;
        this.nationality = nationality;
        this.Email = Email ;
    }

    // setters

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setEmail(String email) {
        Email = email;
    }
    // getters


    public String getSsn() {
        return ssn;
    }

    public String getName() {
        return name;
    }

    public String getPassportId() {
        return passportId;
    }

    public String getNationality() {
        return nationality;
    }

    public String getEmail() {
        return Email;
    }
    // passenger methods

    /*
    public NA searchFlights(){};
    public NA bookingFlight(){};
    public NA cancelBooking(){};
    public NA showFlightDetails(){};
    public NA showFlightsHistory(){};
   */


}

