/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Taller11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        ArrayList<Cuenta> cuenta = new ArrayList<>();
        String nombrePlato;
        boolean stop = true;
        // Variables Reutilizables
        double valorMenu;
        double valorInicial;
        double valorBebida;
        double porcentajeAdicional;

        System.out.println(" << BIENVENIDOS/AS A RESTAURANT TODO SATISFECHO >>");

        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = a.nextLine();

        String option = a.nextLine();
        while (stop) {
            System.out.println("Tenemos los siguientes menús, ingrese el"
                    + " número correspondiente\n"
                    + "para generar la cuenta a pagar por ell cliente.\n"
                    + "[1] Menu Carta\n"
                    + "[2] Menu del Día\n"
                    + "[3] Menu Económico\n"
                    + "[4] Menu Niños\n"
                    + "[5] No Registrar más datos");
            switch (option) {
                case "1":
                    System.out.println("<< MENU CARTA >>");
                    System.out.println("Ingrese el nombre del plato: ");
                    nombrePlato = a.nextLine();
                    System.out.println("Ingrese el valor del menú: ");
                    valorMenu = a.nextDouble();
                    System.out.println("Ingrese el valor inicial del Menú:");
                    valorInicial = a.nextDouble();
                    System.out.println("Ingrese el valor de porción de Guarnición:");
                    double valorGuarnicion = a.nextDouble();
                    System.out.println("Ingrese el valor de la bebida:");
                    valorBebida = a.nextDouble();
                    System.out.println("Ingrese el porcentaje adicional por servicio\n"
                            + "en relación del valor inicial del menú:");
                    porcentajeAdicional = a.nextDouble();

                    MenuCarta menuCarta = new MenuCarta(nombrePlato, valorMenu,
                            valorInicial, valorGuarnicion, valorBebida,
                            porcentajeAdicional, nombre);

                    cuenta.add(menuCarta);
                    break;

                case "2":
                    System.out.println("<< MENU DEL DÍA >>");
                    System.out.println("Ingrese el nombre del plato: ");
                    nombrePlato = a.nextLine();
                    System.out.println("Ingrese el valor del menú: ");
                    valorMenu = a.nextDouble();
                    System.out.println("Ingrese el valor inicial del Menú:");
                    valorInicial = a.nextDouble();
                    System.out.println("Ingrese del postre:");
                    double valorPostre = a.nextDouble();
                    System.out.println("Ingrese el valor de la bebida:");
                    valorBebida = a.nextDouble();

                    MenuDia menuDia = new MenuDia(nombrePlato, valorMenu,
                            valorInicial, valorPostre, valorBebida, nombre);

                    cuenta.add(menuDia);
                    break;

                case "3":
                    System.out.println("<< MENU ECONÓMICO >>");
                    System.out.println("Ingrese el nombre del plato: ");
                    nombrePlato = a.nextLine();
                    System.out.println("Ingrese el valor del menú: ");
                    valorMenu = a.nextDouble();
                    System.out.println("Ingrese el valor inicial del Menú:");
                    valorInicial = a.nextDouble();
                    System.out.println("Ingrese el porcentaje de descuento,"
                            + " en referencia al valor inicial del menú:");
                    porcentajeAdicional = a.nextDouble();

                    MenuEconomico menuEconomico = new MenuEconomico(nombrePlato,
                            valorMenu,
                            valorInicial, porcentajeAdicional, nombre);

                    cuenta.add(menuEconomico);
                    break;

                case "4":
                    System.out.println("<< MENU DE NIÑOS >>");
                    System.out.println("Ingrese el nombre del plato: ");
                    nombrePlato = a.nextLine();
                    System.out.println("Ingrese el valor del menú: ");
                    valorMenu = a.nextDouble();
                    System.out.println("Ingrese el valor inicial del Menú:");
                    valorInicial = a.nextDouble();
                    System.out.println("Ingrese el valor de la porción de helado:");
                    double porcionHelado = a.nextDouble();
                    System.out.println("Ingrese el valor de la porción de pastel:");
                    double porcionPastel = a.nextDouble();

                    MenuNiños menuNiños = new MenuNiños(nombrePlato, valorMenu,
                            valorInicial, porcionHelado, porcionPastel, nombre);

                    cuenta.add(menuNiños);
                    break;
                case "5":
                    stop = false;
                    break;
                
                default:
                    System.out.println("Ingrese un valor correcto por favor...");
            }

        }
        for (int i = 0; i < cuenta.size(); i++) {
            cuenta.get(i).establecerValorCancelar();
        }

    }

}
