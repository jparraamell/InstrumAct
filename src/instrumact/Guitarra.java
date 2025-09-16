/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instrumact;
import java.net.URL;
/**
 *
 * @author jparr
 */
public class Guitarra extends InstrumentosBase {
    //Constructor que se le pasa el nombre
    public Guitarra() {
        super("Guitarra"); // Asigna el nombre directamente
    }
    @Override
    public URL Sonar() {
        return getClass().getResource("/Sonidos/Guitarra.wav");
    }
    @Override
    public URL ImagenInstrumento() {
        return getClass().getResource("/Images/guitarra.jpg");
    }
    @Override
    public String DescripcionInstrumento() {
        return "La guitarra es un instrumento musical de cuerda,\n"
             + "utilizado en diversos géneros musicales alrededor del mundo.\n"
             + "Cuenta con seis cuerdas que se pueden tocar con los dedos o con una púa.\n"
             + "Existen varios tipos de guitarras, como la acústica, la clásica y la eléctrica,\n"
             + "cada una con características únicas.\n\n"
             + "Su sonido se genera al pulsar las cuerdas,\n"
             + "transmitiendo las vibraciones a la caja de resonancia\n"
             + "o a un amplificador en el caso de las guitarras eléctricas.\n"
             + "Es un instrumento versátil que se usa en estilos como\n"
             + "el rock, el flamenco, el jazz y la música clásica.";
        }
}
