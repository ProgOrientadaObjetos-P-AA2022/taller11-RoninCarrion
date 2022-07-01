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

    // protected double cuentaPagar;
    protected double valorCancelar;
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;

    public Menu(String a, double b) {
        nombrePlato = a;
        valorInicial = b;
    }

    public void establecerNombrePlato(String a) {
        nombrePlato = a;
    }

    public void establecerValorInicial(double a) {
        valorInicial = a;
    }

    public abstract void establecerValorCancelar();

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
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
