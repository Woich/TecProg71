
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
        Scanner teclado = new Scanner(System.in);
        int qtJogadores, num, pos;
        String nome;
        
        System.out.println("Digite a quantidade de jogadores:");
        
        if(teclado.hasNextInt()) {
            qtJogadores = teclado.nextInt();
            
            for(int i=0; i<qtJogadores; i++) {
                System.out.println("Informe o numero");
                    if(teclado.hasNextInt()) 
                        num = teclado.nextInt();
                    else
                        num = 0;
                                               
                    System.out.println("Informe o nome");
                    nome = teclado.next();
           
                    time1.addJogador(new Jogador(num, nome));
            }
        }       
        
        ArrayList<Jogador> lista = time1.ordena(new JogadorComparator(true, true, true));
        
        System.out.println(lista);

        do{
                System.out.println("Informe o numero");
                
                if(teclado.hasNextInt())
                    num = teclado.nextInt();
                else
                    num = 0;
                    
                if(num == 0)
                    break;
                
                System.out.println("Informe o nome");
                    nome = teclado.next();
                    
                Jogador novo = new Jogador(num, nome);
                
                pos = Collections.binarySearch(lista, novo);
                
                if(pos>=0) {
                    lista.set(pos, novo);
                }else{
                    lista.add(pos*-1-1, novo);
                }
                
        } while(num != 0);
        
        System.out.println(lista);
    }
    
}
