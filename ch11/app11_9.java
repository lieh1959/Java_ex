// app11_9, instanceof�B��l���ϥ�
public class app11_9
{
   public static void main(String args[])
   {
      int a[]=new int[5];

      if(a instanceof Object)          // �P�O��ư}�C�O�_�~��Object
         System.out.println("��ư}�Ca�~��Object");
      else
         System.out.println("��ư}�Ca�S���~��Object");

      if(a instanceof Object[])          // �P�O��ư}�C�O�_�~��Object[]
         System.out.println("��ư}�Ca�~��Object[]");
      else
         System.out.println("��ư}�Ca�S���~��Object[]");
  }
}

/* app11_9 OUTPUT�sĶ���T��----------------------------------------------
error: inconvertible types
      if(a instanceof Object[])          // �P�O��ư}�C�O�_�~��Object[]
         ^
  required: Object[]
  found:    int[]
-----------------------------------------------------------------------*/
