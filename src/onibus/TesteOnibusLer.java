package onibus;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elias
 */
public class TesteOnibusLer {
        
    public static void main(String[] args) {
    
        // Tratamento de erros
        try {
            
            // Lê arquivo que contém o objeto serializado
            FileInputStream arquivo = new FileInputStream("serializacaoOnibus");
            
            // Criar um objeto inputStream com o arquivo
            ObjectInputStream objLeitura = new ObjectInputStream(arquivo);
           
            // Criar um objeto do tipo requerido a partir do objeto armazenado
            Onibus o = (Onibus) objLeitura.readObject();
          
            // Usar o objeto recuperado 
            o.status(); 
        
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
            
        } catch (ClassNotFoundException excecao) {
            
            Logger.getLogger(TesteOnibusLer.class.getName()).log(
                Level.SEVERE, 
                "Classe não encontrada.", 
                excecao
            );
            
        }
        
    }
        
}
