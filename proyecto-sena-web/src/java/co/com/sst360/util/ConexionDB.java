package co.com.sst360.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static final String URL =
        "jdbc:mysql://localhost:3306/proyecto_sena_alfred"
  + "?useSSL=false"
  + "&serverTimezone=UTC"
  + "&allowPublicKeyRetrieval=true";
    private static final String USER = "alfred_user";
    private static final String PASSWORD = "8603";

    public static Connection getConexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }
        return conexion;
    }
}
