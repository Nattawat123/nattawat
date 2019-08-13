package chap4;

import java.util.Scanner;


public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name :");
        String name = sc.next();
        System.out.println("name is :"+name);
        
        System.out.println("Enter age:");
        int age = sc.nextInt();
        
        System.out.println("Enter salary :");
        double salary = sc.nextDouble();
        
        System.out.println("Employee : "+name);
        System.out.println(",age :"+age+",salary :"+salary);
        
        if  (age<=11){
            System.out.println("วัยเด็ก");
        }
        else if (age<=20){
            System.out.println("วัยรุ่น");
           
        }
        else if (age<=40){
            System.out.println("ผู้ใหญ่");
           
        }
        else if (age<=60){
            System.out.println("กลางคน");
           
        }
        else if (age<=65){
            System.out.println("สูงอายุ");
        }
        else{
            System.out.println("อายุไม่ตรงตามเงื่อนไข");
        }
        
        
        System.out.println("Enter degree");
        int degree = sc.nextInt();
        switch(degree){
            case 1:
                System.out.println("ปริญญาตรี");
                break;
            case 2:
                System.out.println("ปริญญาโท");
                break;
            case 3:
                System.out.println("ปริญญาเอก");
                break;
            default:
                System.out.println("ไม่ระบุ");
                break;
        }
    }
 
}
