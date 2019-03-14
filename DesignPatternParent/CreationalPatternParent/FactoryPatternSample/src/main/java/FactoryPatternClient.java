

public class FactoryPatternClient {

    public static void main(String[] args) {
        CarFactory carFactoryAudi = new CarFactory();
        CarFactory carFactoryMercedes = new CarFactory();
        CarFactory carFactoryBMW = new CarFactory();


        System.out.println(carFactoryAudi.getCar("Audi", "A3", 1000));
        System.out.println(carFactoryBMW.getCar("BMW", "MSeries", 1200));
        System.out.println(carFactoryMercedes.getCar("Mercedes", "A180", 1100));
    }

}
