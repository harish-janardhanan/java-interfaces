public class CarFactory {

    public  CarFactory(){}

    public ICar getCar(String brand, String name, int capacity) throws RuntimeException{
        return createAndGetCar(brand,name,capacity);
     }

    private ICar createAndGetCar(String brand, String name, int capacity){
        if ("AUDI".equalsIgnoreCase(brand)) {
            return new AudiA3(brand, name, capacity);
        }
        else if ("BMW".equalsIgnoreCase(brand)){
            return new BMW1Series(brand,name,capacity);
        }
        else if ("MERCEDES".equalsIgnoreCase(brand)){
            return new MercedesA180(brand,name,capacity);
        }
        else {
            throw new AdapterSampleRuntimeException("Exception Occured", new Throwable("No Models Found for the brand"));
        }
    }
}
