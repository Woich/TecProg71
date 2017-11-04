
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
        String nome;
        String pos;
        
        System.out.println("Quantos jogadores serão?");
        
        if(scan.hasNextInt()){
            qtdJogadores = scan.nextInt();
            
            for(int i=0; i<qtdJogadores ; i++){
                System.out.println("Qual o número do jogador");
                //Verifica se tem um número inteiro
                if(scan.hasNextInt()){
                    num = scan.nextInt();
                    System.out.println("Qual o nome");
                    nome = scan.nextLine();
                    time1.addJogador(new Jogador(num, nome));
                }
                else{
                    i--;
                    System.out.println("Tente Novamente");
                }
            }
        }
        
        ArrayList<Jogador> listaJogadores = time1.ordena(new JogadorComparator(true, true, true));
        System.out.println(listaJogadores);
        
   
        
    }
    
}
