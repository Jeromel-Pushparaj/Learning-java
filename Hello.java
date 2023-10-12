class java
{
    public static void main(String a[])
    {
        int n = 18;
        int by = 2005;
        int result = n + by;
        double f = 5.06;
        System.out.println("Hello world");
        System.out.println(3 + 4);
        System.out.println(2005+n);
        System.out.println(result);

        //casting and conversion
        byte m = 121;

        //the below line of explicit casting = conversion 
        byte b = (byte)n;

        //below line of code is casting
        int t = (int) f;
        System.out.println(m);
        System.out.println(b);
        System.out.println(t);

        //Type promotion
        byte h = 10;
        byte k = 30;
        int rt = h * k;//here byte is crossing its byte limit so it converted to integer out put will be 300 is out of range because byte range is 256
        System.out.println(rt);
    }
}