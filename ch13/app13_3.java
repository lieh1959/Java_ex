// app13_3, �ҥ~�T�����^��
public class app13_3
{
   public static void main(String args[])
   {
      try
      {
         int arr[]=new int[5];
         arr[10]=7;
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         System.out.println("index out of bound!!");
         System.out.println("Exception="+e);    // ��ܨҥ~�T��
      }
      System.out.println("end of main()!!");
   }
}

/* app13_3 OUTPUT---------------------------------------
index out of bound!!
Exception=java.lang.ArrayIndexOutOfBoundsException: 10
end of main() method !!
------------------------------------------------------*/