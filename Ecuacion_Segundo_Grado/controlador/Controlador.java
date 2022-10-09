package controlador;

import modelo.Raices;
import vista.VentanaPrincipal;
import vista.PanelOperaciones;
import vista.PanelResultados;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener
{
    private VentanaPrincipal miVentanaPrincipal;

    public Controlador(VentanaPrincipal miVentanaPrincipal, Raices modelo)
    {
        this.miVentanaPrincipal = miVentanaPrincipal;
        this.miVentanaPrincipal.miPanelOperaciones.bBorrar.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperaciones.bSalir.addActionListener(this);
        PanelOperaciones.bCalcular.addActionListener(this);
        PanelOperaciones.bCrear.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String comando = ae.getActionCommand();

        if (comando.equals("Borrar")) 
        {
            vista.PanelEntradaDatos.borrarTf();
        }

        else if (comando.equals("Cerrar"))
        {
            JOptionPane.showMessageDialog(null, "El programa se apagara...", "Apagar Programa", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

        else if (comando.equals("Calcular"))
        {
            PanelResultados.mostrarResultados("\nEl libro con mayor numeros de paginas es: ");
            //Meter el Libro.CalcularMayor al final de la anterior sentencia
        }
    } 
}