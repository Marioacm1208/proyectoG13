package DAO.json;

import DAO.IUser;
import java.util.ArrayList;
import model.User;

/**
 * Data Access Object implementation for Vehicles data management
 * @author Guillermo Vega
 */
public class UserDAO implements IUser{
    
    private ArrayList<User> users;
    
    public UserDAO() {
        users = JsonUserManager.getInstance().getList();
    }
    
    @Override
    public ArrayList<User> list() {
        return users;
    }

    @Override
    public boolean create(User user) {
        return JsonUserManager.getInstance().addUser(user);
    }

    @Override
    public boolean read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User search(String value) {
        return JsonUserManager.getInstance().findUser(value);
    }
}
