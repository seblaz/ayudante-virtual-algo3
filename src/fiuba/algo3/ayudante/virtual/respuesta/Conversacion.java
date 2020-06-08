package fiuba.algo3.ayudante.virtual.respuesta;

import fiuba.algo3.ayudante.virtual.Mensaje;
import fiuba.algo3.ayudante.virtual.accion.Accion;

import java.util.ArrayList;
import java.util.List;

public class Conversacion {

    private final List<Respuesta> respuestas;

    public Conversacion() {
        respuestas = new ArrayList<Respuesta>();
        respuestas.add(new Saludo());
        respuestas.add(new Consulta());
        respuestas.add(new NoEntendido());
    }

    public Accion getRespuesta(Mensaje mensaje) {
        return respuestas
                .stream()
                .filter(respuesta -> respuesta.puedeResponder(mensaje))
                .findFirst()
                .get()
                .getRespuesta(mensaje);
    }
}
