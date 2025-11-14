package dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class InvoiceDetailDTO implements Serializable {

    private String invoiceDetailId;
    private String invoiceId;
    private String productId;
    private String description;
    private int quantity;
    private BigDecimal unitPrice;
    private BigDecimal subtotal;

    // Constructor rỗng
    public InvoiceDetailDTO() {
    }

    // Constructor đầy đủ
    public InvoiceDetailDTO(String invoiceDetailId, String invoiceId, String productId, String description, int quantity, BigDecimal unitPrice, BigDecimal subtotal) {
        this.invoiceDetailId = invoiceDetailId;
        this.invoiceId = invoiceId;
        this.productId = productId;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subtotal = subtotal;
    }

    // Getters and Setters
    public String getInvoiceDetailId() {
        return invoiceDetailId;
    }

    public void setInvoiceDetailId(String invoiceDetailId) {
        this.invoiceDetailId = invoiceDetailId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "InvoiceDetailDTO{" + "invoiceDetailId='" + invoiceDetailId + '\'' + ", productId='" + productId + '\'' + ", quantity=" + quantity + '}';
    }
}