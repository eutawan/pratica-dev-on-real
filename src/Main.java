import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o endereço ip: ");
        String endereco = sc.nextLine();

        String enderecoDesfigurado = desfigurarEndereco(endereco);
        System.out.println("Endereço desfigurado: " + enderecoDesfigurado);
    }

    public static String desfigurarEndereco(String endereco){
        return endereco.replace(".", "[.]");
    }
}