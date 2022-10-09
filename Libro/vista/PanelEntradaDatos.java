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
    private JLabel lbAutor;
    private JLabel lbNumPaginas;
    private JLabel lbISBN;
    private JLabel lbTituloLibro;
    private JLabel lbLogo;
    private ImageIcon iLogo;
    private static JTextField tfAutor;
    private static JTextField tfNumPaginas;
    private static JTextField tfISBN;
    private static JTextField tfTituloLibro;

    public PanelEntradaDatos() {
        lbTitulo = new JLabel("EJERCICIO LIBRO", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        lbTitulo.setForeground(Color.BLACK);
        lbTitulo.setBounds(100, 10, 572, 30);
        this.add(lbTitulo);

        lbAutor = new JLabel("Autor =");
        lbAutor.setFont(new Font("Serif", Font.PLAIN, 18));
        lbAutor.setForeground(Color.BLACK);
        lbAutor.setBounds(260, 70, 480, 30);
        this.add(lbAutor);

        tfAutor = new JTextField();
        tfAutor.setFont(new Font("Arial", Font.PLAIN, 18));
        tfAutor.setForeground(Color.BLACK);
        tfAutor.setBounds(365, 70, 190, 30);
        this.add(tfAutor);

        lbNumPaginas = new JLabel("Paginas =");
        lbNumPaginas.setFont(new Font("Serif", Font.PLAIN, 18));
        lbNumPaginas.setForeground(Color.BLACK);
        lbNumPaginas.setBounds(250, 110, 480, 30);
        this.add(lbNumPaginas);

        tfNumPaginas = new JTextField();
        tfNumPaginas.setFont(new Font("Arial", Font.PLAIN, 18));
        tfNumPaginas.setForeground(Color.BLACK);
        tfNumPaginas.setBounds(365, 110, 190, 30);
        this.add(tfNumPaginas);

        lbISBN = new JLabel("ISBN =");
        lbISBN.setFont(new Font("Serif", Font.PLAIN, 18));
        lbISBN.setForeground(Color.BLACK);
        lbISBN.setBounds(260, 150, 480, 30);
        this.add(lbISBN);

        tfISBN = new JTextField();
        tfISBN.setFont(new Font("Arial", Font.PLAIN, 18));
        tfISBN.setForeground(Color.BLACK);
        tfISBN.setBounds(365, 150, 190, 30);
        this.add(tfISBN);

        lbTituloLibro = new JLabel("Titulo =");
        lbTituloLibro.setFont(new Font("Serif", Font.PLAIN, 18));
        lbTituloLibro.setForeground(Color.BLACK);
        lbTituloLibro.setBounds(260, 190, 480, 30);
        this.add(lbTituloLibro);

        tfTituloLibro = new JTextField();
        tfTituloLibro.setFont(new Font("Arial", Font.PLAIN, 18));
        tfTituloLibro.setForeground(Color.BLACK);
        tfTituloLibro.setBounds(365, 190, 190, 30);
        this.add(tfTituloLibro);

        iLogo = new ImageIcon("imagenes/libro.png");

        lbLogo = new JLabel(iLogo);
        lbLogo.setOpaque(true);
        lbLogo.setBorder(BorderFactory.createRaisedBevelBorder());
        lbLogo.setBounds(20, 40, 210, 180);
        this.add(lbLogo);

        this.setLayout(null);
        this.setBackground(Color.decode("#0DE90D"));
        this.setVisible(true);
    }

    public static String getTfAutor() {
        return tfAutor.getText();
    }

    public static String getTfNumPaginas() {
        return tfNumPaginas.getText();
    }

    public static String gettfISBN() {
        return tfISBN.getText();
    }

    public static String gettfTituloLibro() {
        return tfTituloLibro.getText();
    }

    public static void borrarTf() {
        JOptionPane.showMessageDialog(null, "Los datos serán eliminados...", "Eliminar datos", JOptionPane.WARNING_MESSAGE);
        tfAutor.setText("");
        tfNumPaginas.setText("");
        tfISBN.setText("");
        tfTituloLibro.setText("");
        PanelResultados.taResultados.setText("");
    }
}