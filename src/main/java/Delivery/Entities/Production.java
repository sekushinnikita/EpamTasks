package Delivery.Entities;

import Delivery.Ui.Reading.Reader;

import java.io.Serializable;
import java.util.Objects;

import static Delivery.Ui.Validation.ProductValidation.*;

public class Production implements Serializable {
    private String name;
    private Integer weight;
    private Integer volume;


    public Production() {
    }


    public Production(String name, Integer weight, Integer volume) {
        this.name = name;
        this.weight = weight;
        this.volume = volume;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Integer getWeight() { return weight; }

    public void setWeight(Integer weight) { this.weight = weight; }

    public void setVolume() {
        Volume vol= new Volume();
        Reader reader = new Reader();
        System.out.println("Input height:");
        Integer height;
        height=reader.readInteger(System.in);
        while(!isHeightValid(height)) {
            System.out.println("Incorrect input.Try again: ");
            height = reader.readInteger(System.in);
        }vol.setHeight(height);
        System.out.println("Input width:");
        Integer width;
        width=reader.readInteger(System.in);
        while(!isWidthValid(width)) {
            System.out.println("Incorrect input.Try again: ");
            width = reader.readInteger(System.in);
        }vol.setHeight(width);
        System.out.println("Input length:");
        Integer length;
        length=reader.readInteger(System.in);
        while(!isLengthValid(height)) {
            System.out.println("Incorrect input.Try again: ");
            length = reader.readInteger(System.in);
        }vol.setHeight(length);
        this.volume = length*height*width;
    }

    public Integer getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", volume='" + volume + '\'' +
                '}';
    }

    public static class Volume extends Production {
        private Integer height;
        private Integer width;
        private Integer length;

        public Volume(){}

        public Integer getHeight() { return height; }

        public void setHeight(Integer height) { this.height = height; }

        public Integer getLength() { return length; }

        public void setLength(Integer length) { this.length = length; }

        public Integer getWidth() { return width; }

        public void setWidth(Integer width) { this.width = width; }


    }
    @Override
    public int hashCode() {
        return Objects.hash(name,weight,volume);
    }
}

