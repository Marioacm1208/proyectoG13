package model;

/**
 *
 * @author Guillermo Vega
 */
public class User {

    private String name;
    private String lastname;
    private String email;
    private String password;
    private String ShoppingHistory; // This variable needs to be changed to a Concrete ->
                                    //ShoppingHistory Object (Make a new Class) that contains all purchases user made
    
    public User() {
    }
    
    public User(String name, String lastname, String email, String password) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.ShoppingHistory = "TEST";
    }

    public User(String name, String lastname, String email, String password, String ShoppingHistory) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.ShoppingHistory = ShoppingHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getShoppingHistory() {
        return ShoppingHistory;
    }

    public void setShoppingHistory(String ShoppingHistory) {
        this.ShoppingHistory = ShoppingHistory;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", lastname=" + lastname +
                ", Email=" + email + ", password=" + password + '}';
    }
}