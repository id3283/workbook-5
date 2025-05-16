public abstract class AbstractLlm {

    String formatPrompt(String prompt) {
        return "```" + prompt + "```";
    }

    abstract  String sendPrompt(String prompt);
}
