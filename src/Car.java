public class Car {
    private int ID;
    private int numberOfCar;

    @Override
    public String toString() {
        return "Car{" +
                "ID=" + ID +
                ", numberOfCar='" + numberOfCar + '\'' +
                '}';
    }

    public Car(int ID, int numberOfCar) {
        this.ID = ID;
        this.numberOfCar = numberOfCar;
    }

    public int getID() {
        return ID;
    }

    public int getNumberOfCar() {
        return numberOfCar;
    }
}
