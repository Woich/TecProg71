
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
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
public class Pratica62 {
    public static void main(String[] args) {
        Time time1 = new Time();
        Jogador jog = new Jogador(12, "Cicrano");
        
        time1.addJogador("Reserva", jog);
        time1.addJogador("Goleiro", new Jogador(11, "Fulano"));
        time1.addJogador("Zagueiro", new Jogador(12, "Fulano"));
        time1.addJogador("Atacante", new Jogador(13, "Fulano"));
        time1.addJogador("Lateral", new Jogador(11, "José"));
        
        List<Jogador> lista = time1.ordena(new JogadorComparator(false, true,false));
        
        System.out.println(lista);
        
        System.out.println(Collections.binarySearch(lista, jog, new JogadorComparator(false, true,false)));
        
    }
    
}
