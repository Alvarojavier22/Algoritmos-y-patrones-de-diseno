package org.utec.modulo3.prototype;

import java.util.Date;

public class Documento implements Clonable {

    private String titulo;
    private String contenido;
    private String autor;
    private Date fechaCreacion;

    public Documento(String titulo, String contenido, String autor, Date fechaCreacion) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public Documento clonar(){
        return new Documento(this.titulo, this.contenido, this.autor, new Date());
    }
    public void mostrarDetalles(){
        System.out.println("Titulo: " + this.titulo
        + ", Autor: " + this.autor
        + ", Fecha de Creacion: " + this.fechaCreacion);
        System.out.println("Contenido: " + this.contenido);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
