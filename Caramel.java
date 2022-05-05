/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Caramel Flavor for Coffee Beverages
*/

public class Caramel extends Flavor {
    public Caramel(Coffee coffee) {
        this.coffee = coffee;
    }
    public String getDescription() {
        return coffee.getDescription() + ", Caramel";
    }
    public double cost() {
        return coffee.cost() + 0.40;
    }
    public double points() {
        return coffee.points() + 0.80;
    }
}