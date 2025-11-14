package dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CustomerDTO implements Serializable {

    private String customerId;
    private String name;
    private String username;
    private String password;
    private String phone;
    private BigDecimal balance;
    private int remainingTime;
    private Date createdAt;
    private String status;

    // Constructor rỗng
    public CustomerDTO() {
    }

    // Constructor đầy đủ
    public CustomerDTO(String customerId, String name, String username, String password, String phone, BigDecimal balance, int remainingTime, Date createdAt, String status) {
        this.customerId = customerId;
        this.name = name;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.balance = balance;
        this.remainingTime = remainingTime;
        this.createdAt = createdAt;
        this.status = status;
    }

    // Getters and Setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" + "customerId='" + customerId + '\'' + ", name='" + name + '\'' + ", username='" + username + '\'' + '}';
    }
}