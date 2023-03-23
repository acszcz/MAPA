public class Locatario{
        private String nome;
        private String cpf;
        private String telefone;
        private int anoNascimento;
        
        public Locatario(String nome, String cpf, String telefone, int anoNascimento){
            setNome(nome);
            setCpf(cpf);
            setTelefone(telefone);
            setAnoNascimento(anoNascimento);
        }
        
        public String getNome() {
            return nome;
        }
        
        public void setNome (String nome) {
            this.nome = nome;
        }
        
        public String getCpf(){
            return cpf;
        }
        
        public void setCpf(String cpf){
            this.cpf = cpf;
        }
    
        public String getTelefone(){
            return telefone;
        }
    
        public void setTelefone(String telefone){
            this.telefone = telefone;
        }
    
        public int getAnoNascimento(){
            return anoNascimento;
        }
    
        public void setAnoNascimento(int anoNascimento){
            this.anoNascimento = anoNascimento;
        }
    
}
