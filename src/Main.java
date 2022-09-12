import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Car,InformationOfCar> hashMap = new HashMap<>();
        hashMap.put(new Car(1,"32rew"),new InformationOfCar(2000,"R8",12000,"Blue"));
        hashMap.put(new Car(2,"r454t"),new InformationOfCar(2010,"S-Class",20000,"White"));
        hashMap.put(new Car(3,"w132u"),new InformationOfCar(1995,"E55",7000,"Red"));
        System.out.println(hashMap.entrySet());

    }
}