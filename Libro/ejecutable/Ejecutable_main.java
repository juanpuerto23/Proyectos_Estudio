package ejecutable;
import modelo.Libro;

public class Ejecutable_main
{
    public static void main(String[] args) 
    {
        Libro libro1 = new Libro(123, 42, "Autor1", "Titulo1");
        Libro libro2 = new Libro(123124, 52, "Autor2", "Titulo2");

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        if(libro1.getNumPaginas()>libro2.getNumPaginas())
        {
            System.out.println(libro1.getTitulo() + " tiene mas páginas que " + libro2.getTitulo());
        } 
        else 
        {
            System.out.println(libro2.getTitulo() + " tiene mas páginas que " + libro1.getTitulo());
        }
    }
}
