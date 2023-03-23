public class Locacao{
        private int tempoEmMinutos;
        private char necessitaEquipamento;
        private double valorCalculado;
        
        public Locacao(int tempoEmMinutos, char necessitaEquipamento, double valorCalculado){
            setTempoEmMinutos(tempoEmMinutos);
            setNecessitaEquipamento(necessitaEquipamento);
            setValorCalculado(valorCalculado);
        }
        
        public int getTempoEmMinutos() {
            return tempoEmMinutos;
        }
        
        public void setTempoEmMinutos (int tempoEmMinutos) {
            this.tempoEmMinutos = tempoEmMinutos;
        }
        
        public char getNecessitaEquipamento(){
            return necessitaEquipamento;
        }
        
        public void setNecessitaEquipamento(char necessitaEquipamento){
            this.necessitaEquipamento = necessitaEquipamento;
        }
    
        public double getValorCalculado(){
            return valorCalculado;
        }
    
        public void setValorCalculado(double valorCalculado){
            this.valorCalculado = valorCalculado;
        }    

}