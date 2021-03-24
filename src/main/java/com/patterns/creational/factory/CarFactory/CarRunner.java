public class CarRunner {
    public static void main(String[] args) {
        CarMaker carMaker = createCarByBrand("Kia");
        Car car;
        car = carMaker.createCar();

        car.drive();
    }

    public static CarMaker createCarByBrand(String brand) {
        if (brand.equalsIgnoreCase("honda"))
            return new HondaMaker();
        else if (brand.equalsIgnoreCase("kia"))
            return new KiaMaker();
        else if (brand.equalsIgnoreCase("nissan"))
            return new NissanMaker();
        throw new RuntimeException(brand + " is unknown brand");
    }
}
