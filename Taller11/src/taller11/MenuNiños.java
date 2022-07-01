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

    private double valorInicial;
    private double valorHelado;
    private double valorPastel;

    public MenuNiños(String a, double b, double c, double d,
            double e) {
        super(a, b, c);
        valorHelado = d;
        valorPastel = e;
    }

    @Override
    public void establecerNombrePlato(String a) {
        nombrePlato = a;
    }

    public void establecerValorMenu(double a) {
        valorMenu = a;
    }

    @Override
    public void establecerValorInicial(double a) {
        valorInicial = a;
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

    @Override
    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    @Override
    public double obtenerValorMenu() {
        return valorMenu;
    }

    @Override
    public double obtenerValorInicial() {
        return valorInicial;
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
