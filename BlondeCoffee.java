/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Blonde Roast Coffee Beverage Class
*/

public class BlondeCoffee extends Coffee {

    public BlondeCoffee() {
        description = "BlondeCoffee";
        
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 1.30;
    }

    public double points() {
        return 2.60;
    }
}