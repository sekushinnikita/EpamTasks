package Delivery.Ui.Validation;

public class ProductValidation {
    final static Integer MAX_WEIGHT = 10;
    final static Integer MAX_HEIGHT = 2;
    final static Integer MAX_WIDTH = 2;
    final static Integer MAX_LENGTH = 2;

    public static Boolean isNameValid(String name){
        return name.length() > 0;
    }

    public static Boolean isWeightValid(Integer weight){
        if(weight <= 0)
            return false;
        return weight <= MAX_WEIGHT;
    }

    public static Boolean isHeightValid(Integer height){
        if(height <= 0)
            return false;
        return height <= MAX_HEIGHT;
    }
    public static Boolean isWidthValid(Integer width){
        if(width <= 0)
            return false;
        return width <= MAX_WIDTH;
    }
    public static Boolean isLengthValid(Integer length){
        if(length <= 0)
            return false;
        return length <= MAX_LENGTH;
    }
}
