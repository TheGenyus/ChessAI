package Vue;

import Controller.BoardController;
import Model.Board;
import Model.Piece;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;

public class BoardView extends JPanel {
    private final BoardController itsBoard;

    public BoardView(BoardController board)
    {
        itsBoard = board;
    }

    public void drawImage(BufferedImage image, int x, int y, Graphics g)
    {
        int cellWidth = getWidth() / 8;
        int cellHeight = getHeight() / 8;
        g.drawImage(image, x, y, cellWidth, cellHeight, null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int cellWidth = getWidth() / 8;
        int cellHeight = getHeight() / 8;

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0) {
                    g.setColor(Color.LIGHT_GRAY);
                } else {
                    g.setColor(Color.darkGray);
                }
                int x = col * cellWidth;
                int y = row * cellHeight;
                g.fillRect(x, y, cellWidth, cellHeight);
            }
        }
        for(Piece piece : itsBoard.getPlayer1().getItsPieces())
        {
            drawImage(piece.getItsImage(), piece.x, piece.y, g);
        }

        for(Piece piece : itsBoard.getPlayer2().getItsPieces())
        {
            drawImage(piece.getItsImage(), piece.x, piece.y, g);
        }
    }
}
