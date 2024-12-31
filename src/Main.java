public class Main {
    public static void main(String[] args) {
        Item cocaCola = new Item(0, "Coca Cola", 8.0);
        Item doritos = new Item(1, "Doritos", 10.0);
        Item acai = new Item(2, "Açai", 17.0);

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarItem(cocaCola);
        carrinho.adicionarItem(doritos);
        carrinho.adicionarItem(acai);

        carrinho.listarCarrinho();
        carrinho.calcularPreco();

        carrinho.removerItem(1);

        carrinho.listarCarrinho();
        carrinho.calcularPreco();

    }
}