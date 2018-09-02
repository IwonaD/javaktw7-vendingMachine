package pl.sdacademy.vending.controller;

import pl.sdacademy.vending.model.VendingMachine;

public class CustomerOperationController {

    //skomponowaLISMY OBIEKT DO INNEJ KLASY. To jest kompozycja. Lepsza niz dziedziczenie

    private final VendingMachine machine;

    public CustomerOperationController(VendingMachine machine) {
        this.machine = machine;
    }

    public void printmachine() {

        for (int row = 0; row <= machine.rowsSize(); row++) {
            for (int col = 0; col < machine.colSize(); col++) {
                //wyswietl gorna belke dla komorki o koordynatach col row
                printUpperBoundaryForCell(row, col);
                //drukuj belke
            }
            System.out.println();
            for (int col = 0; col < machine.colSize(); col++) {
                //drukuj symbole
                printSymbolForCell(row, col);
            }
            System.out.println();
            for (int col = 0; col < machine.colSize(); col++) {
                //drukuj belke
                printLowerBoundaryForCell(row, col);
            }
            System.out.println();
        }

        /* dla kazdego wiersza wyswietlic:
            dla kazdej z kolumn wyswietl:

        -gorna czesc ( +----+)
        -boki oraz numer
        -dolna czesc (+-----+)
         */


//        for (int i = 0; i < machine.rowsSize(); i++) {
//            for ( int j = 0; j < machine.colSize(); j++) {
//                System.out.println("+------------+");
//            }
//            System.out.println();
//
//            for (int j = 0; j<machine.colSize(); j++ ) {
//                System.out.println(" + |  +");
//            }
//        }
    }
    private void printUpperBoundaryForCell(int row, int col) {
        System.out.print("+--------+");
    }
    private void printSymbolForCell(int row, int col) {
        char rowSymbol = (char) ('A' + row);
        int colSymbol = col + 1;
        System.out.print("|   " + rowSymbol + colSymbol + "   |");
    }

    private void printLowerBoundaryForCell(int row, int col) {
        System.out.print("+--------+");

    }




}
