package boardgame;

import java.util.Arrays;

public class Position {

    private int row;
    private int column;

    public Position(int row, int column) {
        this.column = column;
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        String[] columnChar = new String[]{"a","b","c","d","e","f","g","h"};
        return columnChar[column] + row;
    }

    public void setValues(int row, int column) {
        this.column = column;
        this.row = row;
    }
}
