import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual a idade do seu filho?");
    int idade = scanner.nextInt();
    if (9 >= idade){
      System.out.println("Seu filho é criança, sua bonificação é de 400 reais");
    } else if (12 >= idade && idade > 9){
      System.out.println("Seu filho é pre-adolecente, sua bonificação é de 300 reais");
    } else if (17 >= idade && idade > 12){
      System.out.println("Seu filho é adolecente, sua bonificação é de 200 reais ");
    } else
      System.out.println("A analise relatou que os dados estão errado ou seu filho é maior 18 anos, por isso não haverá bonificação");
  }

}
