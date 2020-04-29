package Delivery.Ui.Run;

import Delivery.Entities.User;
import Delivery.Service.UserService;
import Delivery.Ui.Creating.UserCreating;
import Delivery.Ui.Manipulation.Bar;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        UserService serviceController = new UserService();
        UserCreating userCreating = new UserCreating();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 to Create User");
            System.out.println("Press 2 to Login");
            System.out.println("Press 3 to Exit");
            if (!scanner.hasNextInt()) {
                System.out.println("Incorrect input. Try again.");
                scanner.next();
                continue;
            }
            int menu = scanner.nextInt();
            switch (menu) {
                case 1: {
                    User user = new User();
                    userCreating.setUser(user);
                    if (serviceController.entityExist(user)) {
                        System.out.println("User already exist");
                        continue;
                    }else
                    serviceController.create(user);
                    System.out.println("Welcome");
                    Bar bar = new Bar();
                    bar.bar();
                }
                case 2: {
                    User user = new User();
                    userCreating.setUser(user);
                    if (serviceController.entityExist(user)) {
                        System.out.println("Welcome");
                        Bar bar = new Bar();
                        bar.bar();
                    } else {
                        System.out.println("Incorrect.Try again.");
                        continue;
                    }
                }
                case 3:{
                     break;
                }
                default:{
                    System.out.println("Incorrect input. Try again.");
                }
            }
        }
    }
}