import java.util.Scanner;

public class InputDate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String datee = sc.next();
        String[] datein=datee.split("\\.");
        
        
        String date1=datein[0];
        String date2=datein[1];
        String date3=datein[2];
        
        int datee1 = Integer.parseInt(date1);
        int datee2 = Integer.parseInt(date2);
        int datee3 = Integer.parseInt(date3);
        
        
        System.out.print(String.format("%04d",datee1)+".");
        System.out.print(String.format("%02d",datee2)+".");
        System.out.print(String.format("%02d",datee3));
        sc.close();
    }
}