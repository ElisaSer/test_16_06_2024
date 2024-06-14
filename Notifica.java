
public abstract class Notifica {
    private String destinatario;
    private String messaggio;

    public Notifica(String destinatario, String messaggio) {
        this.destinatario = destinatario;
        this.messaggio = messaggio;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    public abstract void invia();

}