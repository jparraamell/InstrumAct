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
public class Violin extends InstrumentosBase{
    public Violin() {
        super("Violín");
    }
    @Override
    public URL Sonar() {
        return getClass().getResource("/Sonidos/Violin.wav");
    }
    @Override
    public URL ImagenInstrumento() {
        return getClass().getResource("/Images/violin.jpg");
    }
  @Override
    public String DescripcionInstrumento() {
        return "El violín es un instrumento de cuerda frotada,\n"
             + "compuesto por cuatro cuerdas afinadas en quintas.\n"
             + "Se toca con un arco recubierto de crines de caballo,\n"
             + "frotando las cuerdas para producir sonido.\n\n"
             + "Es un instrumento fundamental en la música clásica,\n"
             + "pero también se usa en géneros como el jazz y el folk.\n"
             + "Su sonido varía según la técnica del intérprete\n"
             + "y la calidad del instrumento.";
    }
}
