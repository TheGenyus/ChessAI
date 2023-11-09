package Vue;

import Controller.BoardController;

import javax.swing.*;

public class ChessWindow extends JFrame {
    private BoardView itsBoard;
    public ChessWindow(BoardController board)
    {
        // Initialize the frame
        setTitle("ChessAI"); // Set the title of the window
        setSize(600, 600); // Set the size (width, height) of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed
        setLocationRelativeTo(null); // Center the window on the screen

        itsBoard = new BoardView(board);
        this.add(itsBoard);

        this.setVisible(true);
    }

    public BoardView getItsBoard() {
        return itsBoard;
    }


}
