import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch ( Exception e) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.err.println("O valor do paramentro Um e maior que o paramentro Segundo");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws Exception {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new Exception("valor diferente das alternativas de escolha");
        } else {
            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
            for (int x = 0; x < contagem; x++) {
                System.out.println("Imprimindo o número 2" + contagem);
                }
            }
        }
    }
