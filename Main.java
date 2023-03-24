package locacao;

import java.util.Scanner;
import java.util.Date;

public class Locacao{
    public static void Main(String[] args){
        Scanner sc = new Scanner(System.in);
        cadastrarQuadra();
        cadastrarLocatario();
        calcularLocacao();
        resumoLocacao();
        }
    
    static void cadastrarQuadra(){
        System.out.println("Qual o nome da quadra? (Apenas número)");
        System.out.println("1 - QUADRA DE AREIA - Beach Tennis, Futvolei, Vôlei de Praia etc.");
        System.out.println("2 - QUADRA DE SAIBRO - Tênis, Futebol etc.");
        int nomeDaQuadra = sc.next();
        
        if (nomeDaQuadra = 1){
            String tipoDeQuadra = "Areia";
        } else if (nomeDaQuadra = 2){
            String tipoDeQuadra = "Saibro";
        } else {
            System.out.println("Tipo inválido.")
        }

        System.out.println("Qual o valor do minuto?");
        double valorDoMinuto = sc.next(); 
    }
    
    static void cadastrarLocatario(){
        verificarMaioridade();
        System.out.println("Qual o nome do locatário?");
        String nome = sc.next();
        System.out.println("Qual o CPF do locatário?");
        String cpf = sc.next();
        System.out.println("Qual o telefone do locatário?");
        String telefone = sc.next();
        
    }

    static void verificarMaioridade(){
        Date anoAtual = new Date();
        int quantosAnos = getYear() - anoNascimento;
        
        System.out.println("Qual o ano de nascimento do locatário?");
        if (quantosAnos < 18){
            System.out.println("O locatário é menor de idade. Não é possível concluir a locação.");
            break;
        }
    }

    static void calcularLocacao(){
        System.out.println("Qual o valor do minuto?");
        double valorDoMinuto = sc.next();
        System.out.println("Por quanto tempo a quadra será alugada?");
        double tempoEmMinutos = sc.next();
        System.out.println("Qual o valor do minuto?");
        double valorDoMinuto = sc.next();
        System.out.println("Vai precisar de equipamento? (S/N)");
        char necessitaEquipamento = sc.next();

        double valordaLocacao = valorDoMinuto * tempoEmMinutos;
        
        if(tempoEmMinutos > 120){
            valordaLocacao = valordaLocacao - 10%;
        }

        if (necessitaEquipamento = "S"){
            valordaLocacao = valordaLocacao + 50;
        }
    }

    static void resumoLocacao(){
        System.out.println("DADOS DO LOCATÁRIO:");
        System.out.printf("Locatario: %s", &Locatario);
        System.out.printf("CPF: %s", &cpf);
        System.out.printf("Telefone: %s", &telefone);
        System.out.println("DADOS DA QUADRA:");
        System.out.printf("Quadra: %i ", &nomeDaQuadra);
        System.out.printf("Tipo da quadra: %s", &tipoDeQuadra);
        System.out.println("DADOS DA LOCAÇAO:");
        System.out.printf("Tempo em minutos: %i", &tempoEmMinutos);
        System.out.printf("Vai usar equipamento: %c", &necessitaEquipamento);
        System.out.printf("Valor da locação: %d ", &valordaLocacao);

    }
}

