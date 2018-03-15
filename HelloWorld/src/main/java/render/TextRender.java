package render;

import message.MessageProvider;

public interface TextRender {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
