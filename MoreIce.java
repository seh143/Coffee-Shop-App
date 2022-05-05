/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    More Ice Water Decorator Other Beverage  Class
*/
public class MoreIce extends Water {
    public MoreIce(Other other) {
        this.other = other;
    }
    public String getDescription() {
        return other.getDescription() + ", More Ice";
    }
    public double cost() {
        return other.cost();
    }
    public double points() {
        return other.points() + 0.05;
    }
}