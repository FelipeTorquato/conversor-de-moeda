import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;
        double valor;
        String par;
        ConsultaConversao consulta = new ConsultaConversao();
        Conversao conversao = null;
        while (escolha != 7) {
            System.out.println("*************************************************");
            System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]\n\n");
            System.out.print("""
                    1) Dólar =>> Peso argentino
                    2) Peso argentino =>> Dólar
                    3) Dólar =>> Real brasileiro
                    4) Real brasileiro =›> Dólar
                    5) Dólar =>> Peso colombiano
                    6) Peso colonbiano =>> Dólar
                    7) Sair
                    Escolha uma opção válida:
                    """);

            escolha = scanner.nextInt();

            System.out.print("Digite o valor que deseja converter: ");
            valor = scanner.nextDouble();

            switch (escolha) {
                case 1:
                    par = "USD/ARS/";
                    conversao = consulta.getConversao(par, valor);
                    exibeResultado(conversao.getBase(), conversao.getAlvo(), valor, conversao.getResultado());
                    break;
                case 2:
                    par = "ARS/USD/";
                    conversao = consulta.getConversao(par, valor);
                    exibeResultado(conversao.getBase(), conversao.getAlvo(), valor, conversao.getResultado());
                    break;
            }
        }
    }

    private static void exibeResultado(String base, String alvo, double valorInicial, double valorFinal) {
        System.out.println("Valor " + valorInicial + " [" + base + "] corresponde ao valor final de " +
                "=>>> " + valorFinal + "[" + alvo + "]");
    }
}