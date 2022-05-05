/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Raspberry Flavor Decorator Other Beverage  Class
*/

public class Raspberry extends OtherFlavor {
    public Raspberry(Other other) {
        this.other = other;
    }
    public String getDescription() {
        return other.getDescription() + ", Raspberry";
    }
    public double cost() {
        return other.cost() + 0.30;
    }
    public double points() {
        return other.points() + 0.60;
    }
}