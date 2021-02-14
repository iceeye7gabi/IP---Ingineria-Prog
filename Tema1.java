import java.util.Scanner;

//Static Polimorfism
class Math{
    public int Inmultire(int a,int b)
    {
          return a*b;
    }

    public float Inmultire(float a,float b)
    {
        return a*b;
    }
}
  //Dynamic Polimorfism
class Math2{
    float Div(int a,int b){
        return a/b;
    }
}

class Math3 extends Math2{

    float Div(int a,int b)
    {
        return (float)a/b;
    }
 
}

class Main{
     public static void main(String[] args) {
         
       Math calcule=new Math();
       int a,b;
       Scanner myInput = new Scanner( System.in );
       

       a=myInput.nextInt();
       b=myInput.nextInt();
      

       System.out.println(calcule.Inmultire(a, b));

     float x,z;
       x=myInput.nextFloat();
       z=myInput.nextFloat();
       
       System.out.println(calcule.Inmultire(x, z));
  
      int n,m;
      n=myInput.nextInt();
      m=myInput.nextInt();
      myInput.close();

      Math3 div=new Math3();

      System.out.println(div.Div(n, m));


    }
}