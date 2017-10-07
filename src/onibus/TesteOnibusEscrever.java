package onibus;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author elias
 */
public class TesteOnibusEscrever {

    public static void main(String[] args) {
        
        //Instanciar os passageiros:
        Passageiro p1 = new Passageiro("Elias", 28);
        //Passageiro p2 = new Passageiro("George", 8);
        
        // Instanciar estudantes
        Estudante e1 = new Estudante("Joaquim", "MR-09856", 30);
        //Estudante e2 = new Estudante("Kelly", "MS-076656", 2);
        
        // Instanciar deficientes
        Deficiente d1 = new Deficiente("Júlia", "CID-010", 50);
        //Deficiente d2 = new Deficiente("Ana", "CID-015", 12);
        
        // Instanciar o ônibus:
        Onibus o = new Onibus();
        
        // Add todos os passageiros na lista:
        o.addPassageiro(p1);
        //o.addPassageiro(p2);
        
        // Add todos os estudantes na lista:
        o.addPassageiro(e1);
        //o.addPassageiro(e2);
        
        // Add todos os deficientes na lista:
        o.addPassageiro(d1);
        //o.addPassageiro(d2);
        
        // Visualizar todos os ítens da lista:
        o.status();
        
        // Formata decimal
        DecimalFormat df = new DecimalFormat("###.###");
        df.setRoundingMode(RoundingMode.UP); // Arredonda para cima
                
        System.out.println(
            "Arrecadação: R$ " + 
             df.format(o.getArrecadacao())
        );
        
        // Tratamento de erros
        try {
            
            // Escreve arquivo para para persistir o estado atual do objeto
            FileOutputStream arquivo = new FileOutputStream("serializacaoOnibus");
            
            // Criar um objeto outputStream com o arquivo
            ObjectOutputStream objEscrita = new ObjectOutputStream(arquivo);
            
            // Escrever o estado do objeto onibus no arquivo
            objEscrita.writeObject(o);
            objEscrita.close();
            
            JOptionPane.showMessageDialog(null, "Objeto escrito com sucesso!");
        
        // Trata o erro de arquivo não encontrado
        } catch (FileNotFoundException excecao) {
            
            Logger.getLogger(TesteOnibusEscrever.class.getName()).log(
                Level.SEVERE, 
                "Arquivo não encontrado.", 
                excecao
            );
            
        // Trata o erro de entrada e saída 
        } catch (IOException excecao) {
            
            Logger.getLogger(TesteOnibusEscrever.class.getName()).log(
                Level.SEVERE,
                "Erro de entrada ou saída.",
                excecao
            );
            
        }
        
    }
    
}
