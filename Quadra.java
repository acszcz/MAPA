public class Quadra{
    private int nomeDaQuadra;
    private String tipoDeQuadra;
    private double valorDoMinuto;
    
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
    
    public double getValorDoMinuto(){
        return valorDoMinuto;
    }
    
    public void setValorDoMinuto(double valorDoMinuto){
        this.valorDoMinuto = valorDoMinuto;
    }
    
}
