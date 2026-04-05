public class NavegadorMain {
    public static void main(String[] args) {

        Navegador nav = new Navegador();

        System.out.println("Acessando Google...");
                nav.acessar("google.com");

        System.out.println("Acessando Youtube...");
        nav.acessar("youtube.com");

        System.out.println("Acessando Instagram...");
        nav.acessar("instagram.com");

        System.out.println("Voltando...");
        nav.voltar();

        System.out.println("Voltando...");
        nav.voltar();
        System.out.println("Avancando...");
        nav.avancar();
    }
}