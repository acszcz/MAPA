public class Quadra{
    private int nomeDaQuadra = 1;
    private String tipoDeQuadra = "Areia";
    private int valorDoMinuto = 5;
    
    public Quadra(int nomeDaQuadra, String tipoDeQuadra, int valorDoMinuto){
        setNomeDaQuadra(nomeDaQuadra);
        setTipoDeQuadra(tipoDeQuadra);
        setValorDoMinuto(valorDoMinuto);
    }
    
    public int getNomeDaQuadra(){
        return nomeDaQuadra;
    }
    
    public void setNomeDaQuadra(int nomeDaQuadra){
        this.nomeDaQuadra = nomeDaQuadra;
    }
    
    public String getTipoDeQuadra(){
        return tipoDeQuadra;
    }
    
    public void setTipoDeQuadra(String tipoDeQuadra){
        this.tipoDeQuadra = tipoDeQuadra;
    }
    
    public int getValorDoMinuto(){
        return valorDoMinuto;
    }
    
    public void setValorDoMinuto(int valorDoMinuto){
        this.valorDoMinuto = valorDoMinuto;
    }
    
}
