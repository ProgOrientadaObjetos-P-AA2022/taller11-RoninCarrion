/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author ronni
 */
public class MenuNiños extends Cuenta {

    private String nombrePlato;
    private double valorMenu;
    private double valorInicialMenu;
    private double valorHelado;
    private double valorPastel;

    public MenuNiños(String a, double b, double c, double d,
            double e, String nombre) {
        super(nombre);
        nombrePlato = a;
        valorMenu = b;
        valorInicialMenu = c;
        valorHelado = d;
        valorPastel = e;
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

    public void establecerValorHelado(double a) {
        valorHelado = a;
    }

    public void establecerValorPastel(double a) {
        valorPastel = a;
    }

    @Override
    public void establecerValorCancelar() {
        valorCancelar = valorMenu + valorInicialMenu + valorHelado + valorPastel;
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

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

}
