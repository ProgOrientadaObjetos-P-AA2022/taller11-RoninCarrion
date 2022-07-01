/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author ronni
 */
public class MenuDia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public MenuDia(String a, double b, double c, double d, double e) {
        super(a, b, c);
        valorPostre = d;
        valorBebida = e;
    }

    @Override
    public void establecerNombrePlato(String a) {
        nombrePlato = a;
    }

    public void establecerValorMenu(double a) {
        valorMenu = a;
    }

    public void establecerValorInicialMenu(double a) {
        valorInicial = a;
    }

    public void establecerValorPostre(double a) {
        valorPostre = a;
    }

    public void establecerValorBebida(double a) {
        valorBebida = a;
    }

    @Override
    public void establecerValorCancelar() {
        valorCancelar = valorMenu + valorInicial
                + valorPostre + valorBebida;
    }

    @Override
    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    @Override
    public double obtenerValorMenu() {
        return valorMenu;
    }

    public double obtenerValorInicialMenu() {
        return valorInicial;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t<< Menú del Día >>\n%s\n"
                + "    > Valor de la Bebida: %.2f\n", super.toString(),
                valorBebida);
        return cadena;
    }

}
