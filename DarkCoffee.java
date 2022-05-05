/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Dark Roast Coffee Beverage Class
*/

public class DarkCoffee extends Coffee {

    public DarkCoffee() {
        description = "DarkCoffee";
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 1.10;
    }

    public double points() {
        return 2.20;
    }
}