import java.io.PrintWriter;
public class HelloWorld {
  public static void main (String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println ("Hello, GitHub! (Change from the future(VScoding over here))");
    pen.println ("Whole new line");
    //Conflicted removed. Let's keep both lines.
    pen.flush();
    pen.close();
  } // main(String[])
} 

