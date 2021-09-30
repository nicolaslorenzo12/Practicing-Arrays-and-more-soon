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

    public void printTheMenu(){
        System.out.println("This is the menu: ");

        for(int x = 0; x < beers.length; x++){
            System.out.println(beers[x]);
        }
    }

    public void printTheOrder(){
        System.out.println(orderBeers());
    }

    private String orderBeers(){
        String beer = "";
        while(!beer.equals("exit")){

            System.out.print("What kind of beer do you want?: ");
            beer = keyboard.nextLine();
            boolean beerFound = false;
            int counter = 0;
            while(!beerFound && counter < 4 ){

                if(beer.equals(beers[counter])){
                    System.out.println(beers[counter] + " has been added to your order");
                    beersOrdered.add(beers[counter]);
                    counter = beers.length;
                    beerFound = true;
                }
                counter++;
            }

            if(!beerFound && !beer.equals("exit")){
                System.out.println("You should choose a beer of the menu");
            }

            beerFound = false;
        }
        return "Your order is: " + beersOrdered;
    }
}
