
package DAO.json;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import model.User;


/**
 * This class is about to manage the read, write and update of the User Json File
 * @author Guillermo Vega
 */
public class JsonUserManager {
    
    private static JsonUserManager instance;
    private ArrayList<User> list;
    private String filePath;
    private BufferedReader reader;
    private BufferedWriter writer;
    
    private JsonUserManager() {
        list = new ArrayList<>();
    }
    
    public static JsonUserManager getInstance() {
        if (instance == null) {
            instance = new JsonUserManager();
        }
        return instance;
    }
    
    /**
     * Reads and transform data from Json File to useful User objects
     */
    public void readJson() {
        try {
            this.reader = new BufferedReader(new FileReader(new File(filePath)));
            Gson gson = new Gson();
            String data = "";
            try {
                while (true) {
                    String line = reader.readLine();
                    if (line != null) {
                        data+= line;
                    } else {
                        break;
                    }
                }
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
            
            String[] jSons = data.split("}");
            for (String jSon : jSons) { //Formating Json input data readed from file
                if (jSon.length() > 5) {
                    if ((jSon + "}").contains("[")) {
                        jSon = jSon.substring(jSon.indexOf("[") + 1, jSon.length()) + "}";
                        list.add(gson.fromJson(jSon, User.class));
                    } else if ((jSon).contains("]")) {
                        jSon = jSon.substring(0, jSon.indexOf("]") - 1) + "}";
                        list.add(gson.fromJson(jSon, User.class));
                    } else if (jSon.charAt(0) == ',') {
                        jSon = jSon.replaceFirst(",", " ");
                        jSon = jSon.trim() + "}";
                        list.add(gson.fromJson(jSon, User.class));
                    }
                }
            } // Cycle end
        } catch (FileNotFoundException ex) {
            System.err.println("ReadJson Method Error" + ex.getMessage());
        }
    }
    
    /**
     * Updates User Json File with the current list including last changes
     */
    public void saveVehiclesList() {
        try {
            this.writer = new BufferedWriter(new FileWriter(new File(filePath)));
            Gson gson = new Gson();
            String data;
            data = gson.toJson(list);
            writer.write(data); // Then the whole file is updated including new changes
             
        } catch (IOException ex) {
            System.out.println("Error Writing to Vehicle Json File" + ex.getMessage());
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (IOException ex) {
                System.err.println("Error Saving Vehicles List " + ex.getMessage());
            }
        }
    }
    
    /**
     * A new User is added to current memory list as first step
     * @param user New being added to the list
     * @return True if the user is added correctly or false if the user is already in the list
     */
    public boolean addUser(User user) {
        Iterator it = list.iterator();
        boolean result = false;
        while (it.hasNext()) {
            User current = (User)it.next();
            if (!user.getName().equalsIgnoreCase(current.getName())) {
                result = list.add(user);
            }
        }
        if (result) {
            saveVehiclesList();
        }
        return result;
    }
    
    public User findUser(String searchArg) {
        
        User user = null;
        readJson();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User current = (User)it.next();
            if (current.getName().equalsIgnoreCase(searchArg)) {
                user = current;
                break;
            } else if (current.getLastName().equalsIgnoreCase(searchArg)) {
                user = current;
                break;
            } else if(current.geteMail().equalsIgnoreCase(searchArg)) {
                user = current;
                 break;
            }
        }
        
        return user;
    }

    // ---------- if this secction is actually unnecesary, tell me :v ---------

    /**
     * A simple Method that prints out all users from current list
     */
    public void listUsers() {
        list.forEach(user -> {
            System.out.println(user.toString());
        });
    }
    
    /**
     * Do i really need to comment this man :v
     **/
    public ArrayList<User> getList() {
        if (list.isEmpty()) {
            JsonUserManager.getInstance().readJson();
        }
        return list;
    }
    
    public void setPath(String path) {
        this.filePath = path;
        //System.out.println("PATH TO JSON: " + path);
    }
    
    public String getPath() {
        return filePath;
    }
}
