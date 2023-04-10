package gui;

public class GUIMain {
  public static void main(String[] args) {
    MyFrame my = new MyFrame();
    Thread myT = new Thread(my);

    myT.start();
  }
}
