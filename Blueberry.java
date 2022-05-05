/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Blueberry Other Beverage Class
*/

public class Blueberry extends Other {

    public Blueberry() {
        description = "Blueberry";
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 1.60;
    }

    public double points() {
        return 3.00;
    }
}