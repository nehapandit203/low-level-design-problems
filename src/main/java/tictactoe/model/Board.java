package tictactoe.model;

import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;

public class Board {
    public int size;
    public Cell[][] cell;


    public  Board(int size) {
        this.size = size;
        this.cell = new Cell[size][size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (cell[i][j] == null) {
                    Pair<Integer, Integer> rowColumn = new Pair<>(i, j);
                    freeCells.add(rowColumn);
                }
            }
        }

        return freeCells;
    }


    public boolean addPiece(int row, int column, Symbol symbol) {
        if(cell[row][column] != null) {
            return false;
        }
        cell[row][column] = new Cell(symbol);
        return true;
    }

    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (cell[i][j] != null) {
                    System.out.print(cell[i][j].getSymbol().name()+ "   ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();

        }

    }
}
