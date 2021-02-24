package danit.hw.homework1.solution.io;

public interface Console {
    String NEW_LINE = "\n";

    void print(String line);

    void print(char c);

    String readLn();

    default void printLn(final String line) {
        print(line);
        print(this.NEW_LINE);
    }

    default void printLn() {
        print(this.NEW_LINE);
    }

    default String readLn(final String message) {
        print(message);
        return readLn();
    }
}