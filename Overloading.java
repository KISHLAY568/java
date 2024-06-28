class Calc
{
    public int add(int x,int y)
    {
        int result=x+y;
        return result;
    }
    public int add(int x,int y,int z)
    {
        int result=x+y+z;
        return result;
    }
    public double add(double x,double y)
    {
        double result=x+y;
        return result;
    }
}
class Overloading
{
    public static void main(String[] args) {
       Calc obj = new Calc();
        int x = obj.add(4,5);
        System.out.println(x);
        int y;
        y = obj.add(4,5,6);
        System.out.println(y);
        double z=obj.add(4,5);
        System.out.println(z);
        float p = obj.add(3,2);
        System.out.println(p);
    }
}