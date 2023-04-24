package new_market;

import javax.swing.*;
import java.awt.*;

public class WelcomeGUI extends JFrame {
  JPanel mainPanel = new JPanel();

  public WelcomeGUI() throws HeadlessException {
    this.setTitle("Book Market");
    this.setSize(500, 400);

    this.initMenuBar();

    this.add(mainPanel);

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void initMenuBar() {
    JMenuBar menuBar = new JMenuBar();

    JMenu fileMenu = new JMenu("File");
    JMenuItem fileMenuClose = new JMenuItem("Close");

    fileMenu.add(fileMenuClose);
    menuBar.add(fileMenu);
    this.setJMenuBar(menuBar);
  }

  public void init() {
    
  }

  public void mainScreen() {

  }

  public static void main(String[] args) {

  }
}
