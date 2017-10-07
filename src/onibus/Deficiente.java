package onibus;

/**
 *
 * @author elias
 */
public class Deficiente extends Passageiro{
    
    // Atributos
    private String cid;
    
    // Construtor
    public Deficiente(String _nome, String _cid, int _idade) {
        
        super(_nome, _idade);
        cid = _cid;
        
    }

    // 
    public String getCid() {
        
        return cid;
        
    }

    public void setCid(String cid) {
     
        this.cid = cid;
        
    }
    
    // Métodos
    @Override
    public double pagar(){
        
        return 0.0;
        
    }
    
}
