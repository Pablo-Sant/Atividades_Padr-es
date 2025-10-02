public class Email extends Canal{
    
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando por email: "+mensagem);
    }
}
