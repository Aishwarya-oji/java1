class a{
    public void disp(){
        System.out.println("from base");
    }

}
class b extends a{
    public void disp1()
    {
        System.out.println("derival class" );
    }
}
    

public class multiple extends b {
    public void disp2()
    {
        System.out.println("grandson");
    }
    public static void main(String [] args)
    {
        multiple ob=new multiple();
        ob.disp2();
        ob.disp1();
        ob.disp();
    }
    
}
