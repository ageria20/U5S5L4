package ageria.U5S5L4.entities.exceptions;

public class NotFoundExceptionById extends RuntimeException{
    public NotFoundExceptionById(long id){
        super("Il prodotto con id: " + id + " non e' stato trovato");
    }
}
