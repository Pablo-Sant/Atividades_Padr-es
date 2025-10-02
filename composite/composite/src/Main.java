public class Main {
    public static void main(String[] args) {
    
        Menu arquivosMenu = new Menu("ARQUIVOS");
        
        MenuItem salvar = new MenuItem("SALVAR");
        MenuItem deletar = new MenuItem("DELETAR");
        
        Menu opcoesMenu = new Menu("OPÇÕES");
        
        MenuItem colar = new MenuItem("COLAR");
        MenuItem copiar = new MenuItem("COPIAR");
        
        opcoesMenu.add(colar);
        opcoesMenu.add(copiar);
        
        arquivosMenu.add(salvar);
        arquivosMenu.add(deletar);
        arquivosMenu.add(opcoesMenu);
        
        
        arquivosMenu.show();
    }
}