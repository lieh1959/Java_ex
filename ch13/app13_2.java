// app13_2, �ҥ~���B�z
 public class app13_2
 {
   public static void main(String args[])
   {
      try         // �ˬd�o�ӵ{���϶����{���X
      {
         int arr[]=new int[5];
         arr[10]=7;
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         System.out.println("index out of bound!!");
      }
      finally        // �o�Ӱ϶����{���X�@�w�|����
      {
         System.out.println("this line is always executed!!");
      }
      System.out.println("end of main() method!!");
   }
}

/* app13_2 OUTPUT----------------
index out of bound!!
this line is always executed!!
end of main() method!!
-------------------------------*/