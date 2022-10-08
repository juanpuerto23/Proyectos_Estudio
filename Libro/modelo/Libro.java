package modelo;

public class Libro 
{
    //Atributos
    private int ISBN;
    private int numPaginas;
    private String autor;
    private String titulo;

    //Constructores
    public Libro(int pISBN, int pnumPaginas, String pAutor, String pTitulo)
    {
        //Se pone una p antes del nombre para que el programa diferencie los atributos de las variables, sino entonces se pone this.<name>=<name>
        ISBN = pISBN;
        numPaginas = pnumPaginas;
        autor = pAutor;
        titulo = pTitulo;
    }

    //Metodos (Get es para obtener datos, Set es para guardarlos)
    public int getISBN()
    {
        return ISBN;
    }

    public void setISBN(int ISBN)
    {
        this.ISBN = ISBN;
    }
    
    public int getNumPaginas()
    {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas)
    {
        this.numPaginas = numPaginas;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    //Para adentro de la clase se usa el nombre del atributo normal, mientras que para afuera se usa el get mas el nombre del atributo


    public String toString()
    {
        return  ("El libro " + titulo + " con ISBN " + ISBN + " creado por el autor " + autor + " tiene "+ numPaginas +" páginas");
    }


    

}