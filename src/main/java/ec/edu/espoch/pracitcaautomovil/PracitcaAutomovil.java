
package ec.edu.espoch.pracitcaautomovil;

import ec.edu.espoch.pracitcaautomovil.clases.Automovil;
import ec.edu.espoch.pracitcaautomovil.enumeraciones.ColoresAutomovil;
import ec.edu.espoch.pracitcaautomovil.enumeraciones.TipoAutomovil;
import ec.edu.espoch.pracitcaautomovil.enumeraciones.TipoCombustible;


public class PracitcaAutomovil {

    public static void main(String[] args){
        Automovil autoUno=new Automovil("Chevrolet", 2020, 2.0, TipoCombustible.GASOLINA, TipoAutomovil.CIUDAD, 4, 5, 130, ColoresAutomovil.ROJO, 0);
        autoUno.imprimirDatosAutomovil();
        //El automovil cambia su velocidad actual a 100km/h
        autoUno.setVelocidadAct(100);
        System.out.println(autoUno.getVelocidadAct());
        
        //El automovil acelera 20 km/h
        autoUno.Aceleracion(20);
        System.out.println(autoUno.getVelocidadAct());
        
        //El automovil desacelera 50km/h
        autoUno.Desacelerar(50);
        System.out.println(autoUno.getVelocidadAct());
        
        //El automovil frena y se detiene
        autoUno.Frenar();
        System.out.println(autoUno.getVelocidadAct());
        
        Automovil autoDos=new Automovil("Toyota", 2015, 2.5, TipoCombustible.DIESEL, TipoAutomovil.FAMILIAR, 4, 5, 120, ColoresAutomovil.BLANCO, 0);
        autoDos.setVelocidadAct(75);
        
        //El automovil calcula el tiempo de llegada para recorrer 120km
        System.out.println("Tiempo estimado: "+autoDos.calcTiempoLlegada(120)+" horas");
    }
}
