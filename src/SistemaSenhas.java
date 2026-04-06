
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;

public class SistemaSenhas {
    private Queue<Integer> fila;
    private List<Integer> historico;
    private int contador;

    public SistemaSenhas() {
        fila = new LinkedList<>();
        historico = new ArrayList<>();
        contador = 1;
    }

    // Gerar nova senha
    public void gerarSenha() {
        fila.add(contador);
        System.out.println("Senha gerada: " + contador);
        contador++;
    }

    // Chamar próximo paciente
    public void chamarProximo() {
        if (fila.isEmpty()) {
            System.out.println("Não há pacientes na fila.");
            return;
        }

        int senha = fila.poll();
        historico.add(senha);

        System.out.println("Chamando senha: " + senha);
    }

    // Mostrar histórico
    public void mostrarHistorico() {
        System.out.println("Histórico de chamadas: " + historico);
    }
}