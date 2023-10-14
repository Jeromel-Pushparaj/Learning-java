package Oops;
class Calculator {
    public int add(int a , int b){
        return a+b;
    }
}

public class Detail
{
    public static void main (String arg[]){

        int a = 5;
        int b = 4;
        Calculator obj = new Calculator();
        int result = obj.add(a,b);
        System.out.println(result);


    }
}
