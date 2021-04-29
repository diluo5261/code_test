package day12.exer2;

public class Student extends Person {
    long number;
    int math;
    int english;
    int computer;
    public Student(String n ,char s,int a,long k,int m,int e,int c){

        this.name = n;
        this.number =k;
        this.sex = s;
        this.age = a;
        this.math = m;
        this.english = e;
        this.computer = c;

    }

    public double aver(){
        return (this.math + this.english + this.computer)*1.0 / 3.0;
    }

    public int max(){
        return (math > english ? math :english) > computer ? (math > english ? math :english) : computer;
    }

    public int min(){
        return (math < english ? math :english) < computer ? (math < english ? math :english) : computer;
    }
}
