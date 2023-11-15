package Controller;
import Model.Piece;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Objects;

public class MouseController implements MouseListener, MouseMotionListener {
    private JFrame frame; // Reference to the application's JFrame
    private Player player1;
    private Player player2;
    private String selectedPiece;

    private final int cellWidth = 590 / 8;
    private final int cellHeight = 565 / 8;

    public MouseController(JFrame frame, Player player1, Player player2) {
        this.frame = frame;
        frame.addMouseListener(this);
        frame.addMouseMotionListener(this);
        this.player1 = player1;
        this.player2 = player2;
        selectedPiece = "";
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Handle mouse press event
        int x = e.getX() / cellWidth;
        int y = e.getY() / cellHeight;
        x = x * cellWidth;
        y = y * cellHeight;
        selectedPiece = player1.getPiece(x, y);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Handle mouse drag event
        if(!Objects.equals(selectedPiece, ""))
        {
            player1.changePiece(selectedPiece, e.getX() - 45, e.getY() - 60);
            frame.repaint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Handle mouse release event
        int x = e.getX() / cellWidth;
        int y = e.getY() / cellHeight;
        x = x * cellWidth;
        y = y * cellHeight;
        player1.changePiece(selectedPiece, x, y);
        selectedPiece = "";
        frame.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Handle mouse click event

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Handle mouse enter event
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Handle mouse exit event
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // Handle mouse move event
    }
}

