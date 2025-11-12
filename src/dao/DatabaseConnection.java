package dao;
import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
    public static void main(String[] args) {
        // Thông tin kết nối
        String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;"
                + "databaseName=InternetCafeDB;"
                + "encrypt=false;"
                + "trustServerCertificate=true;";
        String userName = "sa";
        String password = "123456789";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Tạo kết nối
            Connection conn = DriverManager.getConnection(url, userName, password);

            System.out.println("Connection Completed");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connect Failed");
            e.printStackTrace();
        }
    }
}