/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Stawberry Fruit Pieces Decorator Other Beverage  Class
*/

public class Strawberry extends Fruit {
    public Strawberry(Other other) {
        this.other = other;
    }
    public String getDescription() {
        return other.getDescription() + ", Strawberry Pieces";
    }
    public double cost() {
        return other.cost() + 0.10;
    }
    public double points() {
        return other.points() + 0.20;
    }
}