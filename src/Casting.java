/* uso isso aqui para criar bloco de anotação
   ou só // pra uma linha

 (method) equals() é utilizado para comparação de Strings e tem o equalsIgnoreCase() -> "Nome" = "nome"

(method) format()
String nome = "Maria";
    int idade = 30;
    double valor = 55.9999;                     %s(string), %d(int), %f(float), %.2f(double)
    System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
*/

public class Casting
{
    public static class ConverterTemperatura //casting explícito
    {
        public static void main(String[] args)
        {
            double temperatura = 90; //temperatura em °C
            temperatura = (int) (temperatura*1.8)+32; //converte double para int e a temperatura em °C para °F
            System.out.printf("%.2f Fahrenheit", temperatura); //uso de formatação de string
        }
    }

    public static class MediaNotas //não é necessário casting
    {
        public static void main(String[] args)
        {
            int nota1 = 10;
            int nota2 = 5;
            int media = (nota1 + nota2)/2;
            System.out.printf("A média entre as duas notas foi de %d", media);

        }
    }

    public static class DoubleParaInt //casting implícito de int para double
    {
        public static void main(String[] args)
        {
            int num = 3;
            double newNum = num + 0.1632644323;
            System.out.println(newNum);
        }
    }
}
