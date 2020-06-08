package fiuba.algo3.ayudante.virtual.respuesta;

import fiuba.algo3.ayudante.virtual.Mensaje;
import fiuba.algo3.ayudante.virtual.accion.Accion;
import fiuba.algo3.ayudante.virtual.accion.EnviarMensaje;
import fiuba.algo3.ayudante.virtual.canal.Usuario;

public class Saludo implements Respuesta {

    @Override
    public boolean puedeResponder(Mensaje mensaje) {
        return mensaje.getContenido().startsWith("hola");
    }

    @Override
    public Accion getRespuesta(Mensaje mensaje) {
        Usuario usuario = mensaje.getUsuario();
        String contenido = String.format(Texto.saludo(), usuario.getNombre());
        return new EnviarMensaje(contenido, usuario);
    }
}
