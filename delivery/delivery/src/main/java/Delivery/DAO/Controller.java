package Delivery.DAO;

import java.io.*;
import java.util.ArrayList;

public abstract class Controller<Entity> {
    private ObjectInputStream inputStream;
    private ObjectOutputStream outputStream;
    private ArrayList<Entity> data;

    public abstract String getDirectory();

    public Controller() {
        this.data = new ArrayList<Entity>();
    }
    public void create(Entity item) {
        this.data.add(item);
        System.out.println("DAO: " + data.size() + " object was created");
    }

    public void save() {
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(getDirectory()));
            outputStream.writeObject(data);
            outputStream.close();
            System.out.println("DAO: " + data.size() + " objects were saved");
        }catch (IOException ex){}
    }

    public void read() {
        try {
            inputStream = new ObjectInputStream(new FileInputStream(getDirectory()));
            data = (ArrayList<Entity>) inputStream.readObject();
            inputStream.close();
            System.out.println(data.size() + " objects were read");
        }catch(IOException | ClassNotFoundException ex){}
    }

    public void update(Entity entity, Entity newEntity) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).hashCode() == entity.hashCode()) {
                data.set(i, newEntity);
                System.out.println("DAO: object" + entity + " was successfully updated");
            }
        }
    }

    public void delete(Entity entity) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).hashCode() == entity.hashCode()) {
                Entity obj = data.get(i);
                data.remove(obj);
                System.out.println("DAO: object" + obj + " was successfully deleted");
                break;
            }
        }
    }

    public ArrayList<Entity> getData() {
        return data;
    }


}
