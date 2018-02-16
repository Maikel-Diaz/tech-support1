import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    Random azar;
    ArrayList<String> respuestas;
    HashMap<String, String> respuestasInput;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        azar = new Random();
        respuestas = new ArrayList<>();
        respuestasInput = new HashMap<>();
        respuestas.add("Disculpe la espera");
        respuestas.add("Le pasaremos con un operador");
        respuestas.add("¿Que es lo que necesita?");
        respuestas.add("No podemos atenderle por el momento, estamos teniendo problemas tecnicos");
        respuestas.add("¿Necesita alguna otra cosa?");
        respuestasInput.put("atencion", "Intentamos ser lo mas rapidos posibles en atenderles, disculpen las molestias");
        respuestasInput.put("preguntas", "Si tiene alguna duda de algo pongase en contacto con nosotros");
        respuestasInput.put("pagos", "puede ver nuestras tarifas de pagos en nuestra pagina web");
        respuestasInput.put("devolucion", "tratamos de ser lo mas rapido posible en devolverle su dinero, gracias por la paciencia");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String input1)
    {
        String respuesta = null;
        respuesta = respuestasInput.get(input1);
        int numeroDeRespuestas = azar.nextInt(respuestas.size());
        if(respuesta == null) {
            respuesta = respuestas.get(azar.nextInt(respuestas.size()));
        }
        return respuestas.get(numeroDeRespuestas);
    }
}
