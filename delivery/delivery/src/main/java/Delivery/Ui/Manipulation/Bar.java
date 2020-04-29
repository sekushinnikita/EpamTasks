package Delivery.Ui.Manipulation;

import Delivery.Entities.User;
import Delivery.Service.UserService;
import Delivery.Ui.Creating.ProductCreating;
import Delivery.Ui.Creating.UserCreating;


import java.util.Scanner;

public class Bar {
    public static void bar() {
        UserService serviceController = new UserService();
        UserCreating userCreating = new UserCreating();
        ProductCreating productCreating = new ProductCreating();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 to delete User");
            System.out.println("Press 2 to update User");
            System.out.println("Press 3 to create Order");
            System.out.println("Press 4 to exit");
            if (!scanner.hasNextInt()) {
                System.out.println("Bad input. Try again.");
                scanner.next();
                continue;
            }
            int bar = scanner.nextInt();
            switch (bar){
                case 1:{
                    User user = new User();
                    userCreating.setUser(user);
                    if (serviceController.entityExist(user)) {
                        System.out.println("User deleted");
                        serviceController.delete(user);
                        break;
                    }else {
                        System.out.println("Incorrect input. Try again.");
                        continue;
                    }
                }
                case 2:{
                    User user = new User();
                    userCreating.setUser(user);
                    if (serviceController.entityExist(user)){
                        System.out.println("User updating");
                        User userApdate = userCreating.setUser(user);
                        serviceController.update(user,userApdate);
                        System.out.println("User updated");
                        break;
                    }else {
                        System.out.println("Incorrect input. Try again.");
                        continue;
                    }
                }
                case 3:{
                    OrderCreation order = new OrderCreation();
                    order.createOrder();
                }
                case 4:{
                    break;
                }
                default:{
                    System.out.println("Incorrect input.Try again");
                }
            }
        }
    }
}
