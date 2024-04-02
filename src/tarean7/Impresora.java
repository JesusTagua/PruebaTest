/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarean7;

/**
 *
 * @author Usuario
 */
public class Impresora {
    private int capacidadToner;
    private int cantidadToner;

    public Impresora(int capacidadInicial) {
        if (capacidadInicial >= 0) {
            this.capacidadToner = capacidadInicial;
        } else {
            this.capacidadToner = 100; // Capacidad predeterminada
        }
        this.cantidadToner = this.capacidadToner;
    }

    public int getCapacidadToner() {
        return capacidadToner;
    }

    public int getCantidadToner() {
        return cantidadToner;
    }

    public void imprime(int cant) {
        if (cant > 0) {
            this.cantidadToner -= cant;
            if (this.cantidadToner < 0) {
                this.cantidadToner = 0;
            }
        }
    }

    public double estadoDelToner() {
        return (double) cantidadToner / capacidadToner;
    }
}
