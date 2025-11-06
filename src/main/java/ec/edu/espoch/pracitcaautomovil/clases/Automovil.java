
package ec.edu.espoch.pracitcaautomovil.clases;

import ec.edu.espoch.pracitcaautomovil.enumeraciones.ColoresAutomovil;
import ec.edu.espoch.pracitcaautomovil.enumeraciones.TipoAutomovil;
import ec.edu.espoch.pracitcaautomovil.enumeraciones.TipoCombustible;


public class Automovil {
    //Atributos
    private String marca;
    private int modelo;
    private double motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numPuertas;
    private int cantAsientos;
    private double velocidadMax;
    private ColoresAutomovil color;
    private double velocidadAct=0;
    
    //Constructor
    public Automovil(String marca, int modelo, double motor, TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil, int numPuertas, int cantAsientos, double velocidadMax, ColoresAutomovil color, double velocidadAct) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numPuertas = numPuertas;
        this.cantAsientos = cantAsientos;
        this.velocidadMax = velocidadMax;
        this.color = color;
        this.velocidadAct = velocidadAct;
    }
    
    //Getters-Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public ColoresAutomovil getColor() {
        return color;
    }

    public void setColor(ColoresAutomovil color) {
        this.color = color;
    }

    public double getVelocidadAct() {
        return velocidadAct;
    }

    public void setVelocidadAct(double velocidadAct) {
        this.velocidadAct = velocidadAct;
    }
    
    //Metodos
    
    public void imprimirDatosAutomovil(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Motor: "+this.motor);
        System.out.println("Tipo de combustible: "+this.tipoCombustible);
        System.out.println("Tipo de automovil: "+this.tipoAutomovil);
        System.out.println("Numero de puertas: "+this.numPuertas);
        System.out.println("Cantidad de asientos: "+this.cantAsientos);
        System.out.println("Color: "+this.color);
        System.out.println("Velocidad Maxima: "+this.velocidadMax);
        System.out.println("Velocidad Actual: "+this.velocidadAct);
    }
    
    public double Aceleracion(double velocidadAcelerar){
        double verificador=0;
        verificador=velocidadAct+velocidadAcelerar;
        if(verificador<this.velocidadMax){
            this.velocidadAct=verificador;
        }
        return this.velocidadAct;
    }
    public double Desacelerar(double velocidadDesacelerar){
        double verificador=0;
        verificador=velocidadAct-velocidadDesacelerar;
        if(verificador>0){
            this.velocidadAct=verificador;
        }
        return this.velocidadAct;
    }
    public double Frenar(){
        this.velocidadAct=0;
        return velocidadAct;
    }
    public double calcTiempoLlegada(double distanciaRecorrer){
        double tiempoEstimado=0;
        tiempoEstimado=distanciaRecorrer/this.velocidadAct;
        return tiempoEstimado;
    }
    
}
