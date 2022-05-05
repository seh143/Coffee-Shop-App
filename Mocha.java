/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Mocha Flavor Coffee Beverage Decorator Class
*/

public class Mocha extends Flavor {
    public Mocha(Coffee coffee) {
        this.coffee = coffee;
    }
    public String getDescription() {
        return coffee.getDescription() + ", Mocha";
    }
    public double cost() {
        return coffee.cost() + 0.50;
    }
    public double points() {
        return coffee.points() + 1.00;
    }
}