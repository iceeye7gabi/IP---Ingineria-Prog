// Your First Program

abstract class Student{            //clasa abstracta student
    public abstract void Invata();
    public void eatSleepRepeat(){
        System.out.println("Eat,sleep and Repeat! :)\n");
    }
}

interface Profesor{
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

    }
}