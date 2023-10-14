package Oops;

class Computer{
    
    public String writecode(int lines){

        if(lines <=0)
            return "Nothing";
        
        return "Code writen successfully";
    }
}

public class Demo {
    public static void main (String a[]){
        Computer obj = new Computer();

        String str = obj.writecode(34);
        System.out.println(str);
    }
}
