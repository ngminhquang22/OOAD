package dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ServiceRequestDTO implements Serializable {

    private String requestId;
    private String sessionId;
    private String customerId;
    private String employeeId;
    private String type;
    private BigDecimal amount;
    private String productId;
    private Date createdAt;
    private String status;

    // Constructor rỗng
    public ServiceRequestDTO() {
    }

    // Constructor đầy đủ
    public ServiceRequestDTO(String requestId, String sessionId, String customerId, String employeeId, String type, BigDecimal amount, String productId, Date createdAt, String status) {
        this.requestId = requestId;
        this.sessionId = sessionId;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.type = type;
        this.amount = amount;
        this.productId = productId;
        this.createdAt = createdAt;
        this.status = status;
    }

    // Getters and Setters
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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
        return "ServiceRequestDTO{" + "requestId='" + requestId + '\'' + ", type='" + type + '\'' + ", customerId='" + customerId + '\'' + '}';
    }
}