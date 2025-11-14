package dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UsageSessionDTO implements Serializable {

    private String sessionId;
    private String customerId; // Chỉ lưu ID (khóa ngoại)
    private String computerId; // Chỉ lưu ID (khóa ngoại)
    private Date startTime;
    private Date endTime;
    private int totalTimeUsed;
    private BigDecimal totalCost;
    private String status;

    // Constructor rỗng
    public UsageSessionDTO() {
    }

    // Constructor đầy đủ
    public UsageSessionDTO(String sessionId, String customerId, String computerId, Date startTime, Date endTime, int totalTimeUsed, BigDecimal totalCost, String status) {
        this.sessionId = sessionId;
        this.customerId = customerId;
        this.computerId = computerId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.totalTimeUsed = totalTimeUsed;
        this.totalCost = totalCost;
        this.status = status;
    }

    // Getters and Setters
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

    public String getComputerId() {
        return computerId;
    }

    public void setComputerId(String computerId) {
        this.computerId = computerId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getTotalTimeUsed() {
        return totalTimeUsed;
    }

    public void setTotalTimeUsed(int totalTimeUsed) {
        this.totalTimeUsed = totalTimeUsed;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UsageSessionDTO{" + "sessionId='" + sessionId + '\'' + ", customerId='" + customerId + '\'' + ", computerId='" + computerId + '\'' + '}';
    }
}