package vista;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;


public class PanelOperaciones extends JPanel
{
    public static JButton bMostrar;
    public static JButton bCrear;
    public JButton bBorrar;
    public JButton bSalir;

    public PanelOperaciones() 
    {
        bMostrar = new JButton("Mostrar");
        bMostrar.setFont(new Font("Arial", Font.PLAIN, 14));
        bMostrar.setForeground(Color.BLACK);
        bMostrar.setBackground(Color.WHITE);
        bMostrar.setBorder(BorderFactory.createRaisedBevelBorder());
        bMostrar.setBounds(70, 22, 95, 40);
        bMostrar.setActionCommand("Mostrar");

        bCrear = new JButton("Crear");
        bCrear.setFont(new Font("Arial", Font.PLAIN, 14));
        bCrear.setForeground(Color.BLACK);
        bCrear.setBackground(Color.WHITE);
        bCrear.setBorder(BorderFactory.createRaisedBevelBorder());
        bCrear.setBounds(175, 22, 95, 40);
        bCrear.setActionCommand("Crear");

        bBorrar = new JButton("Borrar");
        bBorrar.setFont(new Font("Arial", Font.PLAIN, 14));
        bBorrar.setForeground(Color.BLACK);
        bBorrar.setBackground(Color.WHITE);
        bBorrar.setBorder(BorderFactory.createRaisedBevelBorder());
        bBorrar.setBounds(280, 22, 95, 40);
        bBorrar.setActionCommand("Borrar");

        bSalir = new JButton("Salir");
        bSalir.setFont(new Font("Arial", Font.PLAIN, 14));
        bSalir.setForeground(Color.BLACK);
        bSalir.setBackground(Color.WHITE);
        bSalir.setBorder(BorderFactory.createRaisedBevelBorder());
        bSalir.setBounds(385, 22, 95, 40);
        bSalir.setActionCommand("Cerrar");

        this.setLayout(null);
        this.setBackground(Color.decode("#0DE90D"));
        this.setVisible(true);
        this.add(bMostrar);
        this.add(bCrear);
        this.add(bBorrar);
        this.add(bSalir);
    }
}