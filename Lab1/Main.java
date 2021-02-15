

class Main {
    public static void main(String[] args) {
         StudentInfo stud1 = new StudentInfo();
        stud1.setnameStudent("Daniel Bogatu");
        stud1.getnameStudent();
        stud1.relaxStudent();
        stud1.invatMaterie();

        StudentMate stud2 = new StudentMate();
        stud2.setnameStudent("Gabriel Constantinescu");
        stud2.getnameStudent();
        stud2.relaxStudent();
        stud2.invatMaterie();



        ProfesorInfo prof1 = new ProfesorInfo("Olariu");
        prof1.getnameProfesor();
        prof1.setnameProfesor("Gabriel");
        prof1.getnameProfesor();

        ProfesorMate prof2 = new ProfesorMate("Zalinescu");
        prof2.getnameProfesor();
<<<<<<< Updated upstream
        prof2.setnameProfesor("Daniel");
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
=======
>>>>>>> Stashed changes
        
        Hobiuri ZalinescuHobi=new Hobiuri();
        ZalinescuHobi.Set("Handabll");
        ZalinescuHobi.Get();

        Hobiuri olariuHobiuri=new Hobiuri();
        olariuHobiuri.Set("Voley", 3);
        olariuHobiuri.Get();

        MaterieAnterioara Zalinescu=new MaterieAnterioara();
        MaterieAnterioara Olariu=new MaterieCurenta();

        Zalinescu.Set("Mate");
        Zalinescu.Get();
  
        Olariu.Set("Grafuri");
        Olariu.Get();

    }
}
