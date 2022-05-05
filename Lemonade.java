/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Lemonade Other Beverage Class
*/

public class Lemonade extends Other {

    public Lemonade() {
        description = "Lemonade";
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