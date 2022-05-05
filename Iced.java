/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Iced Tempurature Coffee Beverage Decorator Class
*/

public class Iced extends Temperature {
    public Iced(Coffee coffee) {
        this.coffee = coffee;
    }
    public String getDescription() {
        return coffee.getDescription() + ", Iced";
    }
    public double cost() {
        return coffee.cost() + 0.15;
    }
    public double points() {
        return coffee.points() + 0.30;
    }
}