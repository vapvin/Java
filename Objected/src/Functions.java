public class Functions {

    public static int addNum(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }

    public static void say(String hello){
        System.out.println(hello);
    }

    public static int calcSum(){
        int sum = 0;
        int i;

        for(i = 0; i<=100; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        int ten = addNum(3, 7);
        say("Hello World");
        int sums = calcSum();
        System.out.println(ten);
        System.out.println(sums);
    }
}
