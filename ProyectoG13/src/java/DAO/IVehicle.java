package DAO;

import java.util.ArrayList;
import model.Vehicle;

/**
 *
 * @author Mario Carranza Mena B51573
 */
public interface IVehicle {
    
    ArrayList<Vehicle> list();
    boolean create();
    boolean read();
    boolean update();
    boolean delete();
    Vehicle search(String modelName);
    
}
