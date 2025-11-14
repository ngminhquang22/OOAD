package dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductDTO implements Serializable {

//    PRO00000001
    private String productId;
    private String name;
    private BigDecimal price;
    private int stock;
    private String category;
    private String status;

    // Constructor rỗng
    public ProductDTO() {
    }

    // Constructor đầy đủ
    public ProductDTO(String productId, String name, BigDecimal price, int stock, String category, String status) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
        this.status = status;
    }

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ProductDTO{" + "productId='" + productId + '\'' + ", name='" + name + '\'' + ", price=" + price + '}';
    }
}