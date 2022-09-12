public class Car {
    private int ID;
    private String numberOfCar;

    @Override
    public String toString() {
        return "Car{" +
                "ID=" + ID +
                ", numberOfCar='" + numberOfCar + '\'' +
                '}';
    }

    public Car(int ID, String numberOfCar) {
        this.ID = ID;
        this.numberOfCar = numberOfCar;
    }

    public int getID() {
        return ID;
    }

    public String getNumberOfCar() {
        return numberOfCar;
    }
}
