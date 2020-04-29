package Delivery.Ui.Manipulation;

import Delivery.Entities.Address;
import Delivery.Entities.Production;
import Delivery.Entities.User;
import Delivery.Service.ProductionService;
import Delivery.Ui.Creating.ProductCreating;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderCreation {
    public void createOrder() {
        ProductCreating productCreating = new ProductCreating();
        ProductionService serviceController = new ProductionService();
        Scanner scanner = new Scanner(System.in);
        Production production = new Production();
        ArrayList<Production> order = new ArrayList<>();
        System.out.println("What do you wish to add in order?");
        while (true) {
            System.out.println("Press 1 to add product");
            System.out.println("Press 2 to end creating Order");
            if (!scanner.hasNextInt()) {
                System.out.println("Bad input. Try again.");
                scanner.next();
                continue;
            }
            int bar = scanner.nextInt();
            switch (bar) {
                case 1: {
                    ArrayList<Production> productionList = serviceController.getDAOdata();
                    for (Production product : productionList) {
                        System.out.println(product.toString());
                    }
                    Production newProduct = new Production();
                    productCreating.setProduct(newProduct);
                    if (serviceController.entityExist(newProduct)) {
                        System.out.println("Product added.");
                        order.add(newProduct);
                        continue;
                    }else {
                        serviceController.create(newProduct);
                        System.out.println("Product added.");
                        order.add(newProduct);
                        continue;
                    }
                }
                case 2: {
                    System.out.println("Input delivery place.");
                    Address address = new Address();
                    address.setCountry(scanner.nextLine());
                    address.setTown(scanner.nextLine());
                    address.setStreet(scanner.nextLine());
                    address.setHouse(scanner.nextLine());
                    System.out.println("Your order:");
                    for (Production product:order){
                        System.out.println(product.toString());
                    }
                    System.out.println("Will be deliver in:" + address.toString());
                }
                default:{
                    System.out.println("Incorrect input.Try again");
                }
            }
        }
    }
}

