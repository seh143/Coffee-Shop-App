/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Decaf Roast  Coffee Beverage Class
*/

public class DecafCoffee extends Coffee {

    public DecafCoffee() {
        description = "DecafCoffee";
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 1.00;
    }

    public double points() {
        return 2.00;
    }
}