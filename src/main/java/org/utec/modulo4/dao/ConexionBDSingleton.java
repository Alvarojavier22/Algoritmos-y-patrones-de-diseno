package org.utec.modulo4.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBDSingleton {

    private static ConexionBDSingleton instanciaUnica;

    private Connection conexion;
    private String url = "jdbc:postgresql://localhost:5432/moduo4";
    private String user = "alvaro";
    private String password = "alvaro";

    private ConexionBDSingleton() throws SQLException {
        this.conexion = DriverManager.getConnection(url, user, password);
    }
    public static ConexionBDSingleton obtenerInstancia() throws SQLException {
        if (instanciaUnica == null) {
            instanciaUnica = new ConexionBDSingleton();
        }
        return instanciaUnica;
    }
    public Connection getConexion() {
        return conexion;
    }
}
