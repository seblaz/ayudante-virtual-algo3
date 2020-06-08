package fiuba.algo3.ayudante.virtual.accion;

import fiuba.algo3.ayudante.virtual.canal.Canalizable;
import fiuba.algo3.ayudante.virtual.Slack;

public class EnviarMensaje implements Accion {

    private String mensaje;
    private Canalizable canal;

    public EnviarMensaje(String mensaje, Canalizable canal) {
        this.mensaje = mensaje;
        this.canal = canal;
    };

    @Override
    public void ejecutar(Slack slack) {
        slack.enviarMensaje(mensaje, canal);
    }
}
