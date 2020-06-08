package fiuba.algo3.ayudante.virtual;

import fiuba.algo3.ayudante.virtual.canal.Canalizable;

import java.util.ArrayList;

public class Slack {

    private ArrayList<String> mensajes;
    private ArrayList<Canalizable> canales;

    public Slack() {
        this.mensajes = new ArrayList<>();
        this.canales = new ArrayList<>();
    }

    public void enviarMensaje(String mensaje, Canalizable canal) {
        this.mensajes.add(mensaje);
        this.canales.add(canal);
    }

    public String getMensaje() {
        return this.getMensaje(0);
    }

    public Canalizable getCanal() {
        return this.getCanal(0);
    }

    public String getMensaje(int index) {
        return mensajes.get(index);
    }

    public Canalizable getCanal(int index) {
        return canales.get(0);
    }
}
