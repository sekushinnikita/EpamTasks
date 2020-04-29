package Delivery.Entities;

public class Car{
    private String name;
    private String color;
    private String type; //величина машины
    private Integer cargoVolume;

    public Car() {
    }

    public Car(String name, String color, String body) {
        this.name = name;
        this.color = color;
        this.type = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBody() {
        return type;
    }

    public void setBody(String body) {
        this.type = body;
    }

    public Integer getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(Integer cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", body=" + type +
                '}';
    }
}

