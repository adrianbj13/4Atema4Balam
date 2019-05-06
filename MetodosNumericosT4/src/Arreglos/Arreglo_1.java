
package Arreglos;
import Puntos.Punto1;
import java.util.ArrayList;

public class Arreglo_1 {
    public ArrayList lista(double xV ,double incrementoV )
    {
        int puntos=0;
        double x= xV;
        double incremento=incrementoV;
        
        ArrayList<Punto1> datosLista=new ArrayList<>();
        
        for(int i=0; i<5; i++)
        {
            puntos++;
            
            Punto1 p=new Punto1();
            p.setPuntos(puntos);
            if(i==0)
            {
                p.setFunciones("[ tan(x)-tan(x-h) ]/h");
                p.setResultados((Math.tan(x)-Math.tan(x-incremento))/incremento);
            }
            if(i==1)
            {
                p.setFunciones("[ tan(x+h)-tan(x) ]/h");
                p.setResultados((Math.tan(x+incremento)-Math.tan(x))/incremento);
            }
            if(i==2)
            {
                p.setFunciones("[ tan(x+h)-tan(x-h) ]/2h");
                p.setResultados((Math.tan(x+incremento)-(Math.tan(x-incremento)))/(2*incremento));
            }
            if(i==3)
            {
                p.setFunciones("[ 3tan(x)-4tan(x-h)+tan(x-2h) ]/2h");
                p.setResultados(((3*(Math.tan(x)))-(4*(Math.tan(x-incremento)))+(Math.tan(x-(2*incremento))))/(2*incremento));
            }
            if(i==4)
            {
                p.setFunciones("[ -tan(x+2h)+4tan(x+h)-3tan(x) ]/2h");
                p.setResultados(((-1*(Math.tan(x+2*incremento)))+(4*(Math.tan(x+incremento)))-(3*(Math.tan(x))))/(2*incremento));
            }
            datosLista.add(p);
        }
        return datosLista;
    }
}
