package org.utec.modulo3.prototype;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Documento documentoBase = new Documento("Patron protorype", "Este es el documento base...", "Alvaro", new Date());

        documentoBase.mostrarDetalles();

        Documento documentoClonado = documentoBase.clonar();
        documentoClonado.setTitulo("Patron protorype V2");
        documentoClonado.setContenido("Este es el documento clonado con algunas modificaciones.");

        documentoClonado.mostrarDetalles();

        System.out.println("Prueba modififcar Date de documento base");

        documentoBase.getFechaCreacion().setTime(200000000L);
        documentoBase.mostrarDetalles();
        documentoClonado.mostrarDetalles();
    }
}
