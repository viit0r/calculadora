package calculadora;
public class Calculadora {

    private final double primeiroValor;
    private final double segundoValor;
    private double dResultado;

    public Calculadora(String primeiroValor, String segundoValor) {
        this.primeiroValor = Double.parseDouble(primeiroValor);
        this.segundoValor = Double.parseDouble(segundoValor);
    }

    public void somar(){
        dResultado = primeiroValor + segundoValor;
    }
    public void subtrair(){
        dResultado = primeiroValor - segundoValor;
    }
    public void multiplicar(){
        dResultado = primeiroValor * segundoValor;
    }
    public void dividir(){
        dResultado = primeiroValor / segundoValor;
    }

    public String resultado(){
        return "O resultado é: " + dResultado;
    }
}
