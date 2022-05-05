/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Observer Order Data Class
*/

import java.util.List;
import java.util.ArrayList;

public class OrderData implements Orders {
    private List<Observer> observers;
    private double points;
    private double cost;
    private String status;
    private boolean favorite;
    private String description;

    
    //Observer Display Elements
    public OrderData() {
        observers = new ArrayList<Observer>();
    }
    
    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(points, cost, status, favorite, description);
        }
    }

    public void measurmentsChanged() {
        notifyObservers();
    }

    public void setOrder(double points, double cost, String status, boolean favorite, String description) {
        this.points = points;
        this.cost = cost;
        this.status = status;
        this.favorite = favorite;
        this.description = description;
        measurmentsChanged();
    }


}