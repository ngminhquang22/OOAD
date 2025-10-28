package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class test {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;"
                + "databaseName=InternetCafeDB;"
                + "encrypt=false;trustServerCertificate=true;";
        String userName = "sa";
        String password = "123456789";

        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            System.out.println("Connection Successful!");

            // Sử dụng dữ liệu
            String sql = "SELECT * FROM Customer";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getString("customer_id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("username")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
