package Controller;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseController implements MouseListener, MouseMotionListener {
    private JFrame frame; // Reference to the application's JFrame

    public MouseController(JFrame frame) {
        this.frame = frame;
        frame.addMouseListener(this);
        frame.addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Handle mouse click event

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Handle mouse press event
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Handle mouse release event
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
    public void mouseDragged(MouseEvent e) {
        // Handle mouse drag event
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // Handle mouse move event
    }
}

