import java.util.Scanner;

public class Text
{
  public static void main(String[] args) throws Exception
  {
  	Scanner sc = new Scanner(System.in);
       
      System.out.print("Masukan Kata : ");
      String s = sc.nextLine();
      
      while(true){
              System.out.print(" \r " + s);
              Thread.sleep(120);
              s = s.substring(2) + s.substring(0,2);
       }
    }
}
