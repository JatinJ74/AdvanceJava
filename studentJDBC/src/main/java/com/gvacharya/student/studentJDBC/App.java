package com.gvacharya.student.studentJDBC;

import com.gvacharya.student.studentJDBC.entities.Address;
import com.gvacharya.student.studentJDBC.entities.Student;
import com.gvacharya.student.studentJDBC.services.StudentService;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StudentService service = new StudentService();
        
//        Address address = new Address("GV College","Shelu East","Karjat",400074);
//        
//        Student student = new Student(4,"Kunal","AIML",address);
//        
//        System.out.println(
//        		service.insertStudent(student)
//        		);
//        System.out.println(service.selectStudent(1));
        
          System.out.println(service.selectAllStudent());
        
    }
}
