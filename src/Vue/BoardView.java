package Vue;

import Controller.BoardController;
import Model.Board;

import javax.swing.*;
import java.awt.*;

public class BoardView extends JPanel {
    private BoardController itsBoard;
    private Images itsImages;

    public BoardView()
    {
        itsBoard = new BoardController();
        itsImages = new Images();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int numRows = 8;
        int numCols = 8;
        int cellWidth = getWidth() / numCols;
        int cellHeight = getHeight() / numRows;

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if ((row + col) % 2 == 0) {
                    g.setColor(Color.LIGHT_GRAY);
                } else {
                    g.setColor(Color.darkGray);
                }
                int x = col * cellWidth;
                int y = row * cellHeight;
                g.fillRect(x, y, cellWidth, cellHeight);
                if(itsBoard.getItsBoard()[row][col] != 0)
                {
                    if(itsBoard.getItsBoard()[row][col] < 10)
                    {
                        if(itsBoard.getItsBoard()[row][col] == 1)
                        {
                            g.drawImage(itsImages.getPionBImage(), x, y, cellWidth, cellHeight, null);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 2)
                        {
                            g.drawImage(itsImages.getTourBImage(), x, y, cellWidth, cellHeight, null);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 3)
                        {
                            g.drawImage(itsImages.getChevalBImage(), x, y, cellWidth, cellHeight, null);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 4)
                        {
                            g.drawImage(itsImages.getFouBImage(), x, y, cellWidth, cellHeight, null);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 5)
                        {
                            g.drawImage(itsImages.getRoiBImage(), x, y, cellWidth, cellHeight, null);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 6)
                        {
                            g.drawImage(itsImages.getReineBImage(), x, y, cellWidth, cellHeight, null);
                        }
                    }
                    else{
                        if(itsBoard.getItsBoard()[row][col] == 11)
                        {
                            g.drawImage(itsImages.getPionNImage(), x, y, cellWidth, cellHeight, null);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 12)
                        {
                            g.drawImage(itsImages.getTourNImage(), x, y, cellWidth, cellHeight, null);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 13)
                        {
                            g.drawImage(itsImages.getChevalNImage(), x, y, cellWidth, cellHeight, null);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 14)
                        {
                            g.drawImage(itsImages.getFouNImage(), x, y, cellWidth, cellHeight, null);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 15)
                        {
                            g.drawImage(itsImages.getRoiNImage(), x, y, cellWidth, cellHeight, null);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 16)
                        {
                            g.drawImage(itsImages.getReineNImage(), x, y, cellWidth, cellHeight, null);
                        }
                    }
                }
            }
        }
    }

}
