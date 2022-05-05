/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Main Coffee Shop Class
*/

import java.util.Scanner;

public class ACoffeeShopApp {
    public static Other myOther;
    public static Coffee myCoffee;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //create order data and display element
        OrderData myOrder = new OrderData();
        Status myStatus = new Status(myOrder);

        double points = 0;
        double cost = 0;
        String status = "Nothing Ordered";
        boolean favorite = false;
        String description = "";
        
        //User Input
        String ans;
        do {
            System.out.print("Do you wish to order a beverage? (Yes/No) ");
            ans = input.next();
            if(ans.equalsIgnoreCase("Yes") || ans.equalsIgnoreCase("Y")){
                //call order user input sequence method
                String ans3;
                do {
                    System.out.print("Would you like a coffee or something else? (Coffee/Other) ");
                    ans3 = input.next();
                    if(ans3.equalsIgnoreCase("Coffee")) {
                        coffeeBev();

                        // set data measurments
                        status = "Ordered";
                        points = myCoffee.points();
                        cost = myCoffee.cost();
                        description = myCoffee.getDescription();
                        
                    } else if(ans3.equalsIgnoreCase("Other")) {
                        otherBev();

                        // set data measurments
                        status = "Ordered";
                        points = myOther.points();
                        cost = myOther.cost();
                        description = myOther.getDescription();
                       
                    } else {
                        System.out.println("Incorrect Form.");
                    }

                } while(!ans3.equalsIgnoreCase("Coffee") && !ans3.equalsIgnoreCase("Other")); 
                
                
                //is it a favorite?
                String ans2;
                favorite = false;
                
                do {
                    System.out.print("Is this a favorite drink? (Yes/No) ");
                    ans2 = input.next();
                    if(ans2.equalsIgnoreCase("Yes") || ans2.equalsIgnoreCase("Y")) {
                        favorite = true;
                    } else if (ans2.equalsIgnoreCase("No") || ans2.equalsIgnoreCase("n")) {
                        favorite = false;
                    } else {
                        System.out.println("Not a valid answer.");
                    }
                } while(!ans2.equalsIgnoreCase("No") && !ans2.equalsIgnoreCase("n") && !ans2.equalsIgnoreCase("Yes") && !ans2.equalsIgnoreCase("Y"));

                myOrder.setOrder(points, cost, status, favorite, description);
  
                
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("Waiting");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("Waiting");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");

                status = "Ready";
                myOrder.setOrder(points, cost, status, favorite, description); 

                System.out.println("Thank you! Please come again!");
            } else if(ans.equalsIgnoreCase("No") || ans.equalsIgnoreCase("n")) {
                System.out.println("Have a nice day!");
            } else {
                System.out.println("Error");
            }
        } while(!ans.equalsIgnoreCase("No") && !ans.equalsIgnoreCase("n"));  

    }


    
    //ordering type of coffee
    public static void coffeeBev() {
        String coffeeAns;
        do {
            System.out.print("Would you like a House, Dark, Blonde, Decaf, or Espresso Blend? ");
            coffeeAns = input.next();
            if(coffeeAns.equalsIgnoreCase("House")) {
                myCoffee = new HouseCoffee();
                coffeeAdd();
            } else if(coffeeAns.equalsIgnoreCase("Dark")) {
                myCoffee = new DarkCoffee();
                coffeeAdd();
            } else if(coffeeAns.equalsIgnoreCase("Blonde")) {
                myCoffee = new BlondeCoffee();
                coffeeAdd();
            } else if(coffeeAns.equalsIgnoreCase("Decaf")) {
                myCoffee = new DecafCoffee();
                coffeeAdd();
            } else if(coffeeAns.equalsIgnoreCase("Espresso")) {
                myCoffee = new EspressoCoffee();
                coffeeAdd();
            } else {
                System.out.println("Incorrect Form.");
            }
        } while (!coffeeAns.equalsIgnoreCase("House") && !coffeeAns.equalsIgnoreCase("Dark") && !coffeeAns.equalsIgnoreCase("Blonde") &&
                            !coffeeAns.equalsIgnoreCase("Decaf") && !coffeeAns.equalsIgnoreCase("Espresso"));
    }

    //ordering type of other types of beverages
    public static void otherBev() {
        String otherAns;
        do {    
            System.out.print("Would you like a Lemonade, GreenTea, BlackTea, WhiteTea, Kiwi, or Blueberry? ");
            otherAns = input.next();
            if(otherAns.equalsIgnoreCase("Lemonade")) {
                myOther = new Lemonade();
                System.out.println("Let's make a lemonade!");
                otherAdd();
            } else if(otherAns.equalsIgnoreCase("WhiteTea")) {
                myOther = new WhiteTea();
                System.out.println("Let's make a white tea!");
                otherAdd();
            } else if(otherAns.equalsIgnoreCase("GreenTea")) {
                myOther = new GreenTea();
                System.out.println("Let's make a green tea!");
                otherAdd();
            } else if(otherAns.equalsIgnoreCase("BlackTea")) {
                myOther = new BlackTea();
                System.out.println("Let's make a black tea!");
                otherAdd();
            } else if(otherAns.equalsIgnoreCase("Kiwi")) {
                myOther = new Kiwi();
                System.out.println("Let's make a kiwi drink!");
                otherAdd();
            } else if(otherAns.equalsIgnoreCase("Blueberry")) {
                myOther = new Blueberry();
                System.out.println("Let's make a blueberry drink!");
                otherAdd();
            } else {
                System.out.println("Incorrect Form.");
            }
        } while (!otherAns.equalsIgnoreCase("Lemonade") && !otherAns.equalsIgnoreCase("WhiteTea") && !otherAns.equalsIgnoreCase("GreenTea") &&
                            !otherAns.equalsIgnoreCase("Kiwi") && !otherAns.equalsIgnoreCase("Blueberry") && !otherAns.equalsIgnoreCase("BlackTea"));
    }

    //ordering addons for other beverages
    public static void otherAdd() {
        String ans;
        do {
            System.out.print("Would you like a flavor syrup? (Yes/No) ");
            ans = input.next();
            if(ans.equalsIgnoreCase("Yes") || ans.equalsIgnoreCase("Y")){
                //offer flavor syrups
                String ans2;
                do {
                    System.out.print("Would you like lemon, peach, or raspberry flavoring? ");
                    ans2 = input.next();
                    if(ans2.equalsIgnoreCase("lemon")) {
                        myOther = new Lemon(myOther);
                        System.out.println("Okay, We'll add the lemon flavor!");
                    } else if(ans2.equalsIgnoreCase("peach")) {
                        myOther = new Peach(myOther);
                        System.out.println("Okay, We'll add the peach flavor!");
                    } else if(ans2.equalsIgnoreCase("raspberry")) {
                        myOther = new Raspberry(myOther);
                        System.out.println("Okay, We'll add the raspberry flavor!");
                    } else {
                        
                        System.out.println("Sorry, but thats not an option.");
                    }
                } while(!ans2.equalsIgnoreCase("lemon") && !ans2.equalsIgnoreCase("peach") && !ans2.equalsIgnoreCase("raspberry"));
                //end flavor syrups
            } else if(ans.equalsIgnoreCase("No") || ans.equalsIgnoreCase("n")) {
                System.out.println("Okay. No flavor syrup.");
            } else {
                System.out.println("Please enter a yes or no answer.");
            }
        } while(!ans.equalsIgnoreCase("No") && !ans.equalsIgnoreCase("n") );

        String ans3;
        do {
            System.out.print("Would you like fruit pieces? (Yes/No) ");
            ans3 = input.next();
            if(ans3.equalsIgnoreCase("Yes") || ans3.equalsIgnoreCase("Y")){
                //offer fruit pieces
                String ans4;
                do{
                    System.out.print("Would you like strawberry or blackberry pieces? ");
                    ans4 = input.next();
                    if(ans4.equalsIgnoreCase("strawberry")) {
                        myOther = new Strawberry(myOther);
                        System.out.println("Okay, We'll add the strawberry pieces!");
                    } else if(ans4.equalsIgnoreCase("blackberry")) {
                        myOther = new Blackberry(myOther);
                        System.out.println("Okay, We'll add the blackberry pieces!");
                    } else {
                        System.out.println("Sorry, but thats not an option.");
                    }
                } while(!ans4.equalsIgnoreCase("strawberry") && !ans4.equalsIgnoreCase("blackberry")); 
                //end fruit pieces
            } else if(ans3.equalsIgnoreCase("No") || ans3.equalsIgnoreCase("n")) {
                System.out.println("Okay. No fruit pieces.");
            } else {
                System.out.println("Please enter a yes or no answer.");
            }
        } while(!ans3.equalsIgnoreCase("No") && !ans3.equalsIgnoreCase("n") );

        String ans5;
        do {
            System.out.print("Would you like more water/ice in your drink? (Yes/No) ");
            ans5 = input.next();
            if(ans5.equalsIgnoreCase("Yes") || ans.equalsIgnoreCase("Y")){
                //offer extra water or ice
                String ans6;
                do{
                    System.out.print("Would you like more ice or water? ");
                    ans6 = input.next();
                    if(ans6.equalsIgnoreCase("Water")) {
                        myOther = new MoreWater(myOther);
                        System.out.println("Okay, We'll add the extra water!");
                    } else if(ans6.equalsIgnoreCase("Ice")) {
                        myOther = new MoreIce(myOther);
                        System.out.println("Okay, We'll add the extra ice!");
                    } else {
                        System.out.println("Sorry, but thats not an option.");
                    }
                } while(!ans6.equalsIgnoreCase("ice") && !ans6.equalsIgnoreCase("water"));
                //end extra water/ice

            } else if(ans5.equalsIgnoreCase("No") || ans5.equalsIgnoreCase("n")) {
                System.out.println("Okay. No extra water/ice.");
            } else {
                System.out.println("Please enter a yes or no answer.");
            }
        } while(!ans5.equalsIgnoreCase("No") && !ans5.equalsIgnoreCase("n") );

    }


    //ordering addons for coffee
    public static void coffeeAdd() {
        String ans;
        do {
            System.out.print("Would you like a flavor syrup? (Yes/No) ");
            ans = input.next();
            if(ans.equalsIgnoreCase("Yes") || ans.equalsIgnoreCase("Y")){
                //offer flavor syrups
                String ans2;
                do {
                    System.out.print("Would you like caramel or mocha flavoring? ");
                    ans2 = input.next();
                    if(ans2.equalsIgnoreCase("caramel")) {
                        myCoffee = new Caramel(myCoffee);
                        System.out.println("Okay, We'll add the caramel flavor!");
                    } else if(ans2.equalsIgnoreCase("mocha")) {
                        myCoffee = new Mocha(myCoffee);
                        System.out.println("Okay, We'll add the mocha flavor!");
                    } else {
                        System.out.println("Sorry, but thats not an option.");
                    }
                } while(!ans2.equalsIgnoreCase("caramel") && !ans2.equalsIgnoreCase("mocha"));
                //end flavor syrups
            } else if(ans.equalsIgnoreCase("No") || ans.equalsIgnoreCase("n")) {
                System.out.println("Okay. No flavor syrup.");
            } else {
                System.out.println("Please enter a yes or no answer.");
            }
        } while(!ans.equalsIgnoreCase("No") && !ans.equalsIgnoreCase("n") );

        String ans3;
        do {
            //must answer hot or iced
            System.out.print("Would you like it hot or iced? ");
            ans3 = input.next();
            if(ans3.equalsIgnoreCase("Hot")){
                myCoffee = new Hot(myCoffee);
                System.out.println("Okay, we'll make that hot for you!");
            } else if(ans3.equalsIgnoreCase("Iced")) {
                myCoffee = new Iced(myCoffee);
                System.out.println("Okay, we'll make that iced for you");
            } else {
                System.out.println("Please answer either hot or iced.");
            }
        } while(!ans3.equalsIgnoreCase("hot") && !ans3.equalsIgnoreCase("iced") );

        String ans4;
        do {
            System.out.print("Would you like milk in your drink? (Yes/No) ");
            ans4 = input.next();
            if(ans4.equalsIgnoreCase("Yes") || ans4.equalsIgnoreCase("Y")){
                //offer extra water or ice
                String ans5;
                do{
                    System.out.print("Would you like oatmilk or wholemilk? ");
                    ans5 = input.next();
                    if(ans5.equalsIgnoreCase("oatmilk")) {
                        myCoffee = new OatMilk(myCoffee);
                        System.out.println("Okay, We'll add the oatmilk!");
                    } else if(ans5.equalsIgnoreCase("wholemilk")) {
                        myCoffee = new WholeMilk(myCoffee);
                        System.out.println("Okay, We'll add the whole milk!");
                    } else {
                        System.out.println("Sorry, but thats not an option.");
                    }
                } while(!ans5.equalsIgnoreCase("oatmilk") && !ans5.equalsIgnoreCase("wholemilk"));
                

            } else if(ans4.equalsIgnoreCase("No") || ans4.equalsIgnoreCase("n")) {
                System.out.println("Okay. No milk.");
            } else {
                System.out.println("Please enter a yes or no answer.");
            }
        } while(!ans4.equalsIgnoreCase("No") && !ans4.equalsIgnoreCase("n") );
    }


}