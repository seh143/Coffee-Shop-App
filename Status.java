/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Order Data Status Display Observer Class
*/

public class Status implements Observer, Display {
    private OrderData data;
    private double points;
    private double cost;
    private String status;
    private boolean favorite;
    private String description;

    public Status(OrderData orderData) {
        this.data = orderData;
        data.registerObserver(this);
    }

    public void update(double points, double cost, String status, boolean favorite, String description) {
        this.points = points;
        this.status = status;
        this.cost = cost;
        this.favorite = favorite;
        this.description = description;
        display();
    }

    public void display() {
        System.out.println("Order Status: " + status);
        System.out.println("Points Earned: " + points);
        System.out.println("Cost: " + cost);

        System.out.println("In your favorites: " + favorite);
        System.out.println("Order Description: " + description);
    }
}