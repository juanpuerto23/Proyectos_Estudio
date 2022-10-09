package controlador;

import modelo.Libro;
import vista.VentanaPrincipal;
import vista.PanelEntradaDatos;
import vista.PanelOperaciones;
import vista.PanelResultados;
import vista.DialogoNumeroLibros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener
{
    private VentanaPrincipal miVentanaPrincipal;
    private Libro[] miListaLibro;
    private int i;
    private int numeroLibros;

    public Controlador(VentanaPrincipal miVentanaPrincipal, Libro modelo)
    {
        this.miVentanaPrincipal = miVentanaPrincipal;
        this.miVentanaPrincipal.miDialogoNumeroLibros.bAceptar.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperaciones.bBorrar.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperaciones.bSalir.addActionListener(this);
        PanelOperaciones.bMostrar.addActionListener(this);
        PanelOperaciones.bCrear.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String comando = ae.getActionCommand();

        if (comando.equals("Aceptar"))
        {
            i = 0;
            numeroLibros = Integer.parseInt(DialogoNumeroLibros.getLibros());
            PanelResultados.mostrarResultados("Se han establecido " + numeroLibros + " libros.");
            miListaLibro = Libro.crearListaLibros(numeroLibros);
            miVentanaPrincipal.miDialogoNumeroLibros.cerrarDialogo();
        }

        else if (comando.equals("Crear"))
        {
            if (i <= numeroLibros - 1)
            {
                i = 0;
                String autor = PanelEntradaDatos.getTfAutor();
                String titulo = PanelEntradaDatos.gettfTituloLibro();
                int ISBN = Integer.parseInt(PanelEntradaDatos.gettfISBN());
                int numPaginas = Integer.parseInt(PanelEntradaDatos.getTfNumPaginas());
                Libro miLibro = new Libro(ISBN, numPaginas, autor, titulo);
                miListaLibro[i] = miLibro;
                //Nota: Toca poner estos datos en orden (guiarse con el ejecutable)
                PanelResultados.mostrarResultados("\nEl libro " + titulo + " hecho por " + autor + " con ISBN: " + ISBN + " . \nEste libro tiene " + numPaginas + " páginas.");
        
            }

            else
            {
            JOptionPane.showMessageDialog(null, "No hay empleado disponibles");
            }

        }
        else if (comando.equals("Borrar")) 
        {
            vista.PanelEntradaDatos.borrarTf();
        }

        else if (comando.equals("Cerrar"))
        {
            JOptionPane.showMessageDialog(null, "El programa se apagara...", "Apagar Programa", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

        else if (comando.equals("Mostrar"))
        {
            PanelResultados.mostrarResultados("\nEl libro con mayor numeros de paginas es: ");
            //Meter el Libro.CalcularMayor al final de la anterior sentencia
        }
    } 
}