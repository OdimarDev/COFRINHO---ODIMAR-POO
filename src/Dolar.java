public class Dolar extends Moeda {
    
    //Cria um novo objeto Dólar com o valor especificado.
    public Dolar(double valor) {
        super(valor);
    }
    //Retorna o nome da moeda Dólar.
    @Override
    public String getNome() {
        return "Dólar";
    }

    //Retorna o símbolo da moeda Dólar.
    @Override
    public String getSimbolo() {
        return "USD";
    }

    // Retorna o valor da moeda Dólar em reais, considerando a cotação atual.
    @Override
    public double getValorEmReais() {
        double cotacaoDolar = 5.30; // Cotação atual do Dólar em relação ao Real
        return valor * cotacaoDolar;
}

}
