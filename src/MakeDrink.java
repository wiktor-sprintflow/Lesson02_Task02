public class MakeDrink {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Cuba Libre";
        drink1.price = 15;
        drink1.containsAlcohol = true;

        drink1.drinkFirstComponent = new Component();
        drink1.drinkFirstComponent.name = "Rum";
        drink1.drinkFirstComponent.volume = 50;

        drink1.drinkSecondComponent = new Component();
        drink1.drinkSecondComponent.name = "Coca Cola";
        drink1.drinkSecondComponent.volume = 120;

        drink1.drinkThirdComponent = new Component();
        drink1.drinkThirdComponent.name = "Sok z limonki";
        drink1.drinkThirdComponent.volume = 10;

        System.out.println("Drink '" + drink1.name + "' kosztuje " + drink1.price + " PLN i zawiera alkohol (" + drink1.containsAlcohol + ")");
        System.out.println("W skład drinka wchodzą następujące składniki:\n" +
                "\t - " + drink1.drinkFirstComponent.name + " " + drink1.drinkFirstComponent.volume + " ml\n" +
                "\t - " + drink1.drinkSecondComponent.name + " " + drink1.drinkSecondComponent.volume + " ml\n" +
                "\t - " + drink1.drinkThirdComponent.name + " " + drink1.drinkThirdComponent.volume + " ml");

        drink1.totalDrinkVolume = drink1.drinkFirstComponent.volume + drink1.drinkSecondComponent.volume + drink1.drinkThirdComponent.volume;

        System.out.println("Całkowita pojemność drinka to: " + drink1.totalDrinkVolume + " ml.");
    }
}