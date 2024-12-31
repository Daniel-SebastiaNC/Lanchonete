import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Item> itens;

    public Carrinho() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(int id){
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getId() == id) {
                System.out.println(itens.get(i).getName() + " foi removido com sucesso!");
                itens.remove(i);
            }
        }
    }

    public void calcularPreco(){
        var valor = 0;
        for (Item item : itens) {
            valor += item.getPrice();
        }
        System.out.println("Total: R$" + valor);
    }

    public void listarCarrinho(){
        for (Item item : itens){
            item.apresentar();
        }
    }
}
