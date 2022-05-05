/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    House Roast Coffee Beverage Class
*/

public class HouseCoffee extends Coffee {

    public HouseCoffee() {
        description = "HouseCoffee, ";
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 1.20;
    }

    public double points() {
        return 2.40;
    }
}