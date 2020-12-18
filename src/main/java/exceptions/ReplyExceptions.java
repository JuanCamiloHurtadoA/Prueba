package exceptions;

public class ReplyExceptions extends AssertionError {

    public static final String ANSWER_QUESTIONS= "The advertisement was not created successfully";
    public ReplyExceptions(String message) {
        super(message);
    }
}
