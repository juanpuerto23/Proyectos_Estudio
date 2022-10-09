import modelo.Raices;
import controlador.Controlador;
import vista.VentanaPrincipal;

public class Ejecutable_main
{
    public static void main(String[] args) 
    {
        Raices miRaices = new Raices();
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        new Controlador(miVentanaPrincipal, miRaices);
    }
}
