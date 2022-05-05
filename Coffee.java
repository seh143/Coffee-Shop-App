/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Coffee Beverage Class
*/

public abstract class Coffee {
    String description;

    public Coffee() {
        description = "Coffee";
    }

    public String getDescription() {
        return description;
    }
    public abstract double cost();

    public abstract double points();

}