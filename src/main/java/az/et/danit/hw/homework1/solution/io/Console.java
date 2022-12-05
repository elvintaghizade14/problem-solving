package az.et.danit.hw.homework1.solution.io;

public interface Console {
    String NEW_LINE = "\n";

    void print(String line);

    void print(char c);

    String readLn();

    default void printLn(final String line) {
        this.print(line);
        this.print(this.NEW_LINE);
    }

    default void printLn(final char c) {
        this.print(c);
        this.print(this.NEW_LINE);
    }

    default void printLn() {
        this.print(this.NEW_LINE);
    }

    default String readLn(final String message) {
        this.print(message);
        return readLn();
    }
}