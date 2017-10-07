package onibus;

import java.io.Serializable;

/**
 *
 * @author elias
 */
public class Passageiro implements Serializable {

    // Atributos
    private String nome;
    private int idade;
    protected double precoPassagem;

    // Construtores
    public Passageiro(){
        precoPassagem = 2.80;
    }
    
    public Passageiro(String _nome, int _idade){
        nome = _nome;
        idade = _idade;
        precoPassagem = 2.80;
    }
    
    // Métodos acessores e modificadores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPrecoPassagem() {
        return precoPassagem;
    }

    public void setPrecoPassagem(double precoPassagem) {
        this.precoPassagem = precoPassagem;
    }
    
    // Métodos
    public double pagar(){
        return ( (idade >= 0 && idade < 9) || 
                 (idade >= 60) ) ? 0.0 : precoPassagem;
    }
}
