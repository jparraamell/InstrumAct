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
public class Acordeon extends InstrumentosBase {
    //Constructor que se le pasa el nombre

    public Acordeon() {
        super("Acordeón");
    }
    @Override
    public URL Sonar() {
        return getClass().getResource("/Sonidos/Acordeon.wav");
    }
    @Override
    public URL ImagenInstrumento() {
        return getClass().getResource("/Images/acordeon.jpg");
    }
    @Override
    public String DescripcionInstrumento() {
        return "El acordeón es un instrumento musical de viento con fuelles,\n"
             + "teclado y botones, utilizado en diversos géneros musicales\n"
             + "como el vallenato, el tango y la música folk.\n"
             + "Su sonido se produce al comprimir y expandir el fuelle\n"
             + "mientras se presionan las teclas o botones,\n"
             + "permitiendo una gran variedad de melodías.";
    }
}
