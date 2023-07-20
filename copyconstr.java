class construct{
    String s;
    construct(String p){
        s=p;
        System.out.println(s);
    }
    construct(construct c)
    {
        s=c.s;
        System.out.println("hello" +s);
    }
}
class copyconstr{
    public static void main(String []args){
        construct c1=new construct("hey wassup");
        construct c2=new construct(c1);

    }
      
}
