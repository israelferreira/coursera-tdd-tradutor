package israelferreira;

public class Tradutor {

    private String traducao;

    public boolean estaVazio() {
        return (traducao == null);
    }

    public void adicionaTraducao(String palavra, String traducao) {
        this.traducao = traducao;
    }

    public String traduzir(String palavra) {
        return traducao;
    }
}
