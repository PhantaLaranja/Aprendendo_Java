public class Main { //UperCase para classes
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match!"); //Use sout para digitar ''System.out.print()" rapidamente
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true; //String boolean, byte, char, short, int, long, float e double (tipos primitivos)
        double notaDoFilme = 8.1;
        //media calculada por três notas
        double media = (9.4 + 6.5 + 8.0) / 3;
        System.out.println(media);

        String sinopse = """
                        Filme Top Gun
                        Galã dos anos 80 pilotando avião
                        Muito bom!
                        Ano de lançamento
                        """ + anoDeLancamento; //bloco com vários System.out.println() - text block

        int classificacao = (int) media/2; //usei casting explícito pra dizer pro compilador converter double para int
        System.out.println(classificacao);

    }
}
