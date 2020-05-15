package entities;
import java.util.ArrayList;
import java.util.List;

public class Dish {
    private String name;
    private int price;
    private List<Enum> componentList;
    private List<Client> clientList;

    public Dish() {
    }

    public Dish(String name, int price, List<Client> clientList) {
        this.clientList = clientList;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Enum> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<Enum> componentList) {
        this.componentList = componentList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                "price='" + price + '\'' +
                '}';
    }

    enum Enum{
        a,b,c,d,e;
    }
}