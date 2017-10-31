/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.Comparator;

/**
 *
 * @author woich
 */
public class JogadorComparator implements Comparator<Jogador>{

    private final boolean atributo; // V = numero, F = nome;
    private final boolean numAsc; // V = ASC, F = DESC;
    private final boolean nomeAsc; // V = ASC, F = DESC;
    
    public JogadorComparator () {
        this.atributo = true;
        this.numAsc = true;
        this.nomeAsc = true;
    }
    
    public JogadorComparator (boolean atributo, boolean numAsc, boolean nomeAsc) {
        this.atributo = atributo;
        this.numAsc = numAsc;
        this.nomeAsc = nomeAsc;
    }
    
     @Override
    public int compare(Jogador o1, Jogador o2) {
        if(atributo){
            if(numAsc){
                if(o1.numero == o2.numero){
                    if(nomeAsc){
                        return o1.nome.compareTo(o2.nome);
                    }
                    else{
                        return -o1.nome.compareTo(o2.nome);
                    }
                }
                
                else{
                    return o1.numero - o2.numero;
                }
            }
            
            else{
                if(o1.numero == o2.numero){
                    if(nomeAsc){
                        return o1.nome.compareTo(o2.nome);
                    }
                    else{
                        return -o1.nome.compareTo(o2.nome);
                    }
                }
                
                else{
                    return o2.numero - o1.numero;
                }
            }
        }
        
        else{
            if(nomeAsc) {
                if(o1.nome != o2.nome)
                    return o1.nome.compareTo(o2.nome);
                else {
                    if(numAsc)
                        return o1.numero-o2.numero;
                    else
                        return o2.numero-o1.numero;
                }
            } 
            
            else {
                
                if(o1.nome != o2.nome)
                    return -o1.nome.compareTo(o2.nome);
                else {
                    if(numAsc)
                        return o1.numero-o2.numero;
                    else
                        return o2.numero-o1.numero;
                }
            }
        }
    }
    
}
