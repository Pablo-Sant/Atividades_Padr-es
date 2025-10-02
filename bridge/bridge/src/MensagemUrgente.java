public class MensagemUrgente extends Mensagem{
    public MensagemUrgente(Canal canal){
        super(canal);
    }

    @Override
    public void enviar(String mensagem){
        canal.enviar("Urgente: " +mensagem);
    }
}
