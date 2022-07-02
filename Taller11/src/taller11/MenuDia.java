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

    public MenuDia(String a, double b, double d, double e) {
        super(a, b);
        valorPostre = d;
        valorBebida = e;
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
    public void establecerValorMenu() {
        valorMenu = valorMenu + valorInicial
                + valorPostre + valorBebida;
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
        String cadena = String.format("<< Menú del Día >>\n%s\n"
                + "    >Valor de la Bebida: %.2f\n"
                + "    >Valor del Menu: %.2f\n"
                + "=========================================="
                , super.toString(),
                valorBebida,
                valorMenu);
        return cadena;
    }

}
