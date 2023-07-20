class operation{
   
    operation(float a,float b){
        float mul=a*b;
        System.out.println("multiplication:"+mul);
    }
    operation(double a,double b){
        double div=a/b;
        System.out.println("division:"+div);
    }
    operation(int a,int b){
        int add=a+b;
        System.out.println("addition:"+add);
    }
}
public class arithmop {
    operation o=new operation(0.5, 0.5);
    operation o1=new operation(10.5,2 );
    operation o2=new operation(2,4);
}
