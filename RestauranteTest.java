
public class RestauranteTest {



    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("Joao", "qi20","Brasilia", "DF", "777777","99999999999","Massa",30.0);
        restaurante.insertData();
        System.out.println("\nDados do Restaurante:");
        restaurante.print();
    }
}