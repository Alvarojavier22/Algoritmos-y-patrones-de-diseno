package org.utec.modulo4.dao;

import java.sql.SQLException;

public class Main2 {
    public static void main(String[] args) throws SQLException {
        UsuarioDAO usuarioDAO = null;

        try{
            ConexionBDSingleton conexionBDSingleton = ConexionBDSingleton.obtenerInstancia();
            System.out.println("Se estableció la conexión a la DB");

            usuarioDAO = new UsuarioDAO();

            Usuario nuevoUsuario = new Usuario(1, "Javier", "javier@algo.com", "123456");
            usuarioDAO.agregarUsuario(nuevoUsuario);

            System.out.println("Lista de Usuarios en la DB: ");
            usuarioDAO.obtenerUsuarios().forEach(System.out::println);

            nuevoUsuario.setNombre("Javier Capurro");
            usuarioDAO.actualizarUsuarios(nuevoUsuario);

            usuarioDAO.eliminarUsuario(nuevoUsuario.getId());
        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al establecer la conexión a la DB");
        }finally {
            if(usuarioDAO != null){
                usuarioDAO.cerrarConexion();
            }
        }

    }
}
