/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author ronni
 */
public abstract class Menu {

    protected String nombreCliente;
    // protected double cuentaPagar;
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;
    protected double valorCancelar;
    protected double iva;
    protected double subtotal;

    public Menu(String a, double b, double c) {
        nombrePlato = a;
        valorMenu = b;
        valorInicial = c;
    }

    public void establecerNombrePlato(String a) {
        nombrePlato = a;
    }

    public void establecerValorInicial(double a) {
        valorInicial = a;
    }

    public void establecerSubtotal(double a) {
        subtotal = a;
    }

    public void establecerNombreCliente(String a) {
        nombreCliente = a;
    }

    public abstract void establecerValorCancelar();

    public void establecerIva(double a) {
        iva = a;
    }

    public void establecerSubtotal() {
        subtotal = iva;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    public double obtenerIva() {
        return iva;
    }

    public double obtenerSubtotal() {
        return subtotal;
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

    @Override
    public String toString() {
        String cadena = String.format("Nombre del Plato: %s\n"
                + "Valor del Menu: %.2f\n"
                + "Valor inicial del Menu: %.2f\n", nombrePlato,
                valorMenu,
                valorInicial);
        return cadena;
    }

}
