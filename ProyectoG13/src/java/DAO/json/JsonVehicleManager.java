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
import model.Vehicle;
/**
 * This class is about to manage the read, write and update of the Vehicles Json File
 * @author Mario Carranza Mena B51573
 */
public class JsonVehicleManager {
    
    private static JsonVehicleManager instance;
    private ArrayList<Vehicle> list;
    private String filePath;
    private BufferedReader reader;
    private BufferedWriter writer;
    
    private JsonVehicleManager() {
        list = new ArrayList<>();
    }
    
    public static JsonVehicleManager getInstance() {
        if (instance == null) {
            instance = new JsonVehicleManager();
        }
        return instance;
    }
    
    /**
     * Reads and transform data from Json File to useful Vehicle objects
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
                        list.add(gson.fromJson(jSon, Vehicle.class));
                    } else if ((jSon).contains("]")) {
                        jSon = jSon.substring(0, jSon.indexOf("]") - 1) + "}";
                        list.add(gson.fromJson(jSon, Vehicle.class));
                    } else if (jSon.charAt(0) == ',') {
                        jSon = jSon.replaceFirst(",", " ");
                        jSon = jSon.trim() + "}";
                        list.add(gson.fromJson(jSon, Vehicle.class));
                    }
                }
            } // Cycle end
        } catch (FileNotFoundException ex) {
            System.err.println("ReadJson Method Error" + ex.getMessage());
        }
    }
    
    /**
     * Updates Vehicle Json File with the curent list including last changes
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
     * New vehicle is added to current memory list as first step
     * @param vehicle New being added to the list
     * @return True if vehicle is added correctly or false if vehicle is already in the list
     */
    public boolean addVehicle(Vehicle vehicle) {
        Iterator it = list.iterator();
        boolean result = false;
        while (it.hasNext()) {
            Vehicle current = (Vehicle)it.next();
            if (!vehicle.getModelName().equalsIgnoreCase(current.getModelName())) {
                result = list.add(vehicle);
            }
        }
        if (result) {
            saveVehiclesList();
        }
        return result;
    }
    
    public Vehicle findCar(String searchArg) {
        
        Vehicle vehicle = null;
        readJson();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Vehicle current = (Vehicle)it.next();
            if (current.getBrand().equalsIgnoreCase(searchArg)) {
                vehicle = current;
                break;
            } else if (current.getBrand().equalsIgnoreCase(searchArg)) {
                vehicle = current;
                break;
            } else if(current.getBodyAndChassis().equalsIgnoreCase(searchArg)) {
                vehicle = current;
                 break;
            }
        }
        
        return vehicle;
    }

    // ---------- Ignore this section (Just testing some stuff) ---------

    /**
     * A simple Method that prints out all vehicles from current list
     */
    public void listCars() {
        list.forEach(vehicle -> {
            System.out.println(vehicle.toString());
        });
    }
    
    /**
     * Do i really need to comment this man :v
     **/
    public ArrayList<Vehicle> getList() {
        if (list.isEmpty()) {
            JsonVehicleManager.getInstance().readJson();
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