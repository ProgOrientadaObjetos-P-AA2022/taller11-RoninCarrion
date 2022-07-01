/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author ronni
 */
public class MenuCarta extends Cuenta{
    private String nombrePlato; 
    private double valorMenu; 
    private double valorInicial; 
    private double valorPorcion; 
    private double valorBebida; 
    private double porcentajeServicio; 

    public MenuCarta(String a, double b, double c, double d, double e, double f
            , String nombre) {
        super(nombre);
        nombrePlato = a;
        valorMenu = b;
        valorInicial = c;
        valorPorcion = d;
        valorBebida = e;
        porcentajeServicio = f;
    }

    public void establecerNombrePlato(String a) {
        nombrePlato = a;
        
    }

    public void establecerValorMenu(double a) {
        valorMenu = a;
    }

    public void establecerValorInicial(double a) {
        valorInicial = a;
    }

    public void establecerValorPorcion(double a) {
        valorPorcion = a;
    }

    public void establecerValorBebida(double a) {
        valorBebida = a;
    }

    public void establecerPorcentajeServicio(double a) {
        porcentajeServicio = a;
    }
    @Override
    public void establecerValorCancelar(){
        valorCancelar = valorMenu + valorInicial + valorPorcion + 
                valorBebida + porcentajeServicio;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public double obtenerValorInicial() {
        return valorInicial;
    }

    public double obtenerValorPorcion() {
        return valorPorcion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeServicio() {
        return porcentajeServicio;
    }
    
    
    
}
