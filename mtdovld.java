class Area{
    public void area(int a)
    {
        System.out.println("area of a square:"+Math.pow(a, 2));
    }
     public void area(double a, double b)
    {
        System.out.println("area of rectangle:"+a*b);
    }
     public void area(int l,int b, int h){
        int a1=2*(l*b + b*h + h*l);
        System.out.println("area of cuboid is:"+a1);
    }
}
public class mtdovld {
    public static void main(String [] args){
        Area m1=new Area();
        m1.area(2);
        m1.area(2.3,7.2);
        m1.area(2,3,4);

    }
    
    
}
