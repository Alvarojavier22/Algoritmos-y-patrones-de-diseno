package org.utec.modulo3.singleton;

public class Main {
    public static void main(String[] args) {

        ConfiguracionGlobal cg = ConfiguracionGlobal.getInstancia();

        System.out.println("Conectado a la base de datos" + cg.getDbUrl());
        System.out.println("Clave de la API: " + cg.getApiKey());
    }
}
