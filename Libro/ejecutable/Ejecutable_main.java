package ejecutable;
import modelo.Libro;
import controlador.Controlador;
import vista.VentanaPrincipal;

public class Ejecutable_main
{
    public static void main(String[] args) 
    {
        Libro miLibro = new Libro();
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        new Controlador(miVentanaPrincipal, miLibro);
    }
}
