/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    White Tea Other Beverage  Class
*/
public class WhiteTea extends Other {

    public WhiteTea() {
        description = "WhiteTea";
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 0.99;
    }

    public double points() {
        return 2.00;
    }
}