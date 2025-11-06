
package ec.edu.espoch.pracitcaautomovil;

import ec.edu.espoch.pracitcaautomovil.clases.Automovil;
import ec.edu.espoch.pracitcaautomovil.enumeraciones.ColoresAutomovil;
import ec.edu.espoch.pracitcaautomovil.enumeraciones.TipoAutomovil;
import ec.edu.espoch.pracitcaautomovil.enumeraciones.TipoCombustible;


public class PracitcaAutomovil {

    public static void main(String[] args){
        Automovil autoUno=new Automovil("Chevrolet", 2020, 2.0, TipoCombustible.GASOLINA, TipoAutomovil.CIUDAD, 4, 5, 130, ColoresAutomovil.ROJO, 0);
        autoUno.imprimirDatosAutomovil();
        autoUno.setVelocidadAct(100);
        System.out.println(autoUno.getVelocidadAct());
        autoUno.Aceleracion(20);
        System.out.println(autoUno.getVelocidadAct());
        autoUno.Desacelerar(50);
        System.out.println(autoUno.getVelocidadAct());
        autoUno.Frenar();
        System.out.println(autoUno.getVelocidadAct());
        
        Automovil autoDos=new Automovil("Toyota", 2015, 2.5, TipoCombustible.DIESEL, TipoAutomovil.FAMILIAR, 4, 5, 120, ColoresAutomovil.BLANCO, 0);
        autoDos.setVelocidadAct(75);
        
        System.out.println("Tiempo estimado: "+autoDos.calcTiempoLlegada(120)+" horas");
    }
}
