package render;

import message.MessageProvider;

import java.util.Objects;

public class StandartOutputRender implements TextRender{
    private MessageProvider messageProvider;
    public void render() {
        Objects.requireNonNull(messageProvider, "You must set property messageProvider in " +
                getClass().getCanonicalName());
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }

    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }
}
