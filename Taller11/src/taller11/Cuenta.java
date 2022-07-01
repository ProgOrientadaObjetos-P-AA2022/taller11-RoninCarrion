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
public class Cuenta {

    private ArrayList<Menu> menu;
    private double totalPagar;
    private double iva;
    private double subtotal;
    private String nombreCliente;

    public Cuenta(ArrayList<Menu> a, String b) {
        menu = a;
        nombreCliente = b;
        iva = 0.12;
    }

    public void establecerNombreCliente(String a) {
        nombreCliente = a;
    }

    public void establecerMenu(ArrayList<Menu> a) {
        menu = a;
    }

    public void establecerTotalPagar() {
        totalPagar = (subtotal * iva) + subtotal;
    }

    public void establecerIva(double a) {
        iva = a;
    }

    public void establecerSubtotal() {
        for (int i = 0; i < menu.size(); i++) {
            subtotal += menu.get(i).valorCancelar;
        }
    }

    public ArrayList<Menu> obtenerMenu() {
        return menu;
    }

    public double obtenerTotalPagar() {
        return totalPagar;
    }

    public double obtenerIva() {
        return iva;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t<< RESTAURANT TODO SATISFECHO >>\n"
                + ">> CUENTA POR PAGAR\n"
                + "    > Nombre del Cliente: %s\n", nombreCliente);

        for (int i = 0; i < menu.size(); i++) {
            cadena = String.format("%s\n%s", cadena, menu.get(i));

        }
        cadena = String.format("%s\n==========================================\n"
                + "> Valor Subtotal: %.2f\n"
                + "> Iva: %.2f %% \n"
                + "> Valor Total a Cancelar: %.2f", cadena,
                subtotal,
                iva,
                totalPagar);
        return cadena;
    }
}
