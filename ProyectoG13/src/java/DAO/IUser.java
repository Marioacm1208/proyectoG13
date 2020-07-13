
package DAO;

import java.util.ArrayList;
import model.User;
import model.Vehicle;

/**
 *
 * @author Guillermo Vega
 */
public interface IUser {
    
    ArrayList<User> list();
    boolean create(User user);
    boolean read();
    boolean update(User user);
    boolean delete(User user);

    /**
     * Looks for an existing unit with a search criteria given from user search
     * @param value String being used to do the search
     * @return null or the User object depending if there's a match
     */
    User search(String value);
}
