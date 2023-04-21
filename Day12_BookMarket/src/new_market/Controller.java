package new_market;

import java.io.*;

public class Controller {
  private File file = new File("io/book.txt");
  private FileInputStream fis = null;
  private BufferedInputStream bis = null;
  private FileOutputStream fos = null;
  private BufferedOutputStream bos = null;

  public Controller() throws IOException {
    this.file.createNewFile();

    if (!this.file.canRead()) {
      throw new IOException("파일을 읽을 수 없습니다");
    }

    this.fis = new FileInputStream(this.file);
    this.bis = new BufferedInputStream(this.fis);

    this.fos = new FileOutputStream(this.file);
    this.bos = new BufferedOutputStream(this.fos);
  }

  public void save() {
    
  }
}
