import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        AbstractLlm llm = new LlamaLlm();

        String response = llm.sendPrompt("Was tobacco smoke insufflation really a thing?");

        System.out.println("Response: " + response);

    }
}
