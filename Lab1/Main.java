import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        StudentInfo Daniel = new StudentInfo();
        Daniel.relaxStudent();
        Daniel.invatMaterie();
        
        StudentMate Mihai = new StudentMate();
        Mihai.invatMaterie();

        ProfesorInfo prof1 = new ProfesorInfo("Olariu");
        prof1.getnameProfesor();

        ProfesorMate prof2 = new ProfesorMate("Zalinescu");
        prof2.getnameProfesor();

        Math calcule=new Math();
        int a,b;
        Scanner myInput = new Scanner( System.in );
        
 
        System.out.println("Introduceti primul numar intreg: ");
        a=myInput.nextInt();
        System.out.println("Introduceti al doilea numar intreg: ");
        b=myInput.nextInt();
       
        System.out.println("Rezultatul inmultirii este: ");
        System.out.println(calcule.inmultireMath(a, b));
 
        float x,z;
        System.out.println("Introduceti primul numar real: ");
        x=myInput.nextFloat();
        System.out.println("Introduceti al doilea numar real: ");
        z=myInput.nextFloat();
        
        System.out.println("Rezultatul inmultirii este: ");
        System.out.println(calcule.inmultireMath(x, z));
   
       int n,m;
       System.out.println("Introduceti primul numar intreg: ");
       n=myInput.nextInt();
       System.out.println("Introduceti al doilea numar intreg: ");
       m=myInput.nextInt();
       myInput.close();
       
       MathSecond div=new MathThird();
       MathSecond DIV=new MathSecond();

       System.out.println("Rezultatul impartirii este: ");
       System.out.println(div.impartireMathSecond(n, m));

       System.out.println("Rezultatul impartirii este: ");
       System.out.println(DIV.impartireMathSecond(n, m));
    }
}