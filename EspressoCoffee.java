/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Esoresso Coffee Beverage Class
*/
public class EspressoCoffee extends Coffee {

    public EspressoCoffee() {
        description = "EspressoCoffee";
    }

    public String getDescription() {
        return description;
    }
    
    public double cost() {
        return 2.00;
    }

    public double points() {
        return 4.00;
    }
}