package instrumact;

//Librerías
import java.io.File; // Manejo de archivos  
import java.io.IOException; // Excepciones de I/O  
import java.net.URL; // Manejo de direcciones de recursos  
import javax.sound.sampled.*; // Manejo de audio  
import java.awt.Image; // Manipulación de imágenes  
import javax.swing.ImageIcon; // Iconos de imágenes en Swing  
import javax.imageio.ImageIO; // Lectura/escritura de imágenes  

public abstract class InstrumentosBase implements ISonar {
    //Variables
    private Clip clip;
    private String nombre;
    // Constructor con parámetro
    public InstrumentosBase(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Métodos abstractos
    public abstract URL ImagenInstrumento();
    public abstract String DescripcionInstrumento();
    //Método concreto para reproducir el sonido
    public void ReproducirSonido() {
        //URL url = Sonar();
        //File archivoAudio = new File(url.toURI());
        if(clip == null || !clip.isRunning()){
            try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(Sonar().toURI()))  )  {
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.println("Sonido reproduciéndose...");
        } catch (Exception e) {
            System.err.println("Error al reproducir el sonido: " + e.getMessage());
        }
       }
    }
    //Método de tipo ImageIcon para cargar las imágenes
    public ImageIcon CargarImagen(int ancho, int alto) {
        try {
            //URL imageUrl = ImagenInstrumento();
            //Image img = ImageIO.read(imageUrl);
        return new ImageIcon(ImageIO.read(ImagenInstrumento()).getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));
        } catch (IOException e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
            return null; // O retornar una imagen por defecto
        }
    }
    //Método que permite detener el sonido
    @Override
    public void DetenerSonido() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
            System.out.println("Se detuvo...");
        }
    }
    //Método para devolver el nombre
    @Override
    public String toString() {
        return this.nombre;
    }
}
