public class operators
{
    public static void main(String[] args)
    {
        int a = 4;
        int b = 1000 + a;                 // arithmetic operator
        System.out.println(b);
        System.out.println(2<3);          // comparision operator
        int c =9;
        c *= 4;                           // assignment operator
        System.out.println(c);
        System.out.println(64>4 || 64>9); // logical operator

        System.out.println(2 & 3);        // bitwise operator


                   // Precedence and associativity

        int d = 6*5-34/2;       // associativity from left to right
        System.out.println(d);

                   // Resulting data type after arithmetic operation
        byte x = 4;
        int y = 5;
        short z = 6;
        int f = y + z;
        float g = 5.88f + x;
        System.out.println(f);
        System.out.println(g);

                   // Increment and decrememt operator
        int h = 33;
        System.out.println(h++);  // first it copies and then increments it
        System.out.println(h);
        System.out.println(++h);   // first it increments then value and then value is copied
        System.out.println(h);

                // practice question

        int m = 7;
        int n = ++m * 8;
        System.out.println(n);
    }
}
