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
public class Piano extends InstrumentosBase {

    public Piano() {
        super("Piano");
    }
    @Override
        public URL Sonar() {
            return getClass().getResource("/Sonidos/Piano.wav");
     }
    @Override
    public URL ImagenInstrumento() {
        return getClass().getResource("/Images/piano.jpg");
    }

  @Override
    public String DescripcionInstrumento() {
    return "El piano es un instrumento musical de cuerda percutida,\n"
         + "considerado uno de los más versátiles y populares del mundo.\n"
         + "Posee un teclado con 88 teclas que permiten interpretar\n"
         + "una amplia gama de sonidos y dinámicas.\n"
         + "Su sonido se produce cuando los martillos internos golpean\n"
         + "las cuerdas al presionar las teclas.\n"
         + "Existen diferentes tipos de pianos, como el piano acústico,\n"
         + "de cola, vertical y el piano digital.\n"
         + "Es fundamental en la música clásica, el jazz y la música moderna.";
    }
    
}
