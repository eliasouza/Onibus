package onibus;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author elias
 */
public class Onibus implements Serializable {

    // Variáveis de instância
    private ArrayList<Passageiro> listaDePassageiros;
    private double soma;

    // Construtor
    public Onibus() {
        
        listaDePassageiros = new ArrayList<>();
        soma = 0.0;
        
    }
    
    // Métodos
    public void addPassageiro( Passageiro p ){
        
        listaDePassageiros.add( p );
        
    }
    
    public double getArrecadacao(){
        
        listaDePassageiros.forEach(p -> {
            soma += p.pagar();
        });
        
        return soma;
    }
    
    public void status(){
               
        listaDePassageiros.forEach(p -> {
                       
            System.out.println(
                 "Classe: " + p.getClass() +
                "\nNome: " + p.getNome() +
                "\nIdade: " + p.getIdade() +
                "\nPaga: R$ " + p.pagar() +
                "\n"
            );
            
        });
        
    }
    
}
