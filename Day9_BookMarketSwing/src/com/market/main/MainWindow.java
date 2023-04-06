package com.market.main;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
  JPanel mMenuPanel = null;

  public MainWindow(String titleName, int x, int y, int width, int height) {
    initContainer(titleName, x, y, width, height);

    this.setVisible(true);
    this.setResizable(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void initContainer(String titleName, int x, int y, int width, int height) {
    this.setTitle(titleName);
    this.setBounds(x, y, width, height);
    this.setLayout(null);
    this.setIconImage(new ImageIcon("./images/shop.png").getImage());
    this.setResizable(false);

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    // 창 위치 setLocation(화면의너비, 화면의높이);
    this.setLocation((screenSize.width - 750) / 4, (screenSize.height - 750) / 4);

    // 메뉴 버튼 표시를 위한 보조 프레임 설정 및 출력
    mMenuPanel = new JPanel();

    // 한 번에 x, y, width, height
    // setSize() -> 컴포넌트들의 위치 변경
    // setLocation(width, height) -> 창의 너비, 높이 변경
    mMenuPanel.setBounds(x, y, width, height);

    // 첫번째 아이콘  1 고객 정보 확인하기 버튼
    // 두번째 아이콘  2 장바구니 상품 목록 보기 버튼
    // 세번째 아이콘  3 장바구니 비우기 버튼
    // 네번째        4 장바구니 항목 추가하기
    //              5 장바구니 항목 수량 줄이기
    //              6 장바구니 항목 삭제
    //              7 주문하기
    //              8 종료
    //              9 관리자

    JLabel checkConsumerInfoLabel = new JLabel("고객 정보 확인하기", new ImageIcon("./images/1.png"), JLabel.LEFT);
    JButton checkConsumerInfoBtn = new JButton();
    checkConsumerInfoBtn.add(checkConsumerInfoLabel);

    JLabel viewWishlistLabel = new JLabel("장바구니 상품 목록 보기", new ImageIcon("./images/2.png"), JLabel.LEFT);
    JButton viewWishlistBtn = new JButton();
    viewWishlistBtn.add(viewWishlistLabel);

    JLabel clearWishlistLabel = new JLabel("장바구니 비우기", new ImageIcon("./images/3.png"), JLabel.LEFT);
    JButton clearWishlistBtn = new JButton();
    clearWishlistBtn.add(clearWishlistLabel);

    JLabel addItemToWishlistLabel = new JLabel("장바구니 항목 추가하기", new ImageIcon("./images/4.png"), JLabel.LEFT);
    JButton addItemToWishlistBtn = new JButton();
    addItemToWishlistBtn.add(addItemToWishlistLabel);

    JLabel reduceCountInWishlistLabel = new JLabel("장바구니 항목 수량 줄이기", new ImageIcon("./images/5.png"), JLabel.LEFT);
    JButton reduceCountInWishlistBtn = new JButton();
    reduceCountInWishlistBtn.add(reduceCountInWishlistLabel);

    JLabel removeItemInWishlistLabel = new JLabel("장바구니 항목 삭제", new ImageIcon("./images/6.png"), JLabel.LEFT);
    JButton removeItemInWishlistBtn = new JButton();
    removeItemInWishlistBtn.add(removeItemInWishlistLabel);

    JLabel orderLabel = new JLabel("주문하기", new ImageIcon("./images/7.png"), JLabel.LEFT);
    JButton orderBtn = new JButton();
    orderBtn.add(orderLabel);

    JLabel closeLabel = new JLabel("종료", new ImageIcon("./images/8.png"), JLabel.LEFT);
    JButton closeBtn = new JButton();
    closeBtn.add(closeLabel);

    JLabel managerLabel = new JLabel("관리자", new ImageIcon("./images/9.png"), JLabel.LEFT);
    JButton managerBtn = new JButton();
    managerBtn.add(managerLabel);

    JPanel menuPanel = new JPanel();
    menuPanel.add(checkConsumerInfoBtn);
    menuPanel.add(viewWishlistBtn);
    menuPanel.add(clearWishlistBtn);
    menuPanel.add(addItemToWishlistBtn);
    menuPanel.add(reduceCountInWishlistBtn);
    menuPanel.add(removeItemInWishlistBtn);
    menuPanel.add(orderBtn);
    menuPanel.add(closeBtn);
    menuPanel.add(managerBtn);

    menuPanel.setBounds(30, 30, 700, 200);

    this.add(menuPanel);
  }

  public static void main(String[] args) {
    new MainWindow("도서 쇼핑몰", 500, 200, 780, 300);
  }
}
