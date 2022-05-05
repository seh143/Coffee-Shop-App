/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Oatmilk Milk Decorator Coffee Beverage  Class
*/

public class OatMilk extends Milk {
    public OatMilk(Coffee coffee) {
        this.coffee = coffee;
    }
    public String getDescription() {
        return coffee.getDescription() + ", OatMilk";
    }
    public double cost() {
        return coffee.cost() + 0.70;
    }
    public double points() {
        return coffee.points() + 1.40;
    }
}