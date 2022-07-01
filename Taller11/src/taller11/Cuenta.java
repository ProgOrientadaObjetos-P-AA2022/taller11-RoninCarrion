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
public abstract class Cuenta {
    protected String nombreCliente; 
    // protected double cuentaPagar;
    protected double valorCancelar;
    protected double iva; 
    protected double subtotal;
    protected ArrayList<Cuenta> c = new ArrayList<>(); 

    public Cuenta(String a) {
        nombreCliente = a;
        iva = 0.12;
      
    }

    public void establecerNombreCliente(String a) {
        nombreCliente = a;
    }

    public abstract void  establecerValorCancelar();

    public void establecerIva(double a) {
        iva = a;
    }

    public void establecerSubtotal() {
        subtotal = iva;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    public double obtenerIva() {
        return iva;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t<< RESTAURANT TODO SATISFECHO >>\n"
        + "CUENTA POR PAGAR"
                + ">Nombre del Cliente: %s\n");
        
        for (int i = 0; i < c.size(); i++) {
            cadena = String.format("%s\n%s\n", cadena, c.get(i));
            
        }
        cadena = String.format("%s\nValor Subtotal: %.2f\n"
                + "> Iva: %.2f %\n"
                + "> Valor Total a Cancelar: %.2f", cadena,
                subtotal,
                iva,
                valorCancelar);
        return cadena;
    }
    
    
    
    
  
    
}
