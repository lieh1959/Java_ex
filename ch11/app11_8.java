// app11_8, instanceof�B��l���ϥ�
class CCircle { }
class CCoin extends CCircle { }     // CCoin�~��CCircle���O
public class app11_8 extends CCoin     // app11_8�~��CCoin���O
{
   public static void main(String args[])
   {
      boolean status;
      CCoin coin=new CCoin();
      CCircle cir=new CCircle();
      app11_8 myobj=new app11_8();
      CCoin carr[]=new CCoin[5];

      // �P�Ocir�O�_��CCoin���O�Ψ�l���O����
      status=(cir instanceof CCoin);
      System.out.println("cir instanceof CCoin? " + status);

      // �P�Omyobj�O�_��CCircle���O�Ψ�l���O����
      status=(myobj instanceof CCircle);
      System.out.println("myobj instanceof CCircle? " + status);

      // �P�Ocoin�O�_��app11_8���O�Ψ�l���O����
      status=(coin instanceof app11_8);
      System.out.println("coin instanceof app11_8? "+ status);

      // �P�Ocoin�O�_��CCircle���O�Ψ�l���O����
      status=(coin instanceof CCircle);
      System.out.println("coin instanceof CCircle? " + status);

      // �P�Ocoin�O�_��CCoin���O�Ψ�l���O����
      status=(coin instanceof CCoin);
      System.out.println("coin instanceof CCoin? " + status);

      // �P�O�}�C�O�_��Object���O�Ψ�l���O����
      status=(carr instanceof Object);
      System.out.println("carr instanceof Object? " + status);

      // �P�Ocir�O�_��String���O�Ψ�l���O����
      // status=(cir instanceof String);
      // System.out.println("cir instanceof String? "+ status);
  }
}

/* app11_8 OUTPUT---------------
cir instanceof CCoin? false
myobj instanceof CCircle? true
coin instanceof app11_8? false
coin instanceof CCircle? true
coin instanceof CCoin? true
carr instanceof Object? true
-----------------------------*/
