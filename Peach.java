/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Peach Flavor Decorator Other Beverage  Class
*/

public class Peach extends OtherFlavor {
    public Peach(Other other) {
        this.other = other;
    }
    public String getDescription() {
        return other.getDescription() + ", Peach";
    }
    public double cost() {
        return other.cost() + 0.20;
    }
    public double points() {
        return other.points() + 0.40;
    }
}