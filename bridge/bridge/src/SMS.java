public class SMS extends Canal{

    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando por SMS:" +mensagem);
    }
    
}
