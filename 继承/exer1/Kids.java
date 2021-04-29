package day12.exer1;

public class Kids extends  MainKind {
    private int yearsOld;

    public void setYearsOld(int yearsOld){
        this.yearsOld = yearsOld;
    }

    public int getYearsOld(){
        return this.yearsOld;
    }

    public void printYersOld(){
        System.out.println("i am " + this.yearsOld + "years old");
    }

}
