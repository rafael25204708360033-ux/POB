package controle;

import dominio.EmailNotificacao;
import dominio.Notificacao;
import dominio.PushNotificacao;
import dominio.SmsNotificacao;

public class ControleNotificacao {

    public static void processarEnvio(Notificacao notificacao, String texto) {
        notificacao.enviar(texto);
    }

    public static void main(String[] args) {
        Notificacao email = new EmailNotificacao("rafael@email.com");
        Notificacao sms = new SmsNotificacao("(21) 99999-8888");
        Notificacao push = new PushNotificacao("DEVICE-ID-2026-XYZ");

        System.out.println("=== PROCESSANDO ENVIOS POLIMORFICOS ===");
        processarEnvio(email, "Sua conta foi acessada.");
        processarEnvio(sms, "Seu codigo de verificacao e 2026.");
        processarEnvio(push, "Voce recebeu uma nova mensagem.");
    }
}
