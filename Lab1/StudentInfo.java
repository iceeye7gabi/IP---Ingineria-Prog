class StudentInfo extends Student{
    String nameStudent;             
    public void invatMaterie(){
        System.out.println("Invat programare! :)");
    }
    public void getnameStudent(){
        System.out.println("Studentul care invata Informatica este:"+nameStudent);
    }
    public void setnameStudent(String name){
        nameStudent=name;
    }
}
