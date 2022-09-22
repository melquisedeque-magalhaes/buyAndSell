import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.println("Digite o nome do produto que deseja comprar: ");
        String name = input.nextLine();

        System.out.println("Digite o valor de cada produto: ");
        float value = input.nextFloat();

        System.out.println("Digite a quantidade de produtos: ");
        int amount = input.nextInt();

        Product product = new Product(name, value, amount);

        float valueTotal =  product.calcBuy();

        System.out.println("O valor total a ser pago é: " + valueTotal);
    }
}