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
public class Tambor extends InstrumentosBase {
    //Constructor que se le pasa el nombre
    public Tambor() {
        super("Tambor");
    }
     @Override
    public URL Sonar() {
        return getClass().getResource("/Sonidos/Tambor.wav");
    }
    
    @Override
    public URL ImagenInstrumento() {
        return getClass().getResource("/Images/tambor.jpg");
    }
    @Override
    public String DescripcionInstrumento() {
        return "El tambor es un instrumento de percusión,\n"
             + "utilizado en diversas culturas y géneros musicales.\n"
             + "Consiste en una caja de resonancia cubierta con una membrana,\n"
             + "que se golpea con baquetas o con las manos para producir sonido.\n\n"
             + "Existen distintos tipos de tambores, como el tambor militar,\n"
             + "el bongó, la batería y los tambores africanos,\n"
             + "cada uno con un sonido y uso característico.\n"
             + "Su ritmo y cadencia lo convierten en un elemento esencial\n"
             + "en la música tradicional y moderna.";
    } 
}
