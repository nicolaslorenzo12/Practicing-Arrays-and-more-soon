package practice;
import java.util.Scanner;
import java.util.ArrayList;

public class BarService {

    private final String[] beers;
    private ArrayList<String> beersOrdered;
    private Scanner keyboard;

    public BarService(){
        beers = new String[]{"Bush Beer", "Duvel", "La Chouffe", "Chimay"};
        beersOrdered = new ArrayList<>();
        keyboard = new Scanner(System.in);
    }
    public void printingTheMenu(){
        System.out.println("This is the menu: ");

        for(int x = 0; x < beers.length; x++){
            System.out.println(beers[x]);
        }
    }
    public void printingTheOrder(){
        System.out.println(orderingBeers());
    }

    private String orderingBeers(){
        String beer = " ";
        boolean beerFound = false;
        while(!beer.equals("exit")){

            System.out.print("What kind of beer do you want?: ");
            beer = keyboard.nextLine();

            for(int x = 0; x< beers.length; x++){
                if(beer.equals(beers[x])){
                    System.out.println(beers[x] + " has been added to your order");
                    beersOrdered.add(beers[x]);
                    x = beers.length;
                    beerFound = true;
                }
            }
            if(!beerFound && !beer.equals("exit")){
                System.out.println("You should choose a beer of the menu");
            }
            beerFound = false;
        }
        return "Your order is: " + beersOrdered;
    }
}
