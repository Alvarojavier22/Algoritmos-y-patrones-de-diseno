package org.utec.modulo4.decorator;

public class NotificacionSMS extends NotificacionDecorator{

    public NotificacionSMS(Notificacion noti) {
        super(noti);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando notificacion por SMS: " + mensaje);
    }
}
