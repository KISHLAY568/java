class Multiply
{
    public void mul(int x,int y)
    {
        System.out.println(x*y);
    }
}
public class MainCall {
    public static void main(String[] args) {
      Multiply obj  = new Multiply();
      obj.mul(8,9);  
    }
}
