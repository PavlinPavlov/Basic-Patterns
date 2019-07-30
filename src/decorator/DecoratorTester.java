package decorator;

public class DecoratorTester {

    private static final String TEXT =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";

    public static void main(String[] args) {
        Reader reader = new SimpleCharReader(TEXT);

        Reader wordReader = new WordReader(reader);

        Reader upperCaseReader = new UpperCaseReader(wordReader);

        System.out.println(upperCaseReader.read());
        System.out.println(upperCaseReader.read());
        System.out.println(upperCaseReader.read());
        System.out.println(upperCaseReader.read());
    }
}
