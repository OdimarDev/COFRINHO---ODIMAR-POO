import java.util.ArrayList;

public class Cofrinho {
    protected ArrayList<Moeda> moedas;

    //Cria um novo objeto Cofrinho.
    public Cofrinho() {
        moedas = new ArrayList<Moeda>();
    }

    //Adiciona uma moeda ao cofrinho.
    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    //Remove uma moeda do cofrinho com base no índice(index) fornecido.
    public void removerMoeda(int index) {
        moedas.remove(index);
    }

    //Calcula o valor total em reais das moedas no cofrinho.
    public double calcularTotal() {
        double total = 0.0;
        for (Moeda moeda : moedas) {
            total += moeda.getValorEmReais();
        }
        return total;
    }

    //Lista as moedas no cofrinho com seus índices, nomes, símbolos e valores.
    public void listarMoedas() {
        for (int i = 0; i < moedas.size(); i++) {
            Moeda moeda = moedas.get(i);
            System.out.printf("%d. %s (%s %.2f)%n", i + 1, moeda.getNome(), moeda.getSimbolo(), moeda.getValor());
        }   
    }

    //Retorna o tamanho da lista de moedas no cofrinho.
    public int tamanhoLista(){
         return moedas.size();
    }

}

