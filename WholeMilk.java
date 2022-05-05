/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Wholemilke Milk Decorator Coffee Beverage  Class
*/

public class WholeMilk extends Milk {
    public WholeMilk(Coffee coffee) {
        this.coffee = coffee;
    }
    public String getDescription() {
        return coffee.getDescription() + ", Whole Milk";
    }
    public double cost() {
        return coffee.cost();
    }
    public double points() {
        return coffee.points() + 0.20;
    }
}