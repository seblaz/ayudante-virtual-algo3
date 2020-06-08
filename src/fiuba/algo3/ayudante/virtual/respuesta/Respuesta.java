package fiuba.algo3.ayudante.virtual.respuesta;

import fiuba.algo3.ayudante.virtual.Mensaje;
import fiuba.algo3.ayudante.virtual.accion.Accion;

public interface Respuesta {
    boolean puedeResponder(Mensaje mensaje);
    Accion getRespuesta(Mensaje mensaje);
}
