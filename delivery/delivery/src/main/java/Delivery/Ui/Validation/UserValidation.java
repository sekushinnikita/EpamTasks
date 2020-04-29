package Delivery.Ui.Validation;

public class UserValidation {
    final static Integer MAX_AGE = 100;

    public static Boolean isEmailValid(String email){
        return email.length() > 0;
    }

    public static Boolean isPasswordValid(String password){
        return password.length() > 0;
    }

    public static Boolean isFirstNameValid(String firstName){

        return firstName.length() > 0;
    }

    public static Boolean isLastNameValid(String lastName){
        return lastName.length() > 0;
    }

    public static Boolean isAgeValid(String age){
        if(age.length() == 0)
            return false;
        return Integer.parseInt(age) <= MAX_AGE;
    }

}
