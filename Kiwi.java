/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Kiwi Other Beverage Class
*/

public class Kiwi extends Other {

    public Kiwi() {
        description = "Kiwi";
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 1.50;
    }

    public double points() {
        return 3.00;
    }
}