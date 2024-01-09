public class Main {
    public static void main (String[] args) {
        Car car = new Car(35, 0);
        while (true) {
            try {
                car.drive100km();
            } catch(NotEnoughGas e) {
                System.err.println(e.getMessage());
                car.fill();
            }
        }
    }
}