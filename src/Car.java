public class Car {
    private int id;
    private String model;
    private String make;
    private int year;
    private String transmission;
    int price;

    public Car(int id, String model, int year, String transmission, int price) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.transmission = transmission;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }


    public int getYear() {
        return year;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getPrice() {
        return price;
    }

}
