package fiuba.algo3.ayudante.virtual.respuesta;

import fiuba.algo3.ayudante.virtual.Mensaje;
import fiuba.algo3.ayudante.virtual.accion.Accion;
import fiuba.algo3.ayudante.virtual.accion.AccionConsulta;

public class Consulta implements Respuesta {

    @Override
    public boolean puedeResponder(Mensaje mensaje) {
        return mensaje.getContenido().startsWith("Tengo una consulta");
    }

    @Override
    public Accion getRespuesta(Mensaje mensaje) {
        return new AccionConsulta(mensaje);
    }
}
