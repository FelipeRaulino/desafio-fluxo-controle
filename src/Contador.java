import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int parametroUm = scanner.nextInt();
        int parametroDois = scanner.nextInt();

        try {
            contarNumeros(parametroUm, parametroDois);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void contarNumeros(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois || parametroUm == parametroDois) {
            throw new ParametrosInvalidosException(
                    "Parâmetro inválidos, certifique-se de enviar os parâmetros corretamente!");
        }

        int valorContagemTotal = parametroDois - parametroUm;

        for (int i = 1; i <= valorContagemTotal; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }

}
