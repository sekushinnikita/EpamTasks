package Delivery.Ui.Creating;

import Delivery.Entities.Production;
import Delivery.Ui.Reading.Reader;

import static Delivery.Ui.Validation.ProductValidation.isNameValid;
import static Delivery.Ui.Validation.ProductValidation.isWeightValid;

public class ProductCreating {

    public static Production setProduct(Production production){
        Reader reader = new Reader();
        Production product = new Production();
        System.out.println("Input name:");
        String name = reader.readString(System.in);
        while(!isNameValid(name)) {
            System.out.println("Incorrect input.Try again: ");
            name = reader.readString(System.in);
        }
        product.setName(name);
        System.out.println("Input weight:");
        Integer weight = reader.readInteger(System.in);
        while(!isWeightValid(weight)) {
            System.out.println("Incorrect input.Try again: ");
            weight = reader.readInteger(System.in);
        }
        product.setWeight(weight);
        product.setVolume();
        return product;
    }
}
