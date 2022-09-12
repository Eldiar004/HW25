import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1,4343);
        Car car2 = new Car(2,7654);
        Car car3 = new Car(3,3456);
        InformationOfCar informationOfCar1 = new InformationOfCar(2000,"Audi R8",12000,"Blue");
        InformationOfCar informationOfCar2 = new InformationOfCar(2010,"Mersedes S-Class",20000,"White");
        InformationOfCar informationOfCar3 = new InformationOfCar(2017,"BMW X6",7000,"Red");
        HashMap<Car,InformationOfCar> hashMap = new HashMap<>();
        hashMap.put(car1,informationOfCar1);
        hashMap.put(car2,informationOfCar2);
        hashMap.put(car3,informationOfCar3);
        for (Map.Entry e :hashMap.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}