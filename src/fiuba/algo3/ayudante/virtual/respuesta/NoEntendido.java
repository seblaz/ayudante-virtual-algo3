package fiuba.algo3.ayudante.virtual.respuesta;

import fiuba.algo3.ayudante.virtual.Mensaje;
import fiuba.algo3.ayudante.virtual.accion.Accion;
import fiuba.algo3.ayudante.virtual.accion.EnviarMensaje;

public class NoEntendido implements Respuesta {
    @Override
    public boolean puedeResponder(Mensaje mensaje) {
        return true;
    }

    @Override
    public Accion getRespuesta(Mensaje mensaje) {
        return new EnviarMensaje(Texto.noEntendido(), mensaje.getUsuario());
    }
}
