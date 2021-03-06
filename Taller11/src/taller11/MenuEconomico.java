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

    public MenuEconomico(String a, double b, double d) {
        super(a, b);
        porcentajeDescuento = d;
    }

    public void establecerPorcentajeDescuento(double a) {
        porcentajeDescuento = a;
    }
    
    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial - ((porcentajeDescuento / 100) * valorInicial);

    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("<< Menú Económico >>\n%s\n"
                + "    >Porcentaje de descuento: %.2f\n"
                + "    >Valor del Menu: %.2f\n"
                + "=========================================="
                , super.toString(),
                porcentajeDescuento,
                valorMenu);
        return cadena;
    }

}
