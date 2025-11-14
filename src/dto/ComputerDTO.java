package dto;

import java.io.Serializable;

public class ComputerDTO implements Serializable {

    private String computerId;
    private String status;
    private String location;
    private String specs;

    // Constructor rỗng
    public ComputerDTO() {
    }

    // Constructor đầy đủ
    public ComputerDTO(String computerId, String status, String location, String specs) {
        this.computerId = computerId;
        this.status = status;
        this.location = location;
        this.specs = specs;
    }

    // Getters and Setters
    public String getComputerId() {
        return computerId;
    }

    public void setComputerId(String computerId) {
        this.computerId = computerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    @Override
    public String toString() {
        return "ComputerDTO{" + "computerId='" + computerId + '\'' + ", status='" + status + '\'' + ", location='" + location + '\'' + '}';
    }
}