package org.utec.modulo4.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        try{
            ConexionBDSingleton conexionBDSingleton = ConexionBDSingleton.obtenerInstancia();
            System.out.println("Se estableció la conexión!");

            UsuarioDAO usuarioDAO = new UsuarioDAO();

            Usuario nuevousuario = new Usuario(1, "Alvaro", "alvaro@algo.com", "12345");
            usuarioDAO.agregarUsuario(nuevousuario);

            System.out.println("Lista de usuarios de la BD: ");
            usuarioDAO.obtenerUsuarios().forEach( System.out::println);

            nuevousuario.setNombre("Alvaro Javier");
            usuarioDAO.actualizarUsuarios(nuevousuario);

            usuarioDAO.eliminarUsuario(nuevousuario.getId());

            usuarioDAO.cerrarConexion();
        }catch(SQLException sqlException){
            sqlException.printStackTrace();
            System.out.println("Error al establecer la conexion");
        }
    }
}
