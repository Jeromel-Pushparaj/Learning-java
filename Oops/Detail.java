package Oops;
class Calculator {
    public int add(int a , int b, int c){
        return a+b+c;
    }
    public int add(int a, int b){
        return a+b;
    }
}

public class Detail
{
    public static void main (String arg[]){

        int a = 5;
        int b = 4;
        int c = 6;
        Calculator obj = new Calculator();
        int result = obj.add(a,b,c);
        System.out.println(result);


    }
}
