public class Methods {

    static void food(){
        System.out.println("salam valikum");
    }

    static void food(int a){
        System.out.println("salam valikum  " + a + "  bhaijaan");
    }

    static void change(int a){
        a = 93;
    }
    static void change2(int [] arr){
        arr[0]=98;
    }
    static void boy(){
        System.out.println("Girl");
    }
    static int logic(int x, int y){
        int z;
            if (x>y){
                z = x+y;
        }
            else {
                z = (x+y)*5;
            }
            return z;
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 7;
        int c;
        // Method invocation using object creation
        //  Methods obj = new Methods();
        c = logic(a, b);          // Use obj.class_name while using object creation
        int a1 = 3;
        int b1 = 4;
        int c1;
        c1 = logic(a1, b1);       // Use obj.class_name while using object creation
        System.out.println(c);
        System.out.println(c1);

        // boy();

        int[] x = {29,48,49,33};
        //  int x= 46;
        //change(x);
        //System.out.println("X : "+x);

        //int[] marks = {29,48,49,33};
        //change2(marks);
        //System.out.println("X : "+ marks[0]);


        // Method Overloading

        food(0);

        int i;
        int fact=1;
        int n = 6;
        for (i = fact;i<=n;i++){
            fact = fact*n;
        }
        System.out.println("Factorial is = " +fact);
        }
    }

