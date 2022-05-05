/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    More Water Water Decorator Other Beverage  Class
*/

public class MoreWater extends Water {
    public MoreWater(Other other) {
        this.other = other;
    }
    public String getDescription() {
        return other.getDescription() + ", More Water";
    }
    public double cost() {
        return other.cost();
    }
    public double points() {
        return other.points() + 0.10;
    }
}