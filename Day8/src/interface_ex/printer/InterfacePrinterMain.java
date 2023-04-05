package interface_ex.printer;

public class InterfacePrinterMain {
  public static void main(String[] args) {
    // 흑백 프린터
    InterfaceSamsungPrinter seohee = new InterfaceSamsungPrinter();
    InterfaceLGPrinter jihee = new InterfaceLGPrinter();

    // 컬러 프린터
    new InterfaceSamsungPrinter();

    Sam3DPrinter hee = new Sam3DPrinter();
    // hee 참조할 수 있는 타입
    //   Sam3DPrinter, InterfacePrint3D, InterfacePrintColor, InterfaceThreeDimensional
    //

    InterfacePrint3D p1 = hee;

    boolean res = p1 instanceof InterfacePrint3D;
    System.out.println(res);

    res = p1 instanceof InterfacePrint;
    System.out.println(res);
  }
}

//abstract public class InterfacePrinter {
//  abstract public void print();
//}

//class InterfaceLGPrinter extends InterfacePrinter {
//  @Override
//  public void print() {System.out.println("LG 프린터");}
//}
//
//class SamsungPrinter extends InterfacePrinter {
//  @Override
//  public void print() {System.out.println("삼성프린터");}
//}
