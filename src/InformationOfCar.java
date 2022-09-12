public class InformationOfCar {
    private int yearOfRelease;
    private String model;
    private int price;
    private String color;

    @Override
    public String toString() {
        return "InformationOfCar{" +
                "yearOfRelease=" + yearOfRelease +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public InformationOfCar(int yearOfRelease, String model, int price, String color) {
        this.yearOfRelease = yearOfRelease;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public InformationOfCar(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
