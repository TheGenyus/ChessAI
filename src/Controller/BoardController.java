package Controller;

import Model.Board;
import Vue.ChessWindow;

import javax.swing.*;

public class BoardController {

    private Board itsBoard;
    private ChessWindow itsWindow;

    public BoardController(){
        itsBoard = new Board();
        itsWindow = new ChessWindow(this);
        new MouseController(itsWindow);
        initPieces();
    }

    public int [][] getItsBoard()
    {
        return itsBoard.boardTab;
    }

    public void initPieces() {
        for (int y = 0; y < 8; y++) {
            this.itsBoard.boardTab[1][y] = 11; // Init pion noir
        }

        for (int y = 0; y < 8; y++) {
            this.itsBoard.boardTab[6][y] = 1; // Init pion blanc
        }

        this.itsBoard.boardTab[0][0] = 12; // Init tour noir
        this.itsBoard.boardTab[0][7] = 12; // Init tour noir

        this.itsBoard.boardTab[7][0] = 2; // Init tour blanc
        this.itsBoard.boardTab[7][7] = 2; // Init tour blanc

        this.itsBoard.boardTab[0][1] = 13; // Init cheval noir
        this.itsBoard.boardTab[0][6] = 13; // Init cheval noir

        this.itsBoard.boardTab[7][1] = 3; // Init cheval blanc
        this.itsBoard.boardTab[7][6] = 3; // Init cheval blanc

        this.itsBoard.boardTab[0][2] = 14; // Init fou noir
        this.itsBoard.boardTab[0][5] = 14; // Init fou noir

        this.itsBoard.boardTab[7][2] = 4; // Init fou blanc
        this.itsBoard.boardTab[7][5] = 4; // Init fou blanc

        this.itsBoard.boardTab[0][4] = 15; // Init roi noir
        this.itsBoard.boardTab[0][3] = 16; // Init reine noir

        this.itsBoard.boardTab[7][4] = 5; // Init roi blanc
        this.itsBoard.boardTab[7][3] = 6; // Init reine blanc
    }
}
