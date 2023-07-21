class a{
    public void disp(){
        System.out.println("from base");
    }

}
public class inheritance extends a{
    public void disp1()
    {
        System.out.println("derival class" );
    }
    public static void main(String [] args)
    {
        inheritance ob=new inheritance();
        ob.disp();
        ob.disp1();
    }
    
}
