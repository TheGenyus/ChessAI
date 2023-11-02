package Vue;

import javax.swing.*;

public class ChessWindow extends JFrame {

    private BoardView itsBoard;
    public ChessWindow(){
        // Initialize the frame
        setTitle("ChessAI"); // Set the title of the window
        setSize(800, 800); // Set the size (width, height) of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed
        setLocationRelativeTo(null); // Center the window on the screen

        itsBoard = new BoardView();
        this.add(itsBoard);

        this.setVisible(true);
    }
}
