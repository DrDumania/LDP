/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picaria;

/**
 *
 * @author Bruno
 */
public class Casa {
    
    private Jogador ocupante;
    private Casa casaAdjacente;

    public Casa() {
        this.ocupante = null;
        this.casaAdjacente = null;
    }

    public Jogador getOcupante() {
        return ocupante;
    }

    public void setOcupante(Jogador jogador) {
        ocupante = jogador;
    }
}
