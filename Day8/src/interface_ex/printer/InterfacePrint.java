package interface_ex.printer;

// 인터페이스 상속
//   인터페이스를 계속 만들다보면 중복적인 메소드가 생김
//   다중 상속 가능

public interface InterfacePrint {
  // 프린터
  void print(String p); // 흑백
}

interface InterfacePrintColor extends InterfacePrint {
  void colorPrint(String p); // 컬러
}

interface InterfaceThreeDimensional {
  void threeD();
}

interface InterfacePrint3D extends InterfacePrintColor, InterfaceThreeDimensional {}
