package Delivery.Ui.Creating;

import Delivery.Collection.Gender;
import Delivery.Entities.User;
import Delivery.Ui.Reading.Reader;


import static Delivery.Ui.Validation.UserValidation.*;

public class UserCreating {

    public static User setUser(User user) {
        Reader reader = new Reader();
        System.out.println("Input first name:");
        String name = reader.readString(System.in);
        while(!isFirstNameValid(name)) {
            System.out.println("Incorrect input.Try again: ");
            name = reader.readString(System.in);
        }
        user.setFirstName(name);
        System.out.println("Input last name:");
        name = reader.readString(System.in);
        while(!isLastNameValid(name)) {
            System.out.println("Incorrect Input. Try again: ");
            name = reader.readString(System.in);
        }
        user.setLastName(name);

        System.out.println("Input age:");
        String age = reader.readString(System.in);
        while(!isAgeValid(age)) {
            System.out.println("Incorrect input.Try again:: ");
            age = reader.readString(System.in);
        }
        user.setAge(Integer.parseInt(age));

        System.out.println("Input gender:");
        try {
            String gender = reader.readString(System.in);
            user.setGender(Gender.valueOf(gender));
        }
        catch (IllegalArgumentException ex){
            System.out.println("Incorrect input.Try again:");
        }
        return user;
    }
}
