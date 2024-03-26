package edu.atu.tutoringlog;

import javax.swing.SwingUtilities;
import edu.atu.tutoringlog.view.MainFrame;

/**
 *
 * @author hiromihonda
 */
public class TutoringLog {
    public static void main(String[] args) {
        // method reference that refers to the constructor of MainFrame
        SwingUtilities.invokeLater(MainFrame::new);
    }
}
