package stream;

import entities.Client;
import entities.Dish;

import java.util.*;

public class StreamController {
    public StreamController() {
    }
    public void isMoreThen10(List<Dish> lunch) {
         lunch.stream()
                .forEach(dish->{
                    if (dish.getPrice() > 10) {
                        System.out.println("This"+dish.toString()+"price more then 10");
                    } else {}
                });
    }

    public void max(List<Dish> lunch) {
        Optional<Dish> max_optional = lunch.stream().max(Comparator.comparingInt(Dish::getPrice));
        System.out.println( max_optional.orElse(new Dish()));
    }

    public void min(List<Dish> lunch) {
        Optional<Dish> min_optional = lunch.stream().min(Comparator.comparingInt(Dish::getPrice));
        System.out.println( min_optional.orElse(new Dish()));
    }

    public void onceBuyedDish(List<Dish> lunch){
        lunch.stream()
                .forEach(dish->{
                    if (dish.getClientList().size() == 1) {
                    System.out.println("This"+dish.toString()+"has one buyer");
                    } else {}
                });
    }
    public void popularitySorting(List<Dish> lunch){
        lunch.stream()
                .filter(dish->dish.getClientList().size() < 15)
                .sorted()
                .forEach(dish->System.out.println(dish));
    }

    public void printClientList(List<Client> clients){
        clients.stream()
                .forEach(client->{
                   System.out.println(client);
                });
    }
}