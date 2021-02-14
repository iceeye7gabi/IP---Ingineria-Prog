//Static Polimorfism
class Math{
    public int inmultireMath(int a,int b)
    {
        System.out.println("S-a accesat metoda cu 2 int-uri ca parametri");
          return a*b;
    }

    public float inmultireMath(float a,float b)
    {
        System.out.println("S-a accesat metoda cu 2 float-uri ca parametri");
        return a*b;
    }
}