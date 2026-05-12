package GarageFlow.model;

import jakarta.persistence.*;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vehicleName;
    private String ownerName;
    private String serviceType;

    public Vehicle() {
    }

    public Vehicle(String vehicleName, String ownerName, String serviceType) {
        this.vehicleName = vehicleName;
        this.ownerName = ownerName;
        this.serviceType = serviceType;
    }

    public Long getId() {
        return id;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}