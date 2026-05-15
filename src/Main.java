public class Main {
    public static void main(String[] args) {
        // Criacao do Mediator
        IChatMediator salaDeChat = new ChatMediator();

        // Criacao dos usuarios
        Usuario user1 = new UsuarioConcreto(salaDeChat, "Alice");
        Usuario user2 = new UsuarioConcreto(salaDeChat, "Bob");
        Usuario user3 = new UsuarioConcreto(salaDeChat, "Charlie");

        // Registrando na sala
        salaDeChat.registrarUsuario(user1);
        salaDeChat.registrarUsuario(user2);
        salaDeChat.registrarUsuario(user3);

        // Simulando o chat
        user1.enviar("Ola, pessoal! Como voces estao?");
        user2.enviar("Oi Alice! Tudo bem por aqui.");
        user3.enviar("Boa noite! Pessoal, estou com uma duvida no codigo.");
    }
}