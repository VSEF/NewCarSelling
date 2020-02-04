import java.util.ArrayList;
import java.util.List;

public class Toyota extends Car{
    public Toyota(int id, String model, int year, String transmission, int price) {
        super(id, model, year, transmission, price);
    }
    static List<Toyota> toyotaListCreatedCars = new ArrayList<>();
    static List<Toyota> soldToyotaCarsList = new ArrayList<>();

    public  static void addNewToyotaCarForSelling(int id, String model, int year, String transmission, int price){
        toyotaListCreatedCars.add(new Toyota(id, model, year, transmission, price));
    }

    public  static void sellToyotaCar (int id, int year){
        for(Toyota toyota:toyotaListCreatedCars){
            if((toyota.getId()==id)) {
                soldToyotaCarsList.add(toyota);
            }
        }

        toyotaListCreatedCars.removeIf(toyota -> toyota.getId() == id && toyota.getYear() == year);
        System.out.println("The car - id: " + id + ", year: " + year + " was sold!");
    }

    public static void getListSoldToyotaCars(){
        System.out.println("The list of sold Toyota cars:");
        for(Toyota toyota:soldToyotaCarsList){
            System.out.println("id: "+toyota.getId() + ", year: " + toyota.getYear()+ ", model: " + toyota.getModel() + ", transmission: " + toyota.getTransmission() + ", price: $" + toyota.getPrice());
        }
    }

    public static void getTotalPriceToyotaCarsForSelling(){
        int price=0;
        for(Toyota toyota:toyotaListCreatedCars){
           price+=toyota.getPrice();
        }
        System.out.println("Total price Toyota cars for selling: $" + price);
    }

    public static void getTotalPriceSoldToyotaCars(){
        int price=0;
        for(Toyota toyota:soldToyotaCarsList){
            price+=toyota.getPrice();
        }
        System.out.println("Total price sold Toyota cars: $" + price);
    }

    public static void getListToyotaCarsForSelling(){
        System.out.println("The list of Toyota cars to sell:");
        for(Toyota toyota:toyotaListCreatedCars){
            System.out.println("id: "+toyota.getId() + ", year: " + toyota.getYear()+ ", model: " + toyota.getModel() + ", transmission: " + toyota.getTransmission() + ", price: $" + toyota.getPrice());
        }
    }

}
