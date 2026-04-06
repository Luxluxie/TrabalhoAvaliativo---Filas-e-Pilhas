public class SenhasMain {public static void main(String[] args) {

    // Teste Navegador
    Navegador nav = new Navegador();
    nav.acessar("google.com");
    nav.acessar("youtube.com");
    nav.acessar("github.com");

    nav.voltar();
    nav.voltar();
    nav.avancar();

    System.out.println("\n------------------\n");

    // Teste Sistema de Senhas
    SistemaSenhas sistema = new SistemaSenhas();

    sistema.gerarSenha();
    sistema.gerarSenha();
    sistema.gerarSenha();

    sistema.chamarProximo();
    sistema.chamarProximo();

    sistema.mostrarHistorico();
}
}
