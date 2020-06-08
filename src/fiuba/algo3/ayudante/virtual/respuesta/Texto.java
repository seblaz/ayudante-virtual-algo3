package fiuba.algo3.ayudante.virtual.respuesta;

public class Texto {

    public static String saludo() {
        return "Hola %s! Acá podés enviar consultas particulares que no puedas compartir en canales con otros alumnos. Simplemente enviame la consulta, empezando con 'Tengo una consulta', y uno de los ayudantes se contactará con vos en cuanto le sea posible.";
    }

    public static String confirmacionDeConsulta() {
        return "Gracias por enviar tu consulta, en breve un ayudante te contactará para resolverla. Saludos!";
    }

    public static String nuevaConsulta() {
        return "%s tiene una nueva consulta %s";
    }

    public static String noEntendido() {
        return "Lo siento, no entendí lo que querés hacer. Escribí 'ayuda' para ver que puedo hacer por vos.";
    }
}
