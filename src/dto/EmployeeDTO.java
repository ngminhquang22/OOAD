package dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {

    private String employeeId;
    private String name;
    private String role;
    private String username;
    private String password;
    private String phone;
    private String status;

    // Constructor rỗng
    public EmployeeDTO() {
    }

    // Constructor đầy đủ
    public EmployeeDTO(String employeeId, String name, String role, String username, String password, String phone, String status) {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.status = status;
    }

    // Getters and Setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" + "employeeId='" + employeeId + '\'' + ", name='" + name + '\'' + ", role='" + role + '\'' + '}';
    }
}