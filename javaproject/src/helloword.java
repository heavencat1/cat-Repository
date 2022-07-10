import java.util.Scanner;
import java.util.concurrent.CancellationException;

/**
 * @author : 可口可乐猫
 */



public class helloword {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("请输入名字:");
        String name = input.next();

        System.out.print("请输入年龄:");
        int age = input.nextInt();

        System.out.print("请输入工资:");
        double score = input.nextDouble();

        System.out.println("名字是:"+name+",年龄是:"+age+",工资是:"+score);









    }
}

