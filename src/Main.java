class Circle {
    static int sum(int x, int ...arr){
        int result = x;
        for (int a: arr){
            result += a;
        }
        return  result;
    }

//
//    public static void main(String[] args) {
//        System.out.println("Sum is = " +sum(x:2, ...arr:7));
//        System.out.println("The sum of these nubers is : ");
//        int num1 = 5;
//        int num2 = 2;
//        int num3 = 3;
//        int sum = num1 + num2 + num3;
//        System.out.println(sum);
//        int i = 0;int fact = 1;
//        int n = 7;
//        for (i=1;i<=n;i++)
//            fact = fact*i;
//        {
//            System.out.println("Factorial is : "+fact);
//        }


    }
