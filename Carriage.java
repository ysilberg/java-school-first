import java.util.ArrayList;
import java.util.List;

public class Carriage {
    private List<String> passengers;
    private int maxSeats;

    public Carriage(int maxSeats) {
        this.passengers = new ArrayList<>();
        this.maxSeats = maxSeats;
    }

    public void addPassenger(String passenger) {
        if (passengers.size() < maxSeats) {
            passengers.add(passenger);
        } else {
            System.out.println("No available seats!");
        }
    }

    public int getPassengerCount() {
        return passengers.size();
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public boolean hasAvailableSeats() {
        return passengers.size() < maxSeats;
    }
}
