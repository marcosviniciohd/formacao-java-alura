public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        String tipoDePlano = "plus";
        boolean incluidoNoPlano = true;

        if (anoDeLancamento < 2000) {
            System.out.println("Filme antigo");
        } else {
            System.out.println("Filme novo");
        }

        if (tipoDePlano.equals("plus") && incluidoNoPlano) {
            System.out.println("Filme liberado no plano plus");
        } else {
            System.out.println("Desculpe, este filme não está disponível no seu plano");
        }
    }
}
