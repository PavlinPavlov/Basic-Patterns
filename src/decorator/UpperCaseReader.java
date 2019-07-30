package decorator;

public class UpperCaseReader extends ReaderDecorator {

    public UpperCaseReader(Reader reader) {
        super(reader);
    }

    @Override
    public String read() {
        return super.read().toUpperCase();
    }
}
