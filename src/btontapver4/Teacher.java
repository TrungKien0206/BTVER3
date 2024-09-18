package btontapver4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Teacher extends Person {

    private String department;
    private String teachingSubject;

    public Teacher(String id, String fullName, Date dateOfBirth, String department, String teachingSubject) {
        super(id, fullName, dateOfBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public void updateTeacher(String newName, Date newDateOfBirth, String newDepartment, String newSubject) {
        this.fullName = newName;
        this.dateOfBirth = newDateOfBirth;
        this.department = newDepartment;
        this.teachingSubject = newSubject;
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Teacher ID: " + id + ", Name: " + fullName + ", Date of Birth: " + sdf.format(dateOfBirth)
                + ", Department: " + department + ", Subject: " + teachingSubject);
    }

    @Override
    public void displayInfor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
