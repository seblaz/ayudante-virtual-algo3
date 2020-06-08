package fiuba.algo3.ayudante.virtual;

import fiuba.algo3.ayudante.virtual.canal.Usuario;

public class Mensaje {

    private final String contenido;
    private final Usuario usuario;

    public Mensaje(String contenido, Usuario usuario) {
        this.contenido = contenido;
        this.usuario = usuario;
    }

    public String getContenido() {
        return contenido;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
