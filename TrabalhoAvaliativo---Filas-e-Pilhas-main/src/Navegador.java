import java.util.Stack;

public class Navegador {
    private Stack<String> pilhaVoltar;
    private Stack<String> pilhaAvancar;
    private String paginaAtual;

    public Navegador() {
        pilhaVoltar = new Stack<>();
        pilhaAvancar = new Stack<>();
        paginaAtual = null;
    }

    // Acessar nova página
    public void acessar(String url) {
        if (paginaAtual != null) {
            pilhaVoltar.push(paginaAtual);
        }
        paginaAtual = url;
        pilhaAvancar.clear(); // limpa histórico de avanço

        System.out.println("Acessando: " + paginaAtual);
    }

    // Voltar página
    public void voltar() {
        if (pilhaVoltar.isEmpty()) {
            System.out.println("Não é possível voltar.");
            return;
        }

        pilhaAvancar.push(paginaAtual);
        paginaAtual = pilhaVoltar.pop();

        System.out.println("Voltou para: " + paginaAtual);
    }

    // Avançar página
    public void avancar() {
        if (pilhaAvancar.isEmpty()) {
            System.out.println("Não é possível avançar.");
            return;
        }

        pilhaVoltar.push(paginaAtual);
        paginaAtual = pilhaAvancar.pop();

        System.out.println("Avançou para: " + paginaAtual);
    }
}