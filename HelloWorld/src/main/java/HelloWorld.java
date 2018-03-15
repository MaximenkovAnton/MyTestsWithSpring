import message.MessageProvider;
import render.TextRender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/app.xml");
        TextRender render = context.getBean("render", TextRender.class);
        setTextIfNeeded(args, render.getMessageProvider());
        render.render();
    }

    private static void setTextIfNeeded(String[] args, MessageProvider messageProvider) {
        if(args.length > 0){
            setTextFromArgs(args, messageProvider);
        }
    }

    private static char newLine = '\n';
    private static void setTextFromArgs(String[] args, MessageProvider messageProvider) {
        messageProvider.setMessage(args[0]);
        for (int i = 1; i < args.length; i++) {
            messageProvider.setMessage(messageProvider.getMessage().concat(newLine + args[i]));
        }
    }
}
