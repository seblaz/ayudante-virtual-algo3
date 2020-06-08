package fiuba.algo3.ayudante.virtual.accion;

import fiuba.algo3.ayudante.virtual.*;
import fiuba.algo3.ayudante.virtual.canal.CanalDeConsultas;
import fiuba.algo3.ayudante.virtual.respuesta.Texto;

import java.util.ArrayList;

public class AccionConsulta implements Accion {

    private final ArrayList<Accion> acciones;

    public AccionConsulta(Mensaje mensaje) {
        acciones = new ArrayList<Accion>();
        acciones.add(new EnviarMensaje(Texto.confirmacionDeConsulta(), mensaje.getUsuario()));
        String contenido = String.format(Texto.nuevaConsulta(), mensaje.getUsuario().getNombre(), mensaje.getContenido());
        acciones.add(new EnviarMensaje(contenido, new CanalDeConsultas()));
    }

    @Override
    public void ejecutar(Slack slack) {
        for (Accion accion: acciones) {
            accion.ejecutar(slack);
        }
    }
}
