import java.util.Scanner;

public class demo_1 {/* 判断闰年 */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int year = in.nextInt();
            if (year<0 || year>10000000){
                System.out.println("error,enter again!");
            }
            else{
                if (isLeapYear(year))
                    System.out.println(year+"是闰年");
                else
                    System.out.println(year+"不是闰年");
            }
        }
    }

    public static boolean isLeapYear(int x){
        return (x%4==0 && x%100!=0 || x%400==0) ? true : false;
    }
}
