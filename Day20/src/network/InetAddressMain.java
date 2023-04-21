package network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressMain {
  public static void main(String[] args) {
    // 네트워크의 기본 개념 (통신 방식)
    //   통신을 1:1, 1:n, 1:n 특정 그룹

    // 유니캐스트
    //   - 두 장치 간 1:1로 통신한다
    //   - 같은 네트워크 대역에서 특정 대상끼리 통신
    //   - 예) 잔디 DM, 카카오톡 1:1 대화

    // 브로드캐스트
    //   - 네트워크에 있는 모든 대상과 통신하는 것
    //   - 예) 유튜브 같은 스트리밍 서비스 (유튜버)

    // 멀티캐스트
    //   - 여러 명이 같은 네트워크에 있지만 특정한 몇 명과 통신하는 것
    //   - 예) 카카오톡 그룹 채팅 1:N

    // 네트워크 분류 (크기)
    //   LAN (Local Area Network)
    //     - 가까운 지역을 하나로 묶는 네트워크
    //     - 예) 같은 PC방 내 통신, 같은 강의장
    //     - 다른 강의장이나 다른 PC방으로 관리하는 장치를 스위치라고 한다
    //   WAN (Wide Area Network)
    //     - 멀리있는 지역을 한데 묶은 네트워크
    //     - LAN끼리 묶인 것을 하나로 묶는 것

    // 네트워크에 따른 연결 형태
    //   노드: 인터넷에 연결된 시스템의 가장 기본적인 용어
    //     데이터를 구별하는 것
    //   - Star형: 중앙 장비한테 모든 노드가 연결된 형태
    //     단점
    //       - 중앙 장치에 오류가 발생하면 모든 네트워크들은 통신할 수 없다
    //         (예: 공유기, 강의장 스위치)
    //   - Mesh형: 여러 노드들이 서로 그물처럼 연결된 형태
    //     Star형의 단점을 없애준다

    // IP 주소 (호스트) 저장 및 관리하는 클래스
    //   getByName("도메인");
    //     - 호스트 이름과 해당 IP 주소 저장 (객체로 리턴)
    //     - 인터넷 통신하려면 IP가 꼭 필요하다
    //     - 도메인을 IP 주소로 변경하는 것이 DNS 서버. 대표적으로 KT
    //   getByAddress(byte[])
    //     - 입력한 주소를 저장하고 객체로 리턴 (128 이상일 경우 byte로 형변환)
    //   getByAddress(String, byte[])
    //     - 입력한 문자열(호스트)과 IP 주소를 저장하고 객체로 리턴

    // 통신을 하기 위해서는 원격지(나)의 주소가 필요하다
    // 상대방의 IP하고 호스트 이름이 같이 있어야만 인터넷 통신을 할 수 있다
    try {
      InetAddress ia1 = InetAddress.getByName("www.google.com");
      InetAddress ia2 =
          InetAddress.getByAddress(new byte[] {(byte) 172, (byte) 16, (byte) 161, (byte) 132});
      InetAddress ia3 = InetAddress.getByAddress("www.google.com",
          new byte[] {(byte) 172, (byte) 16, (byte) 161, (byte) 132});

      System.out.println(ia1);
      System.out.println(ia2);
      System.out.println(ia3);

      // 로컬 / 루프백 IP
      //   - 자기자신의 나타내는 가상 주소
      //   - localhost / 127.0.0.1
      InetAddress ia4 = InetAddress.getLocalHost();
      InetAddress ia5 = InetAddress.getLoopbackAddress();

      // InetAddress: IP만 관리함
      // 접속하고 싶은 사이트 IP 관리하기
      InetAddress ia = InetAddress.getByName("example.com");
      System.out.println(ia);

      // 하나의 호스트가 여러 개의 IP를 가지고 있을 경우
      InetAddress[] ia6 = InetAddress.getAllByName("www.naver.com");
      System.out.println(Arrays.toString(ia6));
      System.out.println();

      // 호스트와 IP 알아내기
      byte[] address = ia1.getAddress();
      System.out.println(Arrays.toString(address));

      System.out.println(ia1.getHostName());
      System.out.println(ia1.getLoopbackAddress());

      // 멀티캐스트 영역 확인, 네트워크 접속 확인
      System.out.println(ia1.isMulticastAddress());
      System.out.println(ia1.isReachable(1000));

    } catch (UnknownHostException e) {
      System.out.println("없는 주소입니다");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
