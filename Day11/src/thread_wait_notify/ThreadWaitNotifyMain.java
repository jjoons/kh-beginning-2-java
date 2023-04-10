package thread_wait_notify;

public class ThreadWaitNotifyMain {
  public static void main(String[] args) {
    final Dish d = new Dish();
    new Thread(new Customer(d)).start();
    new Thread(new Cook(d)).start();

    //    Customer s = new Customer(d);
    //    Thread st = new Thread(s);
    //    st.start();
  }
}
