package trabalhopp;

import java.util.Scanner;

/**
 *
 * @author Marcos Felipe Pessoa
 * @since 13/12/2024 at 20:43
 */

public class APP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        String nome = scan.nextLine();
        System.out.println("Informe a nota numero um: ");
        Double nota1 = scan.nextDouble();
        System.out.println("Informe a nota numero dois: ");
        Double nota2 = scan.nextDouble();
        System.out.println("Informe a nota numero tres: ");
        Double nota3 = scan.nextDouble();
        System.out.println("Informe a nota numero quatro: ");
        Double nota4 = scan.nextDouble();
        scan.nextLine();
        
        Boletim bl = new Boletim(nome, nota1,nota2,nota3,nota4);
        
        System.out.println("Sua media foi de: " + bl.Media(nota1, nota2, nota3, nota4));
        System.out.println(bl.Aprovacao());
    }
    
}