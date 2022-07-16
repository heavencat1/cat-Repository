import java.util.Scanner;
import java.util.concurrent.CancellationException;

/**
 * @author : 可口可乐猫
 */



public class helloword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int count = 10;
//        for(int i=0; i<=count; i++){
//
//                System.out.println(i+"+"+(count-i)+"="+count);
//
//
//        }



//        int num = 1;
//        while(num<=100){
//            if(num%3 == 0){
//                System.out.println(num);
//            }
//            num += 1;
//        }

//          int num = 40;
//          int num1 = 200;
//          int num2 = 2;
//          while(num<=num1){
//              if(num % num2 == 0){
//                  System.out.println(num);
//              }
//              num += 1;
//          }

//        int i = 1;
//        int num = 0;
//        do{
//
//            num += i;
//
//            i++;
//        }while(i<=100);
//        System.out.println(num);
//        System.out.println(i);


//
//        int i = 1;
//        int num = 0;
//        do{
//            if(i%5==0 && i%3!=0){
//                num += 1;
//            }
//            i++;
//        }while(i <= 200);
//        System.out.println(num);


//         char answer = ' ';
//         do{
//             System.out.println("还钱吗");
//             answer = input.next().charAt(0);
//
//         }while(answer != 'y');


//        double score = 0.0;
//        double zongfen = 0.0;
//        double allscore = 0.0;
//        int num = 0;
//        int i = 1;
//        for(; i<=3;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print("第"+i+"个班的第"+j+"个学生的成绩是：");
//                score = input.nextDouble();
//                zongfen += score;
//                allscore += zongfen;
//                if(j == 5){
//                    double pingjunfen = zongfen/5;
//                    System.out.println("第"+i+"个班的平均分是:"+pingjunfen);
//
//                    zongfen = 0;
//                }
//
//                if(score>=60){
//                    num +=1;
//                }
//            }
//
//        }
//        System.out.println(i-1+"个班及格的人总共有:"+num+"人");
//        System.out.println("总分是:"+allscore);
//        System.out.println("总平均分是:"+allscore/(i-1));



        for(int i=1;i<=5;i++){
            for(int x=1;x<=5-i;x++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                if(i == 5){
                    System.out.print("*");
                }else{
                    if(j ==1 || j==2*i-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }

            System.out.print("\n");
        }



    }

}


