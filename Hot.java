/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Hot Tempurature Coffee Beverage Decorator Class
*/

public class Hot extends Temperature {
    public Hot(Coffee coffee) {
        this.coffee = coffee;
    }
    public String getDescription() {
        return coffee.getDescription() + ", Hot";
    }
    public double cost() {
        return coffee.cost() + 0.10;
    }
    public double points() {
        return coffee.points() + 0.20;
    }
}