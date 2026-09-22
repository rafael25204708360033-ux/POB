package semana04.exheranca.ex03.dominio;

public class EmailNotificacao extends Notificacao {

    public EmailNotificacao(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando E-mail para " + getDestinatario() + ": " + mensagem);
    }
}
