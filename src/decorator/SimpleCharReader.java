package decorator;

public class SimpleCharReader implements Reader {

    private String text;
    private int index = 0;

    public SimpleCharReader(String text) {
        this.text = text;
    }

    @Override
    public String read() {
        char c = text.charAt(index++);
        return String.valueOf(c);
    }
}
