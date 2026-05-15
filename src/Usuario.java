public abstract class Usuario {
    protected IChatMediator mediator;
    protected String nome;

    public Usuario(IChatMediator mediator, String nome) {
        this.mediator = mediator;
        this.nome = nome;
    }

    public abstract void enviar(String mensagem);
    public abstract void receber(String mensagem);

    public String getNome() {
        return nome;
    }
}
