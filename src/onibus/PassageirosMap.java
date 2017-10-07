package onibus;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author elias
 */
public class PassageirosMap {
    
    public static void main(String[] args) {
        
        //Instanciar os passageiros:
        Passageiro p1 = new Passageiro("Elias", 28);
                
        // Instanciar estudantes
        Estudante e1 = new Estudante("Joaquim", "MR-09856", 30);
        
        // Instanciar deficientes
        Deficiente d1 = new Deficiente("Júlia", "CID-010", 50);
       
        // Interface Map (key <-> value) Cada chave leva um elemento.
        Map<Integer, Passageiro> mapaPassageiros = new HashMap<>(); 
        mapaPassageiros.put(1, p1);
        mapaPassageiros.put(2, e1);
        mapaPassageiros.put(3, d1);
        
        // Mostrar como resgatar do mapa:
        System.out.println(mapaPassageiros);
        System.out.println(mapaPassageiros.get(2).getNome());
                
        // Criar um set com as chaves especificadas:
        // entrySet() retorna um conjunto de Maps contido no mapa configurado,
        // para ser possível acessar suas chaves e valores.
        Set<Entry<Integer, Passageiro>> meuSet = mapaPassageiros.entrySet();
        
        // Criar um iterator:
        Iterator iterator = meuSet.iterator();
        
        // Mostrar as chaves e os valores do mapa:
        System.out.println("\nChave\tValor");
        
        while (iterator.hasNext()) {
            
            // Recuperar a entrada do mapa
            Entry<Integer, Passageiro> entry = (Entry)iterator.next();
            System.out.println(
                entry.getKey() + "\t" + entry.getValue().getNome()
            );
            
        }
        
        System.out.println("\n");
        
        for(int i = 1; i <= mapaPassageiros.size(); i++){
            System.out.println(i + " - " + mapaPassageiros.get(i).getNome());
        }
               
    }
    
}
