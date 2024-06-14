public class Sms extends Notifica{
    

    public Sms(String destinatario, String messaggio) {
        super(destinatario, messaggio);
    }

    @Override
    public void invia() {
        System.out.println("Hai ricevuto il seguente messaggio: " + getMessaggio());
    }
    
}