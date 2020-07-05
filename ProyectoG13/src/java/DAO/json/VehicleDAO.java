package DAO.json;

import DAO.IVehicle;
import java.util.ArrayList;
import model.Vehicle;

/**
 *
 * @author Mario Carranza Mena B51573
 */
public class VehicleDAO implements IVehicle{
    
    ArrayList<Vehicle> vehicles;
    
    
    public VehicleDAO() {
        vehicles = JsonVehicleManager.getInstance().getList();
        System.out.println("Existencias" + vehicles.size());
        System.out.println("Vehicles path (Printed from VehicleDAO) " + JsonVehicleManager.getInstance().getPath());
    }
    
    @Override
    public ArrayList<Vehicle> list() {
        return vehicles;
    }

    @Override
    public boolean create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehicle search(String modelName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
