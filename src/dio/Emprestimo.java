package dio;

public class Emprestimo {
    public static int getDuasPartcelas() {
        return 2;
    }
    public static int getTresPartcelas() {
        return 3;
    }
    public static double getTaxaDuasPartcelas() {
        return 0.3;
    }
    public static double getTaxaTresPartcelas() {
        return 0.45;
    }
    public static void calcular(double valor, int parcelas) {
        if (parcelas == 2) {
            double valorFinal = valor + (valor * getTaxaDuasPartcelas());

            System.out.println("Valor final do empréstimo pára 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxaTresPartcelas());

            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }
    }
}
