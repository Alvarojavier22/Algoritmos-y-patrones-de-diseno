package org.utec.modulo4.decorator;

public class Cliente {
    public static void main(String[] args) {
        Notificacion notificacion = new NotificacionEmail();

        notificacion = new NotificacionSMS(notificacion);

        notificacion = new NotificacionWhatsapp(notificacion);

        notificacion.enviar("Tienen una nueva alerta");
    }
}
