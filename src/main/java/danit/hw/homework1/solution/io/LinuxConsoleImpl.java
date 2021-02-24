package danit.hw.homework1.solution.io;

import java.util.Scanner;

public class LinuxConsoleImpl implements Console {
    private final Scanner scanner;

    public LinuxConsoleImpl(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void print(final String line) {
        System.out.print(line);
    }

    @Override
    public void print(char c) {
        System.out.print(c);
    }

    @Override
    public String readLn() {
        return this.scanner.nextLine();
    }

}
