import java.util.Scanner;

public class Restaurante extends Empresa {
    private String tipoComida;
    private double precoMedioPrato;


    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String fone,
                       String tipoComida, double precoMedioPrato) {
        super(nome, endereco, cidade, estado, cep, fone);
        this.tipoComida = tipoComida;
        this.precoMedioPrato = precoMedioPrato;
    }


    public void insertData() {
        insert();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tipo de Comida: ");
        tipoComida = scanner.nextLine();
        System.out.print("Preço Médio do Prato: ");
        precoMedioPrato = scanner.nextDouble();
    }

    public void print() {
        super.print();
        System.out.println("Tipo de Comida: " + tipoComida);
        System.out.println("Preço Médio do Prato: " + precoMedioPrato);
    }
}