

package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;

    public VentanaPrincipal() 
    {
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10, 10, 572, 260);

        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10, 280, 572, 80);

        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10, 370, 572, 288);

        this.setTitle("Ejercicio Ecuación Segundo Grado");
        this.setSize(600, 700);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.add(miPanelEntradaDatos);
        this.add(miPanelOperaciones);
        this.add(miPanelResultados);

    }
}
