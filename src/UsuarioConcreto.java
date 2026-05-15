public class UsuarioConcreto extends Usuario {
    
    public UsuarioConcreto(IChatMediator mediator, String nome) {
        super(mediator, nome);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("\nEnviado" + this.nome + " diz: " + mensagem);
        mediator.enviarMensagem(mensagem, this);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println("Recebido por " + this.nome + ". Mensagem: " + mensagem);
    }
}