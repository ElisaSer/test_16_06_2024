public class NotificaApp extends Notifica{
    
    public NotificaApp(String destinatario, String messaggio) {
        super(destinatario, messaggio);
    }

    @Override
    public void invia() {
        System.out.println("Ci sono dei nuovi messaggi!");
    }
}
