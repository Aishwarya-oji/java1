class Area{

    double area;
    Area(double a, int b,int h)
    {
        area=a*b*h;
        System.out.println("area of triangle is:"+area);
    }
 Area(int l , int w) {
    System.out.println("area of rectangle:"+l*w);
 }  
    
}
public class constructor {
    public static void main(String [] args){
        Area a=new Area(0.5,2,6);
        Area a1=new Area(7,8);
    }
}
