public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("argument length  : " + args.length);

        for (String i : args){
            System.out.println(" value of argument is : " + i);
        }
    }
}