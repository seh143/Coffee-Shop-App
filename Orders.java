/*  
    @author: Sarah Houston
    @project: CoffeeShopApp

    Orders Interface
*/

public interface Orders {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}