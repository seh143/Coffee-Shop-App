/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Blueberry Fruit Pieces Class
*/

public class Blackberry extends Fruit {
    public Blackberry(Other other) {
        this.other = other;
    }
    public String getDescription() {
        return other.getDescription() + ", Blackberry Pieces";
    }
    public double cost() {
        return other.cost() + 0.15;
    }
    public double points() {
        return other.points() + 0.30;
    }
}