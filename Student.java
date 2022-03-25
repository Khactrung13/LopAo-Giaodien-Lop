/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapveLop;


/**
 *
 * @author Admin
 */
public class Student extends Person implements Tax{
    private String name;
    private String studentId;
    private String phone;
    private String email;

    public Student() {
    }

    public Student(String name, String studentId, String phone, String email, int birthday, String gender, String blood_type) {
        super(birthday, gender, blood_type);
        this.name = name;
        this.studentId = studentId;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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
    @Override
    public String toString(){
        
        return "Student("+"name: " + name +",StudentID: "+ studentId +",bithday: "+ birthday
                +",gender: " + gender +",blood_tyde: " + blood_type +",phone: " + phone +",email: " + email +")" ;
        
    }

    @Override
    public double payTax(double income, double start_time, double end_time) {
        double tax=1;
        if(income>=15000000){
            tax=0.005*income*Math.abs(end_time-start_time);
            System.out.println("Thuế là: " + tax);
        }
        else{
            System.out.println("Không có thuế!!!!");
        }
        return tax;
        
    }
    
    
    
}
