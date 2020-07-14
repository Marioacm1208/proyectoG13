package model;

import com.google.gson.annotations.Expose;
import java.util.ArrayList;

/**
 *
 * @author Mario Carranza Mena B51573
 */
public class Users {
    @Expose
    ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }
}
