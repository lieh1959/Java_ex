// app13_10, ����IOException�ҥ~
import java.io.*;             // ���Jjava.io���O�w�̪��Ҧ����O
public class app13_10
{
   public static void main(String args[])
   {
      BufferedReader buf;
      String str;

      buf=new BufferedReader(new InputStreamReader(System.in));
      try
      {
         System.out.print("Input a string: ");
         str=buf.readLine();
         System.out.println("string= "+str);       // �L�X�r��
      }
      catch(IOException e){}
   }
}

/* app13_10 OUTPUT-------------
Input a string: Hello Java!
string= Hello Java!
----------------------------*/