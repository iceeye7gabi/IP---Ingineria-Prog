class ProfesorMate implements Profesor{
    private String nameProfesor;
    public void teachProfesor(){
        System.out.println("Profesorul preda Matematica!");
    }
    public void getnameProfesor(){
        System.out.println("Profesorul care preda Matematica este:");
        System.out.println(nameProfesor);
    }
    public void setnameProfesor(String name){
        nameProfesor=name;
    }
    public ProfesorMate(String nume){
        nameProfesor=nume;
    }
}
