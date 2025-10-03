public class Main {
    public static void main(String[] args) {
        System.out.println("=== ABORDAGEM MANUAL (PROBLEMÁTICA) ===");
        
        // Criando 3 botões manualmente - MUITO CÓDIGO REPETIDO
        Botao manual1 = new Botao("Moderno");
        manual1.setTexto("Salvar");
        
        Botao manual2 = new Botao("Moderno"); 
        manual2.setTexto("Cancelar");
        
        Botao manual3 = new Botao("Moderno");
        manual3.setTexto("Excluir");
        
        manual1.exibir();
        manual2.exibir();
        manual3.exibir();
        
        System.out.println("\n=== ABORDAGEM PROTOTYPE (SOLUÇÃO) ===");
        
        
        Botao proto1 = (Botao) BibliotecaUI.criar("moderno");
        proto1.setTexto("Salvar");
        
        Botao proto2 = (Botao) BibliotecaUI.criar("moderno");
        proto2.setTexto("Cancelar");
        
        Botao proto3 = (Botao) BibliotecaUI.criar("moderno");
        proto3.setTexto("Excluir");
        
        proto1.exibir();
        proto2.exibir();
        proto3.exibir();
        
        System.out.println("\n=== USANDO OUTROS ESTILOS ===");
        
        
        Botao corporate = (Botao) BibliotecaUI.criar("corporate");
        corporate.setTexto("Enviar");
        
        Botao minimal = (Botao) BibliotecaUI.criar("minimal");
        minimal.setTexto("Fechar");
        
        corporate.exibir();
        minimal.exibir();
    }
}