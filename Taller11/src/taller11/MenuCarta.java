/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author ronni
 */
public class MenuCarta extends Menu {

    private double valorPorcion;
    private double valorBebida;
    private double porcentajeServicio;

    public MenuCarta(String a, double b, double c, double d, double e, double f
    ) {
        super(a, b, c);
        valorPorcion = d;
        valorBebida = e;
        porcentajeServicio = f;
    }

    public void establecerValorPorcion(double a) {
        valorPorcion = a;
    }

    public void establecerValorBebida(double a) {
        valorBebida = a;
    }

    public void establecerPorcentajeServicio(double a) {
        porcentajeServicio = a;
    }

    @Override
    public void establecerValorCancelar() {
        valorCancelar = valorMenu + valorInicial + valorPorcion
                + valorBebida + porcentajeServicio;
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

    public double obtenerValorPorcion() {
        return valorPorcion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeServicio() {
        return porcentajeServicio;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t<< Menú Carta >>\n%s\n"
                + "    Valor de la Porción de Guarnición: %.2f\n"
                + "    Valor de la Bebida: %.2f\n"
                + "    Porcentaje de Servicio: %.2f\n", super.toString(),
                valorPorcion,
                valorBebida,
                porcentajeServicio);
        return cadena;
    }

}
