package org.utec.modulo4.adapter;

public class AdaptadorAmericanoEuropeo implements EnchufeEuropeo{

    private EnchufeAmericano enchufeAmericano;

    public AdaptadorAmericanoEuropeo(EnchufeAmericano enchufe) {
        this.enchufeAmericano = enchufe;
    }

    @Override
    public void conectar() {
        enchufeAmericano.enchufar();
    }
}
