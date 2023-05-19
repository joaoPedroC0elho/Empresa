import java.util.Scanner;

public class Empresa {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String fone;


    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String fone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;
    }

    public void insert() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("Endereço: ");
        endereco = scanner.nextLine();
        System.out.print("Cidade: ");
        cidade = scanner.nextLine();
        System.out.print("Estado: ");
        estado = scanner.nextLine();
        System.out.print("CEP: ");
        cep = scanner.nextLine();
        System.out.print("Telefone: ");
        fone = scanner.nextLine();
    }

    public void print() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
        System.out.println("Telefone: " + fone);
    }
}