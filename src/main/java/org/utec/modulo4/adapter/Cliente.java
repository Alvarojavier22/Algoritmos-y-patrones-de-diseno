package org.utec.modulo4.adapter;

public class Cliente {
    public static void main(String[] args) {

        EnchufeAmericano enchufeAmericano = new EnchufeAmericano();
        EnchufeEuropeo adaptador = new AdaptadorAmericanoEuropeo(enchufeAmericano);
        adaptador.conectar();
    }
}
