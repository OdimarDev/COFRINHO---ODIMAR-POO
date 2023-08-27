public class Real extends Moeda {
    
    //Cria um novo objeto Real com o valor especificado.
    public Real(double valor) {
        super(valor);
    }

    //Retorna o nome da moeda Real.
    @Override
    public String getNome() {
        return "Real";
    }

    //Retorna o símbolo da moeda Real.
    @Override
    public String getSimbolo() {
        return "R$";
    }

    //Retorna o valor da moeda Real em reais.
    @Override
    public double getValorEmReais() {
        return valor;
    }

}

