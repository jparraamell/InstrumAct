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
public class Saxofon extends InstrumentosBase{

    public Saxofon() {
        super("Saxofón");
    }
    @Override
    public URL Sonar() {
        return getClass().getResource("/Sonidos/Saxofon.wav");
    }
    @Override
    public URL ImagenInstrumento() {
        return getClass().getResource("/Images/saxofon.jpg");
    }
    @Override
    public String DescripcionInstrumento() {
        return "El piano es un instrumento musical de cuerda percutida,\n"
             + "caracterizado por su teclado de 88 teclas.\n"
             + "Es ampliamente utilizado en la música clásica, jazz y pop.\n\n"
             + "El sonido se genera cuando los martillos internos golpean\n"
             + "las cuerdas al presionar las teclas, produciendo una amplia\n"
             + "variedad de tonos y matices dinámicos.\n\n"
             + "Existen diferentes tipos de pianos, como el de cola,\n"
             + "vertical y digital, cada uno con características únicas.";
    }
}
