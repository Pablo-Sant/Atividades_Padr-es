public class Main {
    public static void main(String[] args) {
        
        Carta bolaDeFogo = CartaFactory.getCarta("Bola de fogo", 5, "Causa 6 de dano a um alvo");
        Carta curar = CartaFactory.getCarta("Curar", 3, "Restaura 5 de vida");
        Carta ataque = CartaFactory.getCarta("Ataque", 2, "Causa 3 de dano");
        
        System.out.println("\n--- Cartas na mão ---");
        
        
        bolaDeFogo.exibir(1);
        curar.exibir(2);
        ataque.exibir(3);
        
        // Tentando criar cartas duplicadas
        System.out.println("\n--- Tentando criar cartas duplicadas ---");
        Carta bolaDeFogo2 = CartaFactory.getCarta("Bola de fogo", 5, "Causa 6 de dano a um alvo");
        Carta curar2 = CartaFactory.getCarta("Curar", 3, "Restaura 5 de vida");
        
        System.out.println("\n--- Exibindo todas as cartas novamente ---");
        bolaDeFogo.exibir(1);
        curar.exibir(2);
        ataque.exibir(3);
        bolaDeFogo2.exibir(4);
        curar2.exibir(5);
    }
}