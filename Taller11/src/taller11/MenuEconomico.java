/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author ronni
 */
public class MenuEconomico extends Menu {

    private double porcentajeDescuento;

    public MenuEconomico(String a, double b, double c, double d) {
        super(a, b, c);
        porcentajeDescuento = d;
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

    public void establecerPorcentajeDescuento(double a) {
        porcentajeDescuento = a;
    }

    @Override
    public void establecerValorCancelar() {
        valorCancelar = valorMenu + valorInicial + porcentajeDescuento;

    }

    @Override
    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    @Override
    public double obtenerValorMenu() {
        return valorMenu;
    }

    /**
     *
     * @return
     */
    @Override
    public double obtenerValorInicial() {
        return valorInicial;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t<< Menú Económico >>\n%s\n"
                + "    > Porcentaje de descuento: %.2f\n", super.toString(),
                porcentajeDescuento);
        return cadena;
    }

}
