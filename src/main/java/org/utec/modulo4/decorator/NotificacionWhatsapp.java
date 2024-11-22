package org.utec.modulo4.decorator;

public class NotificacionWhatsapp extends NotificacionDecorator{
    public NotificacionWhatsapp(Notificacion noti) {
        super(noti);
    }
    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando notificacion por Whatsapp: " + mensaje);
    }
}
