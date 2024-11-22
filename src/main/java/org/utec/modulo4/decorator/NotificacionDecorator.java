package org.utec.modulo4.decorator;

public abstract class NotificacionDecorator implements Notificacion {

    protected Notificacion notificacion;

    public NotificacionDecorator(Notificacion noti) {
        this.notificacion = noti;
    }

    @Override
    public void enviar(String mensaje) {
        notificacion.enviar(mensaje);
    }
}
