/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Blacktea Other Beverage Class
*/

public class BlackTea extends Other {

    public BlackTea() {
        description = "BlackTea";
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 0.89;
    }

    public double points() {
        return 1.00;
    }
}