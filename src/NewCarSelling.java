public class NewCarSelling {

    public static void main(String[] args) {

        Toyota.addNewToyotaCarForSelling(1,"corolla",2019,"auto", 15000);

        Toyota.addNewToyotaCarForSelling(2,"camry",2020,"auto", 23000);

        Toyota.addNewToyotaCarForSelling(3,"prius",2019,"auto", 17000);

        Toyota.addNewToyotaCarForSelling(4,"rav4",2020,"auto", 25000);

        Toyota.getTotalPriceToyotaCarsForSelling();

        Toyota.getListToyotaCarsForSelling();

        Toyota.sellToyotaCar(2,2020);

        Toyota.getListToyotaCarsForSelling();

        Toyota.getListSoldToyotaCars();

        Toyota.getTotalPriceToyotaCarsForSelling();

        Toyota.getTotalPriceSoldToyotaCars();
    }

}
