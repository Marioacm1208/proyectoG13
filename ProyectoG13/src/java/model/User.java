package model;

/**
 *
 * @author Guillermo Vega
 */
public class User {

    private String name;
    private String lastName;
    private String eMail;
    private String passWord;
    private String ShoppingHistory;
    private String id;
    private String[] ubication;
    
    public User() {
    }
    
    public User(String name, String lastName, String eMail, String passWord, String id, String[] ubication) {
        this.name = name;
        this.lastName = lastName;
        this.eMail = eMail;
        this.passWord = passWord;
        this.ShoppingHistory = "TEST";
        this.id = id;
        this.ubication = ubication;
    }

    public User(String name, String lastName, String eMail, String passWord, String id, String[] ubication, String ShoppingHistory) {
        this.name = name;
        this.lastName = lastName;
        this.eMail = eMail;
        this.passWord = passWord;
        this.ShoppingHistory = ShoppingHistory;
        this.id = id;
        this.ubication = ubication;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getUbication() {
        return ubication;
    }

    public void setUbication(String[] ubication) {
        this.ubication = ubication;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getShoppingHistory() {
        return ShoppingHistory;
    }

    public void setShoppingHistory(String ShoppingHistory) {
        this.ShoppingHistory = ShoppingHistory;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", lastName=" + lastName +
                ", eMail=" + eMail + ", passWord=" + passWord + '}';
    }
}
