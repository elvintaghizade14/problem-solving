package az.et.danit.hw.homework2.solution;

import java.util.Objects;

public class Cell {
    public final int row;
    public final int column;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return String.format("Cell[row=%d, column=%d]", row, column);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell that = (Cell) o;
        return this.row == that.row && this.column == that.column;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column);
    }
}
