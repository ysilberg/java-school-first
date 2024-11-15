import java.util.ArrayList;
import java.util.List;

public class Train {
    private Engine engine;
    private List<Carriage> carriages;
    private int maxCarriages;

    public Train(Engine engine, int maxCarriages) {
        this.engine = engine;
        this.maxCarriages = maxCarriages;
        this.carriages = new ArrayList<>();
    }

    public void addCarriage(Carriage carriage) {
        if (carriages.size() < maxCarriages) {
            carriages.add(carriage);
        } else {
            System.out.println("Max carriages reached!");
        }
    }

    public Carriage getCarriageWithMostPassengers() {
        Carriage maxCarriage = null;
        int maxPassengers = 0;
        for (Carriage carriage : carriages) {
            if (carriage.getPassengerCount() > maxPassengers) {
                maxPassengers = carriage.getPassengerCount();
                maxCarriage = carriage;
            }
        }
        return maxCarriage;
    }

    public int getTotalPassengers() {
        int total = 0;
        for (Carriage carriage : carriages) {
            total += carriage.getPassengerCount();
        }
        return total;
    }

    public double getAveragePassengers() {
        if (carriages.isEmpty()) return 0;
        return (double) getTotalPassengers() / carriages.size();
    }

    public boolean hasAvailableSeats() {
        for (Carriage carriage : carriages) {
            if (carriage.hasAvailableSeats()) return true;
        }
        return false;
    }
}
