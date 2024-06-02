package tic_tac_toe_01.model;

import java.util.ArrayList;
import java.util.List;

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

    public List<Pair> getFreeCells() {
        List<Pair> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (cell[i][j] == null) {
                    Pair rowColumn = new Pair(i, j);
                    freeCells.add(rowColumn);
                }
            }
        }

        return freeCells;
    }


    public boolean addPiece(int row, int column, Symbol symbol) {
        if(row < 3 && column <3) {
            if (cell[row][column] != null) {
                return false;
            }
            cell[row][column] = new Cell(symbol);
        }
        else
            return false;
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
