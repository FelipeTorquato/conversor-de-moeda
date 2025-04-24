import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha;
        double valor;
        String par;
        do {
            System.out.println("*************************************************");
            System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]\n\n");
            System.out.print("""
                    1) Dólar =>> Peso argentino
                    2) Peso argentino =>> Dólar
                    3) Dólar =>> Real brasileiro
                    4) Real brasileiro =›> Dólar
                    5) Dólar =>> Peso colombiano
                    6) Peso colombiano =>> Dólar
                    7) Sair
                    Escolha uma opção válida:
                    """);

            escolha = scanner.nextInt();

            if (escolha != 7) {
                System.out.print("Digite o valor que deseja converter: ");
                valor = scanner.nextDouble();

                switch (escolha) {
                    case 1:
                        par = "USD/ARS/";
                        chamaConversao(par, valor);
                        break;
                    case 2:
                        par = "ARS/USD/";
                        chamaConversao(par, valor);
                        break;
                    case 3:
                        par = "USD/BRL/";
                        chamaConversao(par, valor);
                        break;
                    case 4:
                        par = "BRL/USD/";
                        chamaConversao(par, valor);
                        break;
                    case 5:
                        par = "USD/COP/";
                        chamaConversao(par, valor);
                        break;
                    case 6:
                        par = "COP/USD/";
                        chamaConversao(par, valor);
                        break;
                }
            }
        } while (escolha != 7);
    }

    private static void exibeResultado(String base, String alvo, double valorInicial, double valorFinal) {
        System.out.printf("Valor %f [%s] corresponde ao valor final de =>>> %f [%s]\n", valorInicial, base, valorFinal, alvo);
    }

    private static void chamaConversao(String par, Double valor) {
        ConsultaConversao consulta = new ConsultaConversao();
        Conversao conversao;
        conversao = consulta.getConversao(par, valor);
        exibeResultado(conversao.getBase(), conversao.getAlvo(), valor, conversao.getResultado());
    }
}