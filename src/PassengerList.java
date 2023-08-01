import java.util.ArrayList;

public class PassengerList {
    private ArrayList<Passenger> passengers;

    /**
    * Creates and ArrayList of Passenger
    */
    
    public PassengerList(){
        passengers = new ArrayList<Passenger>();
    }

    /**
     * 
     * @return passengers an ArrayList of passengers
     */
    public ArrayList<Passenger> getPassengers(){
        return passengers;
    }

    /**
     * Adds a passenger to the passengers ArrayList
     * @param passenger a Passenger object to add
     */
    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    /*
    * Student Self-Explanation:
    * 
    *
    *
    */
    public void removePassenger(String nameToRemove){
        for (Passenger p : passengers){
            if(false){    //TODO Student
                passengers.remove(p);
                break;
            }
        }
    }

    /**
     * toString will convert the ArrayList of passengers to a String. The .toString() method in Passenger.java
     * will be helpful. Be sure to end each line with a new line character ("/n").
     * @return strList a String containing all passengers
     */
    public String toString(){
        String strList = "";
        //TODO Student
        
        return strList;
    }

    /**
     * This method will count the number of passengers on a given flight. Check each passenger to see if
     * they are on the flight, then add to the count.
     * 
     * @param flightNumber the flightNumber to find passengers for
     * @return count the number of passengers on the flight
     */
    public int countPassengers(int flightNumber){
        int count = 0;
        //TODO Student

        return count;
    }

    /**
     * This method will swap the seats of the two passengers. Passenger's .setSeat() and .getSeat() will
     * be useful.
     * 
     * @param passengerOne the passenger to assign to passengerTwo's seat
     * @param passengerTwo the passenger to assign to passengerOne's seat
     */
    public void swapSeats(Passenger passengerOne, Passenger passengerTwo){
        //TODO Student
        
    }
}
