package Vue;

import Controller.BoardController;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;



public class BoardView extends JPanel {
    private final BoardController itsBoard;
    private final Images itsImages;
    private final int cellWidth = getWidth() / 8;
    private final int cellHeight = getHeight() / 8;


    public BoardView(BoardController board)
    {
        itsBoard = board;
        itsImages = new Images();
    }

    public void drawImage(BufferedImage image, int x, int y, Graphics g)
    {
        g.drawImage(image, x, y, cellWidth, cellHeight, null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

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
