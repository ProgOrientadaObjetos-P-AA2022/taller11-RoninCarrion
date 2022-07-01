/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author ronni
 */
public class MenuEconomico extends Cuenta {

    private String nombrePlato;
    private double valorMenu;
    private double valorInicialMenu;
    private double porcentajeDescuento;

    public MenuEconomico(String a, double b, double c, double d, String nombre) {
        super(nombre);
        nombrePlato = a;
        valorMenu = b;
        valorInicialMenu = c;
        porcentajeDescuento = d;
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

    public void establecerPorcentajeDescuento(double a) {
        porcentajeDescuento = a;
    }
    

    @Override
    public void establecerValorCancelar() {
        valorCancelar = valorMenu + valorInicialMenu + porcentajeDescuento;

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

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    

}
