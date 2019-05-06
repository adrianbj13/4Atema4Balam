
package Arreglos;

import Puntos.Punto3;
import java.util.ArrayList;

public class Arreglo_3 {
    double solucion;
    public ArrayList lista(double n, double a, double b, int invertir)
    {
        int puntos=-1;
        double sumaPar=0;
        double sumaImpar=0;
        solucion=0;
        double h=0;
        ArrayList<Punto3> datosLista=new ArrayList<>();
        while(puntos < n)
        {
            puntos++;  
            Punto3 p= new Punto3();
            
            p.setPuntos(puntos);
            p.setIncremento((b-a)/n);
            p.setFormula1(a+(p.getPuntos()*p.getIncremento()));
            
            if(invertir==0)
                p.setFormula2(calcularFormula(p.getFormula1()));
            if(invertir==1)
                p.setFormula2(-1*calcularFormula(p.getFormula1()));
            
            h= p.getIncremento();
            if((puntos)%2==0)
            {
                if((puntos)>0 & (puntos-1)<n)
                    sumaPar+=p.getFormula2();
                
            }else
            {
                if((puntos)>0 & (puntos-1)<n)
                    sumaImpar+=p.getFormula2();
            }
            
            datosLista.add(p);
        }
        if(invertir==0)
            solucion= (h/3*(calcularFormula(a)+(4*sumaImpar)+(2*sumaPar)+calcularFormula(b)));
        else
            solucion= (h/3*((-1*calcularFormula(a))+(4*sumaImpar)+(2*sumaPar)+(-1*calcularFormula(b))));
        System.out.println(solucion);
        return datosLista;
    }
    public double getSolucion()
    {
        return solucion;
    }
    
    public double calcularFormula(double x)
    {
        return (x/(Math.sqrt((4-Math.pow(x, 2)))));
    }
}
