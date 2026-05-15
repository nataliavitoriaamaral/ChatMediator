public interface IChatMediator {
    void enviarMensagem(String mensagem, Usuario remetente);
    void registrarUsuario(Usuario usuario);
}