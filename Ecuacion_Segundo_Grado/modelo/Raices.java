package modelo;

public class Raices
{
    private double a;
    private double b;
    private double c;

    public Raices()
    {
        a = 0;
        b = 0;
        c = 0;
    }

    public Raices(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void obtenerRaices()
    {
        double x1 = (-b+Math.sqrt(getDiscriminante()))/(2*a);
        double x2 = (-b+Math.sqrt(getDiscriminante()))/(2*a);

        System.out.println("Solución X1");
        System.out.println(x1);
        System.out.println("Solución X1");
        System.out.println(x2);
    }

    private void obtenerRaiz()
    {
        double x = (-b)/(2*a);

        System.out.println("Unica Solución");
        System.out.println(x);
    }

    private double getDiscriminante()
    {
        return Math.pow(b, 2) - (4 * a * c);
    }

    private Boolean tieneRaices()
    {
        return getDiscriminante() >= 0;
    }

    private Boolean tieneRaiz()
    {
        return getDiscriminante() == 0;
    }

    // Calcular() es quien nos dira cual debera mostrar en terminal
    public void Calcular()
    {
        if(tieneRaiz())
        {
            obtenerRaiz();
        }
        else if(tieneRaices())
        {
            obtenerRaices();
        }
        else
        {
            System.out.println("No existe raiz.\nNo tiene solución.");
        }
    }
}