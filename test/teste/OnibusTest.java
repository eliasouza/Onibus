package teste;

import onibus.Deficiente;
import onibus.Estudante;
import onibus.Onibus;
import onibus.Passageiro;
import org.junit.Test;

/**
 *
 * @author elias
 */
public class OnibusTest {
    
    public OnibusTest() {
                
    }
    
    @Test
    public void TestAddPassageiro(){
        //Instanciar os passageiros:
        Passageiro p1 = new Passageiro("Elias", 28);
        
        // Instanciar estudantes
        Estudante e1 = new Estudante("Joaquim", "MR-09856", 30);
        
        // Instanciar deficientes
        Deficiente d1 = new Deficiente("Júlia", "CID-010", 50);
              
        // Instanciar o ônibus:
        Onibus o = new Onibus();
        
        // Add todos os passageiros na lista:
        o.addPassageiro(p1);
        
        // Add todos os estudantes na lista:
        o.addPassageiro(e1);
        
        // Add todos os deficientes na lista:
        o.addPassageiro(d1);
        
        //Assert: (Res Esperado, Res)
       
    }
    
}
