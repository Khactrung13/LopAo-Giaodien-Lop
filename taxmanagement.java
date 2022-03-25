/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapveLop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class taxmanagement {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
   
        while(true){
        System.out.println("1.Nhập dữ liệu cho Student");
        System.out.println("2.Nhập dữ liệu cho Worker");
        System.out.println("3.Nhập dữ liệu cho BusinessPerson");
        System.out.println("4.Kết thúc chương trình");
        System.out.println("Nhập lựa chọn:");
        int luachon = Integer.parseInt(sc.nextLine());
        switch(luachon){
            case 1:
                System.out.println("Nhập dữ liệu cho Student");
                System.out.println("Nhập birthday:");
                int birthday = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập gender:");
                String gender = sc.nextLine();
                System.out.println("Nhập blood_type:");
                String blood_type = sc.nextLine();
                System.out.println("Nhập name:");
                String name =sc.nextLine();                
                System.out.println("Nhập studentId:");
                String studentId=sc.nextLine();                
                System.out.println("Nhập phone:");
                String phone = sc.nextLine();
                System.out.println("Nhập email:");
                String email =sc.nextLine();
                System.out.println("Nhập income:");
                double income = sc.nextDouble();
                System.out.println("Nhập start_time:");
                double start_time=sc.nextDouble();
                System.out.println("Nhập end_time:");
                double end_time =sc.nextDouble();
                sc.nextLine();
                Person student = new Student(name, studentId, phone, email, birthday, gender, blood_type);
                System.out.println(student.toString());
                Student sv = new Student();
                sv.payTax(income, start_time, end_time);
                break;
            case 2:
                System.out.println("Nhập dữ liệu cho Worker");
                System.out.println("Nhập birthday:");
                birthday = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập gender:");
                gender = sc.nextLine();
                System.out.println("Nhập blood_type:");
                blood_type = sc.nextLine();
                System.out.println("Nhập name:");
                name =sc.nextLine();                
                System.out.println("Nhập studentId:");
                String citizenId=sc.nextLine();                
                System.out.println("Nhập phone:");
                phone = sc.nextLine();
                System.out.println("Nhập email:");
                email =sc.nextLine();
                System.out.println("Nhập Salary");
                String salary = sc.nextLine();
                System.out.println("Nhập other_income");
                double other_income =Double.parseDouble(sc.nextLine());
                System.out.println("Nhập start_time:");
                start_time=sc.nextDouble();
                System.out.println("Nhập end_time:");
                end_time =sc.nextDouble();
                sc.nextLine();
                Person worker = new Worker(name, citizenId, phone, email, salary, other_income, birthday, gender, blood_type);
                System.out.println(worker.toString());
                income = other_income;
                System.out.println("Income =" +income);
                Worker wk = new Worker();
                wk.payTax(income, start_time, end_time);
                break;
                
            case 3:
                 System.out.println("Nhập dữ liệu cho Worker");
                System.out.println("Nhập birthday:");
                birthday = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập gender:");
                gender = sc.nextLine();
                System.out.println("Nhập blood_type:");
                blood_type = sc.nextLine();
                System.out.println("Nhập name:");
                name =sc.nextLine();                
                System.out.println("Nhập studentId:");
                citizenId=sc.nextLine();                
                System.out.println("Nhập phone:");
                phone = sc.nextLine();
                System.out.println("Nhập email:");
                email =sc.nextLine();
                System.out.println("Nhập Salary");
                salary = sc.nextLine();
                System.out.println("Nhập Business_income:");
                double business_income = Double.parseDouble(sc.nextLine());
                System.out.println("Nhập other_income");
                other_income =Double.parseDouble(sc.nextLine());
                System.out.println("Nhập start_time:");
                start_time=sc.nextDouble();
                System.out.println("Nhập end_time:");
                end_time =sc.nextDouble();
                sc.nextLine();
                Person businessperson = new BusinessPerson(name, citizenId, phone, email, salary, business_income, other_income, birthday, gender, blood_type);
                System.out.println(businessperson.toString());
                income = other_income+ business_income;
                System.out.println("Income =" +income);
                BusinessPerson bsp = new BusinessPerson();
                bsp.payTax(income, start_time, end_time);
                break;
            case 4:
                return;
                    
            default:
                System.out.println("Không hợp lệ!!");
                continue;
            }
        }
    }
}
 