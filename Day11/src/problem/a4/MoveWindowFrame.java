package problem.a4;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class MoveWindowFrame extends JFrame implements Runnable {
  int x;
  int y;
  Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

  public MoveWindowFrame() {
    this.setTitle(this.getClass().getSimpleName());
    this.setBounds(this.x, this.y, 300, 200);

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  @Override
  public void run() {
    //    this.moveRight();
    //    this.moveBottom();
    //    this.moveLeft();
    //    this.moveTop();
    //
    //    System.exit(0);

    this.moveBottomRight();
    this.moveTopRight();
    this.moveTopLeft();
    this.moveBottomLeft();
    this.moveTopLeft();
    this.moveTopRight();
    this.moveBottomRight();
    this.moveTopRight();
    this.moveTopLeft();
    this.moveBottomLeft();

    System.exit(0);
  }

  private void moveCommon() {
    try {
      Thread.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    this.setLocation(x, y);
  }

  public void moveRight() {
    while (true) {
      this.x++;
      this.moveCommon();

      if (this.checkRight())
        break;
    }
  }

  public boolean checkRight() {
    return this.x + this.getWidth() >= this.dimension.getWidth();
  }

  public void moveBottom() {
    while (true) {
      this.y++;
      this.moveCommon();

      if (this.checkBottom())
        break;
    }
  }

  public boolean checkBottom() {
    return this.y + this.getHeight() >= this.dimension.getHeight();
  }

  public void moveLeft() {
    while (true) {
      this.x--;
      this.moveCommon();

      if (this.checkLeft())
        break;
    }
  }

  public boolean checkLeft() {
    return this.x <= 0;
  }

  public void moveTop() {
    while (true) {
      this.y--;
      this.moveCommon();

      if (this.checkTop())
        break;
    }
  }

  public boolean checkTop() {
    return this.y <= 0;
  }

  public void moveBottomRight() {
    while (true) {
      this.x++;
      this.y++;

      this.moveCommon();

      if (this.checkBottom() || this.checkRight()) {
        break;
      }
    }
  }

  public void moveTopRight() {
    while (true) {
      this.x++;
      this.y--;

      this.moveCommon();

      if (this.checkTop() || this.checkRight()) {
        break;
      }
    }
  }

  public void moveTopLeft() {
    while (true) {
      this.x--;
      this.y--;

      this.moveCommon();

      if (this.checkTop() || this.checkLeft()) {
        break;
      }
    }
  }

  public void moveBottomLeft() {
    while (true) {
      this.x--;
      this.y++;

      this.moveCommon();

      if (this.checkBottom() || this.checkLeft()) {
        break;
      }
    }
  }

  public static void main(String[] args) {
    MoveWindowFrame fr = new MoveWindowFrame();
    Thread frThread = new Thread(fr);
    frThread.start();
  }
}
