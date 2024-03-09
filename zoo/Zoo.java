
package com.mycompany.zoo;

import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Zoologico zoos = new Zoologico();
        int opc;
        String nombre,ciudad, pais, periodoApertura, periodoCierre, estado, nombreEncargado, curpEncargado;
        double tamaño, presupuestoAnual;
        Zoologico objZoologico = new Zoologico();

        do{
            System.out.println("\nMenú:");
            System.out.println("1. Agregar un Zoologico");
            System.out.println("2. Modificar el estado del Zoologico");
            System.out.println("3. Mostrar todos los zoos");
            System.out.println("4. Mostrar todos los zoos en un estado específico");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Nombre del zoo: ");
                    nombre = leer.next();
                    System.out.print("Ciudad: ");
                    ciudad = leer.next();
                    System.out.print("País: ");
                    pais = leer.next();
                    System.out.print("Tamaño (en m2): ");
                    tamaño = leer.nextDouble();
                    System.out.print("Presupuesto anual: ");
                    presupuestoAnual = leer.nextDouble();
                    leer.next();
                    System.out.print("Fecha de apertura (formato dd/mm/yyyy): ");
                    periodoApertura = leer.next();

                    objZoologico.nombredezoo()
                
                
                    break;
                
                case 2:
                    System.out.print("Ingrese el nombre del zoo a modificar: ");
                    String nombreZooModificar = leer.nextLine();
                    Zoologico zooModificar = null;

                    for (Zoologico zoo : zoos) {
                        if (zoo.nombre.equals(nombreZooModificar)) {
                            zooModificar = zoo;
                            break;
                        }
                    }

                    if (zooModificar != null) {
                        System.out.print("Nuevo estado (remodelación/cerrado): ");
                        String nuevoEstado = leer.nextLine();

                        if (nuevoEstado.equals("cerrado")) {
                            System.out.print("Fecha de cierre (formato dd/mm/yyyy): ");
                            String fechaCierre = leer.nextLine();
                            zooModificar.cambiarEstado(nuevoEstado, fechaCierre);
                        } else {
                            zooModificar.cambiarEstado(nuevoEstado, "");
                        }

                        System.out.println("Estado modificado con éxito.");
                    } else {
                        System.out.println("No se encontró el zoo con ese nombre.");
                    }
                    break;

                case 3:
                    System.out.println("Lista de todos los zoos:");
                    for (Zoologico zoo : zoos) {
                        System.out.println(zoo);
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el estado a filtrar (abierto al público/en remodelación/cerrado): ");
                    String estadoFiltrar = leer.nextLine();

                    System.out.println("Zoos en estado " + estadoFiltrar + ":");
                    for (Zoologico zoo : zoos) {
                        if (zoo.estado.equals(estadoFiltrar)) {
                            System.out.println(zoo);
                        }
                    }
                    break;

                case 5:
                    System.out.println("¡Adiós!");
                    System.exit(0);
                    break;
            }
            
        }while (opc!=0);
                   System.out.println("Opción no válida. Inténtelo de nuevo.");
    
        
    }
}