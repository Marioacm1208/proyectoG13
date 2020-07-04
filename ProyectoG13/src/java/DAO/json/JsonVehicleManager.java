package DAO.json;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import model.Vehicle;
/**
 * This class is about to manage the read, write and update of the Vehicles Json File
 * @author Mario Carranza Mena B51573
 */
public class JsonVehicleManager {
    
    private static JsonVehicleManager instance;
    private ArrayList<Vehicle> list;
    private final String FILE_PATH = "src/jsontest/vehicles.json";
    private BufferedReader reader;
    private BufferedWriter writer;
    
    private JsonVehicleManager() {
        try {
            list = new ArrayList<Vehicle>();
            this.reader = new BufferedReader(new FileReader(FILE_PATH));
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
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
        }
    }
    public static String charRemoveAt(String str, int p) {  
        return str.substring(0, p) + str.substring(p + 1);  
    }  
    
    /**
     * Updates Vehicle Json File with the curent list including last changes
     */
    public void saveVehiclesList() {
        try {
            this.writer = new BufferedWriter(new FileWriter(FILE_PATH));
            Gson gson = new Gson();
            String data;
            //for (Vehicle car : list) {
                data = gson.toJson(list);
            //}
            writer.write(data); // Then the whole file is updated including new changes
             
        } catch (IOException ex) {
            System.out.println("Error Writing to Vehicle Json File" + ex.getMessage());
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (IOException ex) {
                System.err.println("WriteJsonError " + ex.getMessage());
            }
        }
    }
    
    /**
     * New vehicle is added to current memory list as first step
     * @param vehicle New vechicle being added to the list
     */
    public void addVehicle(Vehicle vehicle) {
        list.add(vehicle);
    }
    
    
    /**
     * A simple Method that prints out all vehicles from current list
     */
    public void listCars() {
        list.forEach(vehicle -> {
            System.out.println(vehicle.toString());
        });
    }
    
    public ArrayList<Vehicle> getList() {
        return list;
    }
}
