package fiuba.algo3.ayudante.virtual;

import fiuba.algo3.ayudante.virtual.accion.Accion;
import fiuba.algo3.ayudante.virtual.respuesta.Conversacion;

public class AyudanteVirtual {

    private Slack slack;
    private Conversacion conversacion;

    public AyudanteVirtual(Slack slack) {
        conversacion = new Conversacion();
        this.slack = slack;
    }

    public void recibirMensaje(Mensaje mensaje) {
        Accion accion = conversacion.getRespuesta(mensaje);
        accion.ejecutar(slack);
    }
}
