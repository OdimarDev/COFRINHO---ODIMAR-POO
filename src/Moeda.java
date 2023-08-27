public abstract class Moeda {
    protected double valor;
    protected double valoremreais;

    //Cria um novo objeto Moeda com o valor da moeda (valor) fornecido.
    public Moeda(double valor) {
        this.valor = valor;
    }

    //Retorna o valor da moeda em reais.
    public double getValorEmReais() {
        return valor;
        }

    //Retorna o valor da moeda em sua unidade monetária específica.
    public double getValor() {
        return valor;
    }

    //Retorna o nome da moeda.
    public abstract String getNome();

    //Retorna o símbolo da moeda.
    public abstract String getSimbolo();
}
