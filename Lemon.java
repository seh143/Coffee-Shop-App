/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Lemon Other Beverage Flavor Decorator Class
*/

public class Lemon extends OtherFlavor {
    public Lemon(Other other) {
        this.other = other;
    }
    public String getDescription() {
        return other.getDescription() + ", Lemon";
    }
    public double cost() {
        return other.cost() + 0.10;
    }
    public double points() {
        return other.points() + 0.20;
    }
}