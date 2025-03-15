package arr.lch;

public class Car {
    private String name;
    private int price;
    private int year;

    private Car(String name, int price, int year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public static Car createCar(String name, int price, int year){
        return new Car(name,price,year);
    }
}
