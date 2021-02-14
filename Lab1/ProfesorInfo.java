class ProfesorInfo implements Profesor{
    private String nameProfesor;
    public void teachProfesor(){
        System.out.println("Profesorul preda Informatica!");
    }
    public void getnameProfesor(){
        System.out.println("Profesorul care preda Informatica este:");
        System.out.println(nameProfesor);
    }
    public ProfesorInfo(String nume){
        nameProfesor=nume;
    }
}