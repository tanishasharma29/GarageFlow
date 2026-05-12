package GarageFlow.service;

import GarageFlow.model.Vehicle;
import GarageFlow.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    // GET all vehicles
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    // GET vehicle by ID
    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));
    }

    // SAVE vehicle
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    // UPDATE vehicle
    public Vehicle updateVehicle(Long id, Vehicle updatedVehicle) {

        Vehicle vehicle = getVehicleById(id);

        vehicle.setVehicleName(updatedVehicle.getVehicleName());
        vehicle.setOwnerName(updatedVehicle.getOwnerName());
        vehicle.setServiceType(updatedVehicle.getServiceType());

        return vehicleRepository.save(vehicle);
    }

    // DELETE vehicle
    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }
}