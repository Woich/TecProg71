/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author woich
 */
public class Time {
    private final ArrayList<Jogador> jogadores = new ArrayList<>();

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }
    
    public void addJogador(Jogador jogador) {
        jogadores.add(jogador);
    }
    
    public ArrayList<Jogador> ordena(JogadorComparator comparator) {
        Collections.sort(jogadores, comparator);
        return jogadores;
    }
}
