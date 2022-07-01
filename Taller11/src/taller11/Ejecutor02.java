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
public class Ejecutor02 {

    public static void main(String[] args) {

        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
        {"Niños 02", "3.00", "1", "1.5"},
        {"Niños 03", "2.00", "2", "0.5"},};

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"},};

        // Lista de Menus
        ArrayList <Menu>lista = new ArrayList<>();

        MenuNiños n1 = new MenuNiños("Niños 01", 2.00, 1.0, 1.5);
        MenuNiños n2 = new MenuNiños("Niños 02", 3.00, 1.0, 1.5);
        MenuNiños n3 = new MenuNiños("Niños 03", 2.00, 2.0, 0.5);
        
        MenuEconomico e1 = new MenuEconomico("Econo 001", 4.0, 25.0);
        MenuEconomico e2 = new MenuEconomico("Econo 001", 4.0, 15.0);
        MenuEconomico e3 = new MenuEconomico("Econo 001", 4.0, 35.0);
        
        MenuDia d1 = new MenuDia("Dia 001", 5, 1, 1);
        MenuDia d2 = new MenuDia("Dia 002", 6, 2, 2);
        MenuDia d3 = new MenuDia("Dia 003", 5.5, 3, 1);
        
        MenuCarta c1 = new MenuCarta("Carta 001", 6, 1.5, 2, 10);
        MenuCarta c2 = new MenuCarta("Carta 002", 7, 1.7, 2.1, 5);
        MenuCarta c3 = new MenuCarta("Carta 003", 8, 1.9, 2.2, 5);
        MenuCarta c4 = new MenuCarta("Carta 004", 9, 2.5, 2.9, 5);
       
            lista.add(n1);
            lista.add(n2);
            lista.add(n3);
            lista.add(e1);
            lista.add(e2);
            lista.add(e3);
            lista.add(d1);
            lista.add(d2);
            lista.add(d3);
            lista.add(c1);
            lista.add(c2);
            lista.add(c3);
            lista.add(c4);
            for (int i = 0; i < lista.size(); i++) {
                lista.get(i).establecerValorCancelar();            
        }

        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        // Fin de solución
//        for (int i = 0; i < lista.size(); i++) {
//            lista.get(i);
//        }
        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", lista, 10);
        miCuenta.establecerSubtotal();
        miCuenta.establecerValorCancelar();
        System.out.printf("%s\n", miCuenta);

    }

}
