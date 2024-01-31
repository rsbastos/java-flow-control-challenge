import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // criação do objeto scanner
        Scanner scanner = new Scanner(System.in);
        limparTela();
        
            System.out.print("Digite o primeiro número inteiro: ");
            int primeiroNumero = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int segundoNumero = scanner.nextInt();            

            try {
                verificar(primeiroNumero, segundoNumero);

            } catch (ParametrosInvalidosException e) {
                System.out.println("O segundo número deve ser maior que o primeiro número.");
            }   
            
            scanner.close();
    }     
    
    static void limparTela() {
        for (int i = 0; i < 50; i++) {
                System.out.print("\r\n");
        }
    }

    static void verificar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if(primeiroNumero > segundoNumero)
            throw new ParametrosInvalidosException();

            int contador = segundoNumero - primeiroNumero;

            if(contador == 0) {
                System.out.println("Resultado 0. Nenhum número a ser impresso.");
            } else {
                for(int i = 1; i <= contador; i++) {
                    System.out.println("Imprimindo o número " + i);
                }                 
            }
    }

}
