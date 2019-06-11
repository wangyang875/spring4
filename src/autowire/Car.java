package autowire;

public class Car {
    private String brand;
    private String place;

    public Car(String brand, String place) {
        this.brand = brand;
        this.place = place;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", place='" + place + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
