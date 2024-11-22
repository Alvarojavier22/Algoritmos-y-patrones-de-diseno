package org.utec.modulo3.singleton;

public class ConfiguracionGlobal {

    private static ConfiguracionGlobal instancia;

    private String dbUrl;
    private String apiKey;

    private ConfiguracionGlobal() {
        dbUrl = "jdbc:mysql://localhost:3306/modulo3";
        apiKey = "modulo3";
    }
    public static ConfiguracionGlobal getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionGlobal();
        }
        return instancia;
    }
    public String getDbUrl() {
        return dbUrl;
    }
    public String getApiKey() {
        return apiKey;
    }
}
