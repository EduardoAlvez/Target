package testeGupy;

import java.util.Scanner;

public class teste05 {

	public static void main(String[] args) {
        // Cria um scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita uma string ao usuário
        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine();
        
        // Inverte a string
        String reversedString = reverseString(inputString);
        
        // Exibe a string invertida
        System.out.println("String invertida: " + reversedString);
        
        // Fecha o scanner
        scanner.close();
    }
    
    public static String reverseString(String input) {
        // Converte a string em um array de caracteres
        char[] charArray = input.toCharArray();
        
        // Inicializa uma string vazia para armazenar a string invertida
        String reversed = "";
        
        // Percorre o array de caracteres de trás para frente e concatena os caracteres invertidos
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed += charArray[i];
        }
        
        return reversed;
    }
}
