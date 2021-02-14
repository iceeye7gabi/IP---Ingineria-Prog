import java.util.Scanner;

abstract class Student{            //clasa abstracta student
    public abstract void Invata();
    public void eatSleepRepeat(){
        System.out.println("Eat,sleep and Repeat! :)\n");
    }
}

interface Profesor{                 //interfata student
    public void Preda();

}

class pInfo implements Profesor{
    private String name;
    public void Preda(){
        System.out.println("Profesorul preda Informatica!\n");
    }
    public void GetName(){
        System.out.println("Profesorul care preda Informatica este:\n");
        System.out.println(name);
    }
    public pInfo(String nume){
        name=nume;
    }
}


class StudentInfo extends Student{             
    public void Invata(){
        System.out.println("Invat programare! :)\n");
    }
}

class StudentMate extends Student{
    public void Invata(){
        System.out.println("Invat mate! :)\n");
    }
}


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



class Main {
    public static void main(String[] args) {
        StudentInfo Daniel = new StudentInfo();
        Daniel.eatSleepRepeat();
        Daniel.Invata();
        
        StudentMate Mihai = new StudentMate();
        Mihai.eatSleepRepeat();
        Mihai.Invata();

        pInfo prof1 = new pInfo("Olariu");
        prof1.GetName();

        /////////////////////////////////////////////////////////////////////////////////

        

        Math calcule=new Math();
        int a,b;
        Scanner myInput = new Scanner( System.in );
        
 
        System.out.println("Introduceti primul numar intreg: ");
        a=myInput.nextInt();
        System.out.println("Introduceti al doilea numar intreg: ");
        b=myInput.nextInt();
       
        System.out.println("Rezultatul inmultirii este: ");
        System.out.println(calcule.Inmultire(a, b));
 
        float x,z;
        System.out.println("Introduceti primul numar real: ");
        x=myInput.nextFloat();
        System.out.println("Introduceti al doilea numar real: ");
        z=myInput.nextFloat();
        
        System.out.println("Rezultatul inmultirii este: ");
        System.out.println(calcule.Inmultire(x, z));
   
       int n,m;
       System.out.println("Introduceti primul numar intreg: ");
       n=myInput.nextInt();
       System.out.println("Introduceti al doilea numar intreg: ");
       m=myInput.nextInt();
       myInput.close();
       
       Math3 div=new Math3();
       System.out.println("Rezultatul inmultirii este: ");
       System.out.println(div.Div(n, m));


    }
}
