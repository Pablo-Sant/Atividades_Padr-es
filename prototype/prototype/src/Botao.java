class Botao implements ElementoUI {
    private final String estilo;
    private String texto;
    
    public Botao(String estilo) {
        this.estilo = estilo;
        
        System.out.println("Configurando botão " + estilo + " (processo pesado)");
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    @Override
    public ElementoUI clone() {
        try {
            Botao clone = (Botao) super.clone();
            clone.texto = null; // Reseta o texto para personalização
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public void exibir() {
        System.out.println("Botão [" + texto + "] - Estilo: " + estilo);
    }
}