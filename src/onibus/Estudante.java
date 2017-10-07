package onibus;

/**
 *
 * @author elias
 */
public class Estudante extends Passageiro{
    
    // Atributos
    private String matricula;

    // Construtor
    public Estudante(String _nome, String _matricula, int _idade) {
        
        super(_nome, _idade);
        matricula = _matricula;
        
    }
    
    // Acessores e modificadores
    public String getMatricula() {
        
        return matricula;
        
    }

    public void setMatricula(String matricula) {
        
        this.matricula = matricula;
        
    }
    
    // Métodos
    @Override
    public double pagar(){
       
        return ( (getIdade() >= 0 && getIdade() < 9) || 
                 (getIdade() >= 60) ) ? 0.0 : precoPassagem/2;
        
    }
    
}
