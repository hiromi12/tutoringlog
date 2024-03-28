package edu.atu.tutoringlog;

import javax.swing.SwingUtilities;
import edu.atu.tutoringlog.controller.MainController;

/**
 *
 * @author hiromihonda
 */
public class TutoringLog {
    public static void main(String[] args) {
        // method reference that refers to the constructor of MainController : Aggregation
        SwingUtilities.invokeLater(MainController::new);
    }
}
