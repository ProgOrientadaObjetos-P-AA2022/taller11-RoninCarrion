/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author ronni
 */
public class MenuNiños extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuNiños(String a, double b, double c, double d) {
        super(a, b);
        valorHelado = c;
        valorPastel = d;
    }

    public void establecerValorMenu(double a) {
        valorMenu = a;
    }

    public void establecerValorHelado(double a) {
        valorHelado = a;
    }

    public void establecerValorPastel(double a) {
        valorPastel = a;
    }

    @Override
    public void establecerValorCancelar() {
        valorCancelar = valorMenu + valorInicial + valorHelado + valorPastel;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t<< Menú Niños >>\n%s\n"
                + "    > Valor de la porción de Helado: %.2f\n"
                + "    > Valor de la Porción de Pastel: %.2f\n", super.toString(),
                valorHelado, valorPastel);
        return cadena;
    }

}
