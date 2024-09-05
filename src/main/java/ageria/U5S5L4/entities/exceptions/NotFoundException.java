package ageria.U5S5L4.entities.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String description){
        super("Il prodotto " + description + "non e' stato trovato");
    }
}
