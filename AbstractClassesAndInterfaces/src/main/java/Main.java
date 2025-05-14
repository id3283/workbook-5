import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        BaseLlm llm = new GeminiLlm();

        String response = llm.sendPrompt("What is the meaning of my life?");

        System.out.println("Response: " + response);

    }
}
