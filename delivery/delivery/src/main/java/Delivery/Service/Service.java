package Delivery.Service;

import java.util.ArrayList;

public abstract class Service<Entity> {

    public abstract boolean entityExist(Entity entity);

    protected abstract ArrayList<Entity> getDAOdata();

    public abstract void create(Entity entity);

    public abstract ArrayList<Entity> read();

    public abstract void update(Entity entity, Entity newEntity);

    public abstract void delete(Entity entity);

}