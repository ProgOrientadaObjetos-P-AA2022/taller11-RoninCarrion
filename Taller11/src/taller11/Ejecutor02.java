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
        ArrayList<Menu> lista = new ArrayList<>();
        for (int i = 0; i < datos001.length; i++) {
            String nombrePlato = datos001[i][0];
            double vInicial = Double.parseDouble(datos001[i][1]);
            double vHelado = Double.parseDouble(datos001[i][2]);
            double vPastel = Double.parseDouble(datos001[i][3]);
            MenuNiños n1 = new MenuNiños(nombrePlato, vInicial, vHelado, vPastel);
            lista.add(n1);
        }

        for (int i = 0; i < datos002.length; i++) {
            String nombrePlato = datos002[i][0];
            double vInicial = Double.parseDouble(datos002[i][1]);
            double vPorcentaje = Double.parseDouble(datos002[i][2]);
            MenuEconomico n1 = new MenuEconomico(nombrePlato, vInicial, vPorcentaje);
            lista.add(n1);
        }
        for (int i = 0; i < datos003.length; i++) {
            String nombrePlato = datos003[i][0];
            double vInicial = Double.parseDouble(datos003[i][1]);
            double vPostre = Double.parseDouble(datos003[i][2]);
            double vBebida = Double.parseDouble(datos003[i][3]);
            MenuDia n1 = new MenuDia(nombrePlato, vInicial, vPostre, vBebida);
            lista.add(n1);
        }
        for (int i = 0; i < datos004.length; i++) {
            String nombrePlato = datos004[i][0];
            double vInicial = Double.parseDouble(datos004[i][1]);
            double vGuarnicion = Double.parseDouble(datos004[i][2]);
            double vBebida = Double.parseDouble(datos004[i][3]);
            double pAdicional = Double.parseDouble(datos004[i][4]);
            MenuCarta n1 = new MenuCarta(nombrePlato, vInicial, vGuarnicion, vBebida,
                            pAdicional);
            lista.add(n1);
        }

        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        // Fin de solución
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerValorMenu();
        }

        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", lista, 10);
        miCuenta.establecerSubtotal();
        miCuenta.establecerTotalPagar();
        System.out.printf("%s\n", miCuenta);

    }
}
