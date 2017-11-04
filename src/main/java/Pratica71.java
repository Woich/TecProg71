
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.JogadorComparator;
import utfpr.ct.dainf.if62c.pratica.Time;
/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica71 {
    public static void main(String[] args) {
        Time time1 = new Time();
        Scanner scan = new Scanner(System.in);
        int qtdJogadores;
        int num;
        int pos;
        String lixo;
        String nome;
        
        System.out.println("Quantos jogadores serão?");
        
        if(scan.hasNextInt()){
            qtdJogadores = scan.nextInt();
            
            for(int i=0; i<qtdJogadores; i++) {
                System.out.println("Qual o numero");
                    if(scan.hasNextInt()){ 
                        num = scan.nextInt();
                    }
                    else{
                        num = i+1;
                        lixo = scan.next();
                    }
                    
                    System.out.println("Qual o nome?");
                    nome = scan.next();
                    time1.addJogador(new Jogador(num, nome));
            }
        }
        
        ArrayList<Jogador> listaJogadores = time1.ordena(new JogadorComparator(true, true, true));
        System.out.println(listaJogadores);
        num = 1;
        
        while(num != 0){
            System.out.println("Informe o numero");
                
                if(scan.hasNextInt())
                    num = scan.nextInt();
                else
                    num = 0;
                    
                if(num == 0)
                    break;
                
                System.out.println("Informe o nome");
                    nome = scan.next();
                    
                Jogador novo = new Jogador(num, nome);
                
                pos = Collections.binarySearch(listaJogadores, novo);
                
                if(pos>=0) {
                    listaJogadores.set(pos, novo);
                }else{
                    listaJogadores.add(pos*-1-1, novo);
                }
        }
        
        System.out.println(listaJogadores);
        
    }
    
}
