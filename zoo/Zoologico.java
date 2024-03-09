
package com.mycompany.zoo;

public class Zoologico {
    String nombre;
    String ciudad;
    String pais;
    double tamaño;
    double presupuestoAnual;
    String periodoApertura;
    String periodoCierre;
    String estado;
    String nombreEncargado;
    String curpEncargado;

    public Zoologico(){
    }
        
        
        public void nombredezoo(String nombre, String ciudad, String pais, double tamaño, double presupuestoAnual,
                     String periodoApertura, String periodoCierre, String estado, String nombreEncargado,
                     String curpEncargado) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.tamaño = tamaño;
        this.presupuestoAnual = presupuestoAnual;
        this.periodoApertura = periodoApertura;
        this.periodoCierre = periodoCierre;
        this.estado = estado;
        this.nombreEncargado = nombreEncargado;
        this.curpEncargado = curpEncargado;
    }

    public void cambiarEstado(String nuevoEstado, String nuevaFechaCierre) {
        if (estado.equals("abierto al público")) {
            if (nuevoEstado.equals("remodelación") || nuevoEstado.equals("cerrado")) {
                estado = nuevoEstado;
                if (nuevoEstado.equals("cerrado")) {
                    periodoCierre = nuevaFechaCierre;
                }
            }
        } else if (estado.equals("en remodelación")) {
            if (nuevoEstado.equals("abierto al público")) {
                estado = nuevoEstado;
            }
        }
    }

    public String juntarcadenas() {
        return "Zoologico{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                ", tamaño=" + tamaño +
                ", presupuestoAnual=" + presupuestoAnual +
                ", periodoApertura='" + periodoApertura + '\'' +
                ", periodoCierre='" + periodoCierre + '\'' +
                ", estado='" + estado + '\'' +
                ", nombreEncargado='" + nombreEncargado + '\'' +
                ", curpEncargado='" + curpEncargado + '\'' +
                '}';
    }
}