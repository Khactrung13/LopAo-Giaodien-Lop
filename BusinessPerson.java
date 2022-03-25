/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapveLop;

/**
 *
 * @author Admin
 */
public class BusinessPerson extends Person implements Tax {
    private String name;
    private String citizenId;
    private String phone;
    private String email;
    private String salary;
    private double business_income;
    private double other_income;

    public BusinessPerson() {
    }

    public BusinessPerson(String name, String citizenId, String phone, String email, String salary, double business_income, double other_income, int birthday, String gender, String blood_type) {
        super(birthday, gender, blood_type);
        this.name = name;
        this.citizenId = citizenId;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.business_income = business_income;
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

    public double getBusiness_income() {
        return business_income;
    }

    public void setBusiness_income(double business_income) {
        this.business_income = business_income;
    }

    public double getOther_income() {
        return other_income;
    }

    public void setOther_income(double other_income) {
        this.other_income = other_income;
    }
    
    @Override
    public String toString(){
        return "BusinessPerson("+"name: " + name +",CitizenId: "+ citizenId +",bithday: "+ birthday
                +",gender: " + gender +",blood_tyde: " + blood_type +",phone: " + phone +",email: " + email 
                +",salary: " + salary +",other_income: "+ other_income + ",other_income: "+other_income +")";
    }
//    public double tinhTongThuNhap(double business_income ,double income , double other_income){
//        income = business_income +other_income;
//        return income;
//    }
    
    @Override
    public double payTax(double income, double start_time, double end_time) {
       double tax=1;    
       if(income>=50000000){
           tax = 0.03*income*Math.abs(end_time -start_time);
       }
       else if(income>10000000){
           tax = 0.02*income*Math.abs(end_time -start_time);
       }
               
       else{
           System.out.println("Không có thuế!!!");
       }
        System.out.println("Thuế là: " + tax);
       return tax;
    }
    
}
