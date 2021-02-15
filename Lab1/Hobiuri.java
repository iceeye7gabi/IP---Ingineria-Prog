//Static Polimorfism
class Hobiuri{
    private String hobi;
    private int frecventa;

    public void Set(String numeHobi){
        hobi=numeHobi;
    }
    public void Set(String numeHobi,int frecventaHobi ){
        hobi=numeHobi;
        frecventa=frecventaHobi;
    }

    public void Get(){
        System.out.printf("Hobiul este %s iar frecventa este %d \n ",hobi,frecventa);
    }
}