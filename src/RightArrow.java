import java.util.Scanner; 

public class RightArrow {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int baseChar = scanner.nextInt();
       int headChar = scanner.nextInt();
       String noBase = "     " + headChar;
       String noBasePlus1Head = noBase + headChar;
       String withBase = String.valueOf(baseChar) + baseChar + baseChar + baseChar +
               baseChar + headChar + headChar + headChar;

       System.out.println(noBase);
       System.out.println(noBasePlus1Head);
       System.out.println(withBase);
       System.out.println(withBase + headChar);
       System.out.println(withBase);
       System.out.println(noBasePlus1Head);
       System.out.println(noBase);
   }
}
