package exerciciosDeAula.secao8.estudoComClasses; // Pacote da classe

public class Triangle /*Nome da classe*/ {
    public double a;        //Prefixo 'public' permite que o atributo ou método seja usado em outros arquivos
    public double b; //Atributos da classe
    public double c;

    public double /*Tipo de dado que o método retorna*/ area /*Nome do método*/ () /*Lista de parâmetros*/ {
        double p = (a + b + c) / 2; //Corpo do método
        return Math.sqrt(p * (p - a) * (p - a) * (p - c));
    }
}
