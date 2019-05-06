
package Arreglos;

import Puntos.Punto2;
import java.util.ArrayList;

public class Arreglo_2 {
    double solucion;
    public ArrayList lista(double n, double limiteA, double limiteB,int invertir)
    {
        int puntos=-1;
        double suma=0;
        solucion=0;
        double h=0;
        ArrayList<Punto2> datosLista=new ArrayList<>();
        while(puntos < n)
        {
            
            if(n<=2)
            {
                Punto2 p= new Punto2();
                puntos++; 
                p.setPuntos(puntos);
                
                p.setIncremento((limiteB-limiteA)/2);
                if(invertir==0)
                {
                    p.setFormula1(p.getIncremento()*(calcularFormula(limiteA)+calcularFormula(limiteB)));
                    p.setFormula2(p.getIncremento()*(calcularFormula(limiteA)+calcularFormula(limiteB)));
                }
                else
                {
                    p.setFormula1(p.getIncremento()*((-1*calcularFormula(limiteA))+(-1*calcularFormula(limiteB))));
                    p.setFormula2(p.getIncremento()*((-1*calcularFormula(limiteA))+(-1*calcularFormula(limiteB))));
                }
                h= p.getIncremento();
                if((puntos)>0 & (puntos)<n)
                    suma+=p.getFormula2();
                datosLista.add(p);

            }
            if(n>2)
            {
                Punto2 p= new Punto2();
                puntos++; 
                p.setPuntos(puntos);
                p.setIncremento((limiteB-limiteA)/n);
                p.setFormula1(limiteA+(p.getPuntos()*p.getIncremento()));
                if(invertir==1)
                    p.setFormula2(-1*calcularFormula(p.getFormula1()));
                else
                    p.setFormula2(calcularFormula(p.getFormula1()));

                h= p.getIncremento();
                if((puntos)>0 & (puntos)<n)
                    suma+=p.getFormula2();
                datosLista.add(p);
            }
                System.out.println( "suma  "+suma);
        }
        if(n<=2)
        {
            if(invertir==1)
                solucion= h*((-1*calcularFormula(limiteA))+(-1*calcularFormula(limiteB)));
            else
                solucion= h*((calcularFormula(limiteA))+(calcularFormula(limiteB)));
        }
        else
        {
            if(invertir==1)
                solucion= (h/2*((-1*calcularFormula(limiteA))+(2*suma)+(-1*calcularFormula(limiteB))));
            else
                solucion= (h/2*((calcularFormula(limiteA))+(2*suma)+(calcularFormula(limiteB))));
        }
        
        System.out.println(solucion);
        return datosLista;
    }
    public double getSolucion()
    {
        return solucion;
    }
    
    public double calcularFormula(double x)
    {
        return Math.pow(x, 2);
    }
}
