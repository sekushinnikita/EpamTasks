package Delivery.DAO;

import Delivery.Entities.User;

public class UserController extends Controller<User> {
    private static final String dir = "data/user.dat";

    @Override
    public String getDirectory() {
        return dir;
    }
}