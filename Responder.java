import java.util.ArrayList;
import java.util.Random;

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
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        azar = new Random();
        respuestas = new ArrayList<>();
        respuestas.add("Disculpe la espera");
        respuestas.add("Le pasaremos con un operador");
        respuestas.add("¿Que es lo que necesita?");
        respuestas.add("No podemos atenderle por el momento, estamos teniendo problemas tecnicos");
        respuestas.add("¿Necesita alguna otra cosa?");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int numeroDeRespuestas = azar.nextInt(respuestas.size());
        return respuestas.get(numeroDeRespuestas);
    }
}
