package interface_ex.printer;

public class InterfaceLGPrinter implements InterfacePrint {
  @Override
  public void print(String p) {
    System.out.println("LG 흑백 프린터");
  }
}
