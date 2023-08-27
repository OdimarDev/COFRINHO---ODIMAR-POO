public class Euro extends Moeda {
    
    //Cria um novo objeto Euro com o valor especificado.
    public Euro(double valor) {
        super(valor);
    }

    //Retorna o nome da moeda Euro.
    @Override
    public String getNome() {
        return "Euro";
    }

    //Retorna o símbolo da moeda Euro.
    @Override
    public String getSimbolo() {
        return "EUR";
    }

    //Retorna o valor da moeda Euro em reais, considerando a cotação atual.
    @Override
    public double getValorEmReais() {
        double cotacaoEuro = 6.40; // Cotação atual do Euro em relação ao Real
        return valor * cotacaoEuro;
    }

}

