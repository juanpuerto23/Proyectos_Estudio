package vista;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class PanelEntradaDatos extends JPanel
{
    private JLabel lbTitulo;
    private JLabel lbvariableA;
    private JLabel lbvariableB;
    private JLabel lbvariableC;
    private JLabel lbLogo;
    private ImageIcon iLogo;
    private static JTextField tfvariableA;
    private static JTextField tfvariableB;
    private static JTextField tfvariableC;

    public PanelEntradaDatos() {
        lbTitulo = new JLabel("EJERCICIO ECUACIÓN SEGUNDO GRADO", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        lbTitulo.setForeground(Color.BLACK);
        lbTitulo.setBounds(100, 10, 572, 30);
        this.add(lbTitulo);

        lbvariableA = new JLabel("A =");
        lbvariableA.setFont(new Font("Serif", Font.PLAIN, 18));
        lbvariableA.setForeground(Color.BLACK);
        lbvariableA.setBounds(260, 70, 480, 30);
        this.add(lbvariableA);

        tfvariableA = new JTextField();
        tfvariableA.setFont(new Font("Arial", Font.PLAIN, 18));
        tfvariableA.setForeground(Color.BLACK);
        tfvariableA.setBounds(365, 70, 190, 30);
        this.add(tfvariableA);

        lbvariableB = new JLabel("B =");
        lbvariableB.setFont(new Font("Serif", Font.PLAIN, 18));
        lbvariableB.setForeground(Color.BLACK);
        lbvariableB.setBounds(250, 110, 480, 30);
        this.add(lbvariableB);

        tfvariableB = new JTextField();
        tfvariableB.setFont(new Font("Arial", Font.PLAIN, 18));
        tfvariableB.setForeground(Color.BLACK);
        tfvariableB.setBounds(365, 110, 190, 30);
        this.add(tfvariableB);

        lbvariableC = new JLabel("C =");
        lbvariableC.setFont(new Font("Serif", Font.PLAIN, 18));
        lbvariableC.setForeground(Color.BLACK);
        lbvariableC.setBounds(260, 150, 480, 30);
        this.add(lbvariableC);

        tfvariableC = new JTextField();
        tfvariableC.setFont(new Font("Arial", Font.PLAIN, 18));
        tfvariableC.setForeground(Color.BLACK);
        tfvariableC.setBounds(365, 150, 190, 30);
        this.add(tfvariableC);

        iLogo = new ImageIcon("imagenes/ecuaciones_segundo_grado.jpg");

        lbLogo = new JLabel(iLogo);
        lbLogo.setOpaque(true);
        lbLogo.setBorder(BorderFactory.createRaisedBevelBorder());
        lbLogo.setBounds(20, 40, 210, 180);
        this.add(lbLogo);

        this.setLayout(null);
        this.setBackground(Color.decode("#0DE90D"));
        this.setVisible(true);
    }

    public static String getTfvariableA() {
        return tfvariableA.getText();
    }

    public static String getTfvariableB() {
        return tfvariableB.getText();
    }

    public static String gettfvariableC() {
        return tfvariableC.getText();
    }

    public static void borrarTf() {
        JOptionPane.showMessageDialog(null, "Los datos serán eliminados...", "Eliminar datos", JOptionPane.WARNING_MESSAGE);
        tfvariableA.setText("");
        tfvariableB.setText("");
        tfvariableC.setText("");
        PanelResultados.taResultados.setText("");
    }
}