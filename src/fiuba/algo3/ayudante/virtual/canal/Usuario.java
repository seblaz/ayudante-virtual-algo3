package fiuba.algo3.ayudante.virtual.canal;

public class Usuario  implements Canalizable {

    private final String nombre;
    private final String id;

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
}
