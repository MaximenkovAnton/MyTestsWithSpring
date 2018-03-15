package message;

public class SimpleMessageProvider implements MessageProvider {
    String message = "HelloWorld!";

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
