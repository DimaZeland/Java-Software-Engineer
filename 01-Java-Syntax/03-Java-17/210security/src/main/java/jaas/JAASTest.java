package jaas;

import java.awt.*;
import javax.swing.*;

/**
 * This program authenticates a user via a custom login
 *
 * @author Cay Horstmann
 * @version 1.04 2021-05-30
 */
public class JAASTest {
    public static void main(final String[] args) {
        EventQueue.invokeLater(() ->
        {
            var frame = new JAASFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("JAASTest");
            frame.setVisible(true);
        });
    }
}
