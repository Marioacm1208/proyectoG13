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
 * This class is about to manage the read, write and update of the Vehicles Json
 * File
 *
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
                        data += line;
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
     * Updates Vehicle Json File with the current list including last changes
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
     *
     * @param vehicle New being added to the list
     * @return True if vehicle is added correctly or false if vehicle is already
     * in the list
     */
    public boolean addVehicle(Vehicle vehicle) {
        Iterator it = list.iterator();
        boolean result = false;
        while (it.hasNext()) {
            Vehicle current = (Vehicle) it.next();
            if (!vehicle.getModelName().equalsIgnoreCase(current.getModelName())) {
                if (!it.hasNext()) {
                    result = list.add(vehicle);
                    vehicle.setAvailableUnits(vehicle.getAvailableUnits() + 1);
                }
            }
        }
        if (result) {
            saveVehiclesList();
        }
        return result;
    }

    public ArrayList<Vehicle> findCar(String searchArg) {

        ArrayList<Vehicle> results = new ArrayList<>();
        if (list.isEmpty()) {
            readJson();
        }
        Iterator it = list.iterator();
        searchArg = searchArg.toLowerCase().trim();
        while (it.hasNext()) {
            Vehicle current = (Vehicle) it.next();
            if (current.getBrand().equalsIgnoreCase(searchArg)) {
                results.add(current);
            } else if (current.getModelName().equalsIgnoreCase(searchArg)) {
                results.add(current);
            } else if (current.getBodyAndChassis().equalsIgnoreCase(searchArg)) {
                results.add(current);
            }
        }
        return results;
    }

    /**
     * Orders the list by sells starting by the most sold vehicle.
     *
     */
    public void ordenateBySells() {
        if (list.isEmpty()) {
            readJson();
        }

        Vehicle aux = new Vehicle();

        for (int i = 0; i < list.size(); i++) {
            while (list.get(i + 1) != null) {
                if (list.get(i).getAvailableUnits() < list.get(i + 1).getAvailableUnits()) {
                    aux = list.get(i + 1);
                    list.set(i + 1, list.get(i));
                    list.set(i, aux);
                }
            }
        }
    }

    /**
     * Creates a new list that only includes the most popular cars according to the amount of sells.
     *
     * @return the new list with only the most popular cars
     * in the previous list.
     */
    public ArrayList<Vehicle> mostPopularCars() {
        ArrayList<Vehicle> populars = new ArrayList<>();
        if (list.isEmpty()) {
            readJson();
        }

        ordenateBySells();
        populars.add(list.get(0));
        int mostPopular = list.get(0).getAvailableUnits();
        for (int i = 1; i < list.size(); i++) {
            while (list.get(i + 1) != null) {
                if (list.get(i).getAvailableUnits() == mostPopular) {
                    populars.add(list.get(i));
                } else {
                    break;
                }
            }
        }
        return populars;
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
     *
     */
    public ArrayList<Vehicle> getList() {
        if (list.isEmpty()) {
            JsonVehicleManager.getInstance().readJson();
        }
        return list;
    }

    public void setPath(String path) {
        this.filePath = path;
        System.out.println("SETED PATH TO JSON: " + filePath);
    }

    public String getPath() {
        return filePath;
    }
}
