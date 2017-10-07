package onibus;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class TesteOnibusScanner {
    
    public static void main(String[] args) {
        
        /*
            float numF = sc.nextFloat();
            int num1 = sc.nextInt();
            byte byte1 = sc.nextByte();
            long lg1 = sc.nextLong();
            boolean b1 = sc.nextBoolean();
            double num2 = sc.nextDouble();
            String nome = sc.nextLine();
        */
        Scanner s = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = s.nextLine();
        
        System.out.println("Idade: ");
        int idade = s.nextInt();
                
        Passageiro p1 = new Passageiro(nome, idade);
        
        Onibus o = new Onibus();
        o.addPassageiro(p1);
        o.status();
        
        
        // Formatar decimal
        DecimalFormat df = new DecimalFormat("###.###");
        df.setRoundingMode(RoundingMode.UP); // Arredondar para cima
                
        System.out.println(
            "Arrecadação: R$ " + 
             df.format(o.getArrecadacao())
        );        
    }
    
}
