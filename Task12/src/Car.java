import java.util.Random;

public class Car {
    private int fuelAmount;
    private int distanceDriven;

    public Car(int fuelAmount, int distanceDriven){
        this.fuelAmount = fuelAmount;
        this.distanceDriven = distanceDriven;
    }

    public Car(){
        this.fuelAmount = 35;
        this.distanceDriven = 0;
    }

    public void fill(){
        Random random = new Random();
        int roulette = random.nextInt(10);
        if (roulette == 1){
            throw new Explosion("BOOM");
        } else {
            this.fuelAmount += 15 + random.nextInt(21);
            System.err.println("After filling " + this.fuelAmount);
        }
    }

    public void drive100km() throws NotEnoughGas{
        if (this.fuelAmount < 10){
            throw new NotEnoughGas("Not enough gas");
        } else {
            this.fuelAmount -= 10;
            this.distanceDriven += 100;
            System.err.println("You've driven" + this.distanceDriven + "km and you have " + this.fuelAmount + "l of fuel left.");
        }
    }
}
