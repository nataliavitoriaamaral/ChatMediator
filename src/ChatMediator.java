import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {
    private List<Usuario> usuarios;

    public ChatMediator() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario remetente) {
        for (Usuario usuario : usuarios) {
            // O remetente não recebe a própria mensagem
            if (usuario != remetente) {
                usuario.receber(mensagem);
            }
        }
    }
}