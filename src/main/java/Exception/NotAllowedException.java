package Exception;

public class NotAllowedException extends RuntimeException{
        private String message;
    public NotAllowedException(String message) {
        super(message);
        this.message = message;
    }
}
