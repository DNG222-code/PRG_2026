package activitats.biblioteca;

import javax.swing.*;

public class LookAndFeel {

    // Constructor.
    public LookAndFeel()  {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException |
                 ClassNotFoundException |
                 InstantiationException |
                 IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }
    }
}
