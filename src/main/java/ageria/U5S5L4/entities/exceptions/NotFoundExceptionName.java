package ageria.U5S5L4.entities.exceptions;

public class NotFoundExceptionName extends RuntimeException{
    public NotFoundExceptionName(String description){
        super("Il prodotto " + description + "non e' stato trovato");
    }
}
