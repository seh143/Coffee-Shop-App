/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Other Beverage Class
*/

public abstract class Other {
    String description;

    public Other() {
        description = "Other";
    }

    public String getDescription() {
        return description;
    }
    public abstract double cost();

    public abstract double points();

}