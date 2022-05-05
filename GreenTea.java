/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    GreenTea Other Bevrage Class
*/

public class GreenTea extends Other {

    public GreenTea() {
        description = "GreenTea";
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 1.09;
    }

    public double points() {
        return 2.00;
    }
}