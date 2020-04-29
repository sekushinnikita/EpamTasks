package Delivery.Service;

import Delivery.DAO.UserController;
import Delivery.Entities.User;
import org.hibernate.service.spi.ServiceException;

import java.util.ArrayList;
import java.util.Objects;

public class UserService extends Service<User> {
    private UserController userController;

    public UserService() {
        userController = new UserController();
        userController.read();
    }

    public ArrayList<User> getDAOdata() {
        return userController.getData();
    }

    public ArrayList<User> read() {
        return userController.getData();
    }

    public boolean entityExist(User user) {
        ArrayList<User> arrUser = getDAOdata();
        for (User item : arrUser) {
            if (Objects.equals(item,user)) {
                return true;
            }
        }
        return false;
    }

    public void create(User user) {
        try {
            if (entityExist(user)) {
                throw new ServiceException("Error. This user already exists");
            } else {
                userController.create(user);
                userController.save();
            }
        } catch (ServiceException ex) {
        }

    }

    public void update(User user, User newUser) {
        try {
            if (entityExist(user)) {
                userController.update(user, newUser);
                userController.save();
            } else {
                throw new ServiceException("Error. This User doesn't exist");
            }
        } catch (ServiceException e) {
        }
    }

    public void delete(User user) {
        try {
            if (entityExist(user)) {
                userController.delete(user);
                userController.save();
            } else {
                throw new ServiceException("Error. This User doesn't exist");
            }
        } catch (ServiceException e) {
        }
    }
}
