package dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class InvoiceDTO implements Serializable {

    private String invoiceId;
    private String sessionId;
    private String customerId;
    private String employeeId;
    private BigDecimal totalAmount;
    private BigDecimal discount;
    private BigDecimal finalAmount;
    private Date createdAt;

    // Constructor rỗng
    public InvoiceDTO() {
    }

    // Constructor đầy đủ
    public InvoiceDTO(String invoiceId, String sessionId, String customerId, String employeeId, BigDecimal totalAmount, BigDecimal discount, BigDecimal finalAmount, Date createdAt) {
        this.invoiceId = invoiceId;
        this.sessionId = sessionId;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.totalAmount = totalAmount;
        this.discount = discount;
        this.finalAmount = finalAmount;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
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

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(BigDecimal finalAmount) {
        this.finalAmount = finalAmount;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "InvoiceDTO{" + "invoiceId='" + invoiceId + '\'' + ", customerId='" + customerId + '\'' + ", finalAmount=" + finalAmount + '}';
    }
}