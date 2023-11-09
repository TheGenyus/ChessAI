package Vue;

import Controller.BoardController;
import Model.Board;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;

public class BoardView extends JPanel {
    private final BoardController itsBoard;
    private final Images itsImages;

    public BoardView(BoardController board)
    {
        itsBoard = board;
        itsImages = new Images();
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
                if(itsBoard.getItsBoard()[row][col] != 0)
                {
                    if(itsBoard.getItsBoard()[row][col] < 10)
                    {
                        if(itsBoard.getItsBoard()[row][col] == 1)
                        {
                            drawImage(itsImages.getPionBImage(), x, y, g);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 2)
                        {
                            drawImage(itsImages.getTourBImage(), x, y, g);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 3)
                        {
                            drawImage(itsImages.getChevalBImage(), x, y, g);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 4)
                        {
                            drawImage(itsImages.getFouBImage(), x, y, g);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 5)
                        {
                            drawImage(itsImages.getRoiBImage(), x, y, g);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 6)
                        {
                            drawImage(itsImages.getReineBImage(), x, y, g);
                        }
                    }
                    else{
                        if(itsBoard.getItsBoard()[row][col] == 11)
                        {
                            drawImage(itsImages.getPionNImage(), x, y, g);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 12)
                        {
                            drawImage(itsImages.getTourNImage(), x, y, g);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 13)
                        {
                            drawImage(itsImages.getChevalNImage(), x, y, g);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 14)
                        {
                            drawImage(itsImages.getFouNImage(), x, y, g);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 15)
                        {
                            drawImage(itsImages.getRoiNImage(), x, y, g);
                        }
                        else if(itsBoard.getItsBoard()[row][col] == 16)
                        {
                            drawImage(itsImages.getReineNImage(), x, y, g);
                        }
                    }
                }
            }
        }
    }
}
