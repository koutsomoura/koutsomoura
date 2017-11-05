import java.io.*;
public class Buffer{
public static void main(String args[]) throws IOException   {
char c;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Pliktrologise ena haractira  ");
c= (char)br.read();
System.out.println();
System.out.println("O xaraktiras einai o :"+c);
}
}