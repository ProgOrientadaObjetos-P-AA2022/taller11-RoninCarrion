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

    public MenuCarta(String a, double b, double d, double e, double f
    ) {
        super(a, b);
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
        porcentajeServicio = (porcentajeServicio / 100) * valorInicial;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorMenu + valorInicial + valorPorcion
                + valorBebida + porcentajeServicio;
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
        String cadena = String.format("<< Menú Carta >>\n%s\n"
                + "    >Valor de la Porción de Guarnición: %.2f\n"
                + "    >Valor de la Bebida: %.2f\n"
                + "    >Porcentaje de Servicio: %.2f\n"
                + "    >Valor del Menu: %.2f\n"
                + "=========================================="
                , super.toString(),
                valorPorcion,
                valorBebida,
                porcentajeServicio,
                valorMenu);
        return cadena;
    }

}
