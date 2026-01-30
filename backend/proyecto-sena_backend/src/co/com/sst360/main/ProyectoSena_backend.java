package co.com.sst360.main;

import co.com.sst360.util.ConexionDB;
import java.sql.Connection;

public class ProyectoSena_backend {

    public static void main(String[] args) {

        Connection conn = ConexionDB.getConexion();

        if (conn != null) {
            System.out.println("CONEXIÓN OK");
        } else {
            System.out.println("CONEXIÓN FALLIDA");
        }
    }
}