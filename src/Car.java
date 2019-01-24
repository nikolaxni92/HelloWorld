
public class Car {

    int maxSpeed = 180;
    double weight = 1340.43;
    boolean isTheCarOn = false;
    String model = "Audi";

    double maxFuel = 100;
    double currentFeul = 50;
    int consumption = 5; //per 100 km
    double mileagePassed = 2000;

    public void printVariables() {
    System.out.println("Maksimalna brzina: " +maxSpeed);
      System.out.println("Tezina: " +weight);
        System.out.println(isTheCarOn);
          System.out.println(model);
            System.out.println(maxFuel);
              System.out.println(currentFeul);
                System.out.println(consumption);
                  System.out.println(mileagePassed);
        
    }

}
