package interface_ex.printer;

public class InterfaceSamsungPrinter implements InterfacePrint {
  @Override
  public void print(String p) {
    System.out.println("삼성 흑백 프린터");
  }
}

class InterfaceSamsungColorPrint implements InterfacePrintColor {
  @Override
  public void print(String p) {}

  @Override
  public void colorPrint(String p) {}
}

// 3D 프린터
class Sam3DPrinter implements InterfacePrint3D {
  @Override
  public void print(String p) {}

  @Override
  public void colorPrint(String p) {}

  @Override
  public void threeD() {}
}
