// app16_2, ²�檺�x���d��
public class app16_2
{
   public static void main(String args[])
   {
      CMember<Integer> obj1=new CMember<Integer>();
      CMember<String>  obj2=new CMember<String>();
      obj1.setId(6);
      obj2.setId("Lily");
      obj1.show();
      obj2.show();
   }
}
class CMember<T>        // �w�q�x�����OCMember�AT���q�Ϊ����A
{
   private T id;        // �ŧi id�����A��T
   public void setId(T value)
   {
   	  id=value;       // �Nid�����]���ǤJ���޼�
   }
   public void show()
   {
   	  System.out.println("id="+id);
   }
}
