package run;

import java.util.Arrays;
import java.util.List;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import entities.Client;
import entities.Dish;
import stream.StreamController;


public class Main {
    //private static final Logger log = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args){
        Client nikita = new Client("Nikita","here");
        Client artem = new Client("Artem","there");
        Dish dish = new Dish("fish",200, Arrays.asList(nikita));
        Dish dish2 = new Dish("apple",8, Arrays.asList(nikita));
        Dish dish3 = new Dish("shark",50, Arrays.asList(artem));
        Dish dish4 = new Dish("water",6, Arrays.asList(nikita));
        nikita.setLunch(Arrays.asList(dish,dish2));
        artem.setLunch(Arrays.asList(dish3,dish4));
        List<Dish> dishes = Arrays.asList(dish,dish2,dish3,dish4);//список блюд
        StreamController stream = new StreamController();
        stream.isMoreThen10(dishes);
        stream.max(dishes);
        stream.min(dishes);
        stream.onceBuyedDish(dishes);
        //stream.popularitySorting(dishes);
        List<Client> clients = Arrays.asList(nikita,artem);//список клиентов
        stream.printClientList(clients);
    }
}