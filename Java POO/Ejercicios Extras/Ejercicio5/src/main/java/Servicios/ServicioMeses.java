package Servicios;

import Entidades.Meses;
import java.util.Arrays;
import java.util.Calendar;

public class ServicioMeses {
    
    public Meses crearMeses(){
        
        Meses m1 = new Meses();
        
        m1.getMesSecreto()[10] = m1.getYear()[2];
        
        System.out.println(Arrays.toString(m1.getYear()));
        
        
        return m1;
    }

}
