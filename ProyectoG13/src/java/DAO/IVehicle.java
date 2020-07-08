package DAO;

import java.util.ArrayList;
import model.Vehicle;

/**
 *
 * @author Mario Carranza Mena B51573
 */
public interface IVehicle {
    
    ArrayList<Vehicle> list();
    boolean create(Vehicle vehicle);
    boolean read();
    boolean update(Vehicle vehicle);
    boolean delete(Vehicle vehicle);

    /**
     * Looks for an existing unit with search criteria given from user serach
     * @param value String being used to do the search
     * @return null or the Vehicle object depending if there's a match
     */
    Vehicle search(String value);
    
}
