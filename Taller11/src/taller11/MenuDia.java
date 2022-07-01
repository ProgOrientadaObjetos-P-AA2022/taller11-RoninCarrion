/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author ronni
 */
public class MenuDia extends Cuenta {
    private String nombrePlato;
    private double valorMenu; 
    private double valorInicialMenu; 
    private double valorPostre; 
    private double valorBebida; 

    public MenuDia(String a, double b, double c, double d, double e, String nombre) {
        super(nombre);
        nombrePlato = a;
        valorMenu = b;
        valorInicialMenu = c;
        valorPostre = d;
        valorBebida = e;
    }

    public void establecerNombrePlato(String a) {
        nombrePlato = a;
    }

    public void establecerValorMenu(double a) {
        valorMenu = a;
    }

    public void establecerValorInicialMenu(double a) {
        valorInicialMenu = a;
    }

    public void establecerValorPostre(double a) {
        valorPostre = a;
    }

    public void establecerValorBebida(double a) {
        valorBebida = a;
    }
    
    @Override
    public void establecerValorCancelar() {
        valorCancelar =  valorMenu + valorInicialMenu 
                + valorPostre + valorBebida;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public double obtenerValorInicialMenu() {
        return valorInicialMenu;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }
    
    
    
}
