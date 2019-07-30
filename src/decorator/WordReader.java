package decorator;

public class WordReader extends ReaderDecorator {

    public WordReader(Reader reader) {
        super(reader);
    }

    @Override
    public String read() {
        String c;
        StringBuilder result = new StringBuilder();

        while (!(c = super.read()).equals(" "))
            result.append(c);

        return result.toString();
    }
}
