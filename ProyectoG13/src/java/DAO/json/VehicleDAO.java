package DAO.json;

import DAO.IVehicle;
import java.util.ArrayList;
import model.Vehicle;

/**
 *  Data Access Object implementation for Vehicles data management
 * @author Mario Carranza Mena B51573
 */
public class VehicleDAO implements IVehicle{
    
    ArrayList<Vehicle> vehicles;
    
    
    public VehicleDAO() {
        vehicles = JsonVehicleManager.getInstance().getList();
    }
    
    @Override
    public ArrayList<Vehicle> list() {
        return vehicles;
    }

    @Override
    public boolean create(Vehicle vehicle) {
        return JsonVehicleManager.getInstance().addVehicle(vehicle);
    }

    @Override
    public boolean read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Vehicle vehicle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Vehicle vehicle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehicle search(String value) {
        return JsonVehicleManager.getInstance().findCar(value);
    }
}
