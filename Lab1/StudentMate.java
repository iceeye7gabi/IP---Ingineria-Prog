class StudentMate extends Student{
    String nameStudent; 
    public void invatMaterie(){
        System.out.println("Invat mate! :)");
    }
    public void getnameStudent(){
        System.out.println("Studentul care invata Matematica este:"+nameStudent);
    }
    public void setnameStudent(String name){
        nameStudent=name;
    }
}
