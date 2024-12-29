import Enums.SeatClass;

public class Seat {
    private int seatNumber ;
    private String seatClass ;
    private boolean isReserved ;

    // default constructor

    public Seat() {
        this.seatNumber = 0 ;
        this.isReserved = false ;
        this.seatClass = "N/A" ;
    }

    // parametrized constructor

    public Seat(int seatNumber, String seatClass, boolean isReserved) {
        this.seatNumber = seatNumber;
        this.seatClass = seatClass;
        this.isReserved = isReserved;
    }

    // setters


    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    // getters

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public boolean isReserved() {
        return isReserved;
    }


}
