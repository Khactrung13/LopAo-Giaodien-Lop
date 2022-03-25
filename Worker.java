/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapveLop;

/**
 *
 * @author Admin
 */
public class Worker extends Person implements Tax {
    private String name;
    private String citizenId;
    private String phone;
    private String email;
    private String salary;
    private double other_income;

    public Worker() {
    }

    public Worker(String name, String citizenId, String phone, String email, String salary, double other_income, int birthday, String gender, String blood_type) {
        super(birthday, gender, blood_type);
        this.name = name;
        this.citizenId = citizenId;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.other_income = other_income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public double getOther_income() {
        return other_income;
    }

    public void setOther_income(double other_income) {
        this.other_income = other_income;
    }
    
    @Override
    public String toString(){
        
        return "Worker("+"name: " + name +",CitizenId: "+ citizenId +",bithday: "+ birthday
                +",gender: " + gender +",blood_tyde: " + blood_type +",phone: " + phone +",email: " + email 
                +",salary: " + salary +",other_income: "+ other_income +")";
        
    }

    @Override
    public double payTax(double income, double start_time, double end_time) {
        double tax=1;
        if(income>=15000000){
            tax=0.01*income*Math.abs(end_time-start_time);
            System.out.println("Thuế là: " + tax);
        }
        else{
            System.out.println("Không có thuế!!!!");
        }
        return tax;
        
    }
    
}
