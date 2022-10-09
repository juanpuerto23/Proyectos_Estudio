package vista;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;


public class DialogoNumeroLibros extends JDialog
{
    private JLabel lbTitulo;
    private JLabel lbLibro;
    private static JTextField tfLibro;
    public JButton bAceptar;

    public DialogoNumeroLibros() 
    {
        lbTitulo = new JLabel("Número de libros", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        lbTitulo.setBounds(10, 10, 280, 20);
        lbLibro = new JLabel("Libros = ", SwingConstants.RIGHT);
        lbLibro.setFont(new Font("Arial", Font.PLAIN, 18));
        lbLibro.setBounds(10, 85, 140, 20);

        tfLibro = new JTextField();
        tfLibro.setFont(new Font("Arial", Font.PLAIN, 18));
        tfLibro.setBounds(150, 85, 100, 25);

        bAceptar = new JButton("Aceptar");
        bAceptar.setFont(new Font("Arial", Font.PLAIN, 14));
        bAceptar.setForeground(Color.BLACK);
        bAceptar.setBackground(Color.WHITE);
        bAceptar.setBorder(BorderFactory.createRaisedBevelBorder());
        bAceptar.setBounds(95, 130, 95, 40);
        bAceptar.setActionCommand("Aceptar");

        this.setLayout(null);
        this.getContentPane().setBackground(Color.decode("#0DE90D"));
        this.add(lbTitulo);
        this.add(lbLibro);
        this.add(tfLibro);
        this.add(bAceptar);
        this.setTitle("Número de libros");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    public static String getLibros() 
    {
        return tfLibro.getText();
    }

    public void cerrarDialogo() 
    {
        this.dispose();
    }
}
