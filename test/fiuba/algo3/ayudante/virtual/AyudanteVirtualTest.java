package fiuba.algo3.ayudante.virtual;

import fiuba.algo3.ayudante.virtual.canal.Usuario;
import fiuba.algo3.ayudante.virtual.respuesta.Texto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AyudanteVirtualTest {

    @Test
    void alRecibirMensajeQueEmpiezaConHolaRespondeUnMensajeDeSaludo() {
        Slack slack = new Slack();
        AyudanteVirtual ayudante = new AyudanteVirtual(slack);
        Usuario martin = new Usuario("martin", "1");
        Mensaje mensaje = new Mensaje("hola ayudante", martin);

        ayudante.recibirMensaje(mensaje);

        assertEquals(String.format(Texto.saludo(), martin.getNombre()), slack.getMensaje());
    }

    @Test
    void alRecibirMensajeExtranioRespondeUnMensajeDeAyuda() {
        Slack slack = new Slack();
        AyudanteVirtual ayudante = new AyudanteVirtual(slack);
        Usuario martin = new Usuario("martin", "1");
        Mensaje mensaje = new Mensaje("esto no lo entiende el ayudante", martin);

        ayudante.recibirMensaje(mensaje);

        assertEquals(Texto.noEntendido(), slack.getMensaje());
    }

    @Test
    void alRecibirUnaConsultaRespondeUnMensajeDeConfirmacion() {
        Slack slack = new Slack();
        AyudanteVirtual ayudante = new AyudanteVirtual(slack);
        Usuario martin = new Usuario("martin", "1");
        Mensaje mensaje = new Mensaje("Tengo una consulta: qué gusto tiene la sal?", martin);

        ayudante.recibirMensaje(mensaje);

        assertEquals(Texto.confirmacionDeConsulta(), slack.getMensaje(0));
    }

    @Test
    void alRecibirUnaConsultaLaEnviaAlCanalDeLosAyudantes() {
        Slack slack = new Slack();
        AyudanteVirtual ayudante = new AyudanteVirtual(slack);
        Usuario martin = new Usuario("martin", "1");
        Mensaje mensaje = new Mensaje("Tengo una consulta: qué gusto tiene la sal?", martin);

        ayudante.recibirMensaje(mensaje);

        assertTrue(slack.getMensaje(1).contains("Tengo una consulta: qué gusto tiene la sal?"));
    }

}