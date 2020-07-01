package DAO;

import java.util.ArrayList;
import model.Vehicle;

/**
 *
 * @author Mario
 */
public interface IVehicle {
    
    ArrayList<Vehicle> list();
    boolean create();
    boolean read();
    boolean update();
    boolean delete();
    Vehicle search(String modelName);
    
}
