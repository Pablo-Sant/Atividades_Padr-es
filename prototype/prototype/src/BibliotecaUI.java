import java.util.HashMap;
import java.util.Map;

class BibliotecaUI {
    private static final Map<String, ElementoUI> prototipos = new HashMap<>();
    
    static {
        
        prototipos.put("moderno", new Botao("Moderno"));
        prototipos.put("corporate", new Botao("Corporate"));
        prototipos.put("minimal", new Botao("Minimal"));
    }
    
    public static ElementoUI criar(String tipo) {
        ElementoUI prototipo = prototipos.get(tipo);
        if (prototipo == null) throw new IllegalArgumentException("Tipo não encontrado");
        return prototipo.clone();
    }
}