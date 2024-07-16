//package com.SpringSec.SpringSecPractice.CSRFController;
//
//import com.SpringSec.SpringSecPractice.Model.DataCSRF.Student;
//import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.security.web.csrf.CsrfToken;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/csrf")
//public class CSRF_Controller {
//
//    List<Student> stu = new ArrayList<>(
//            List.of(
//                    new Student(01, "Sokphorn", "Java"),
//                    new Student(02, "Chanly", "Database"),
//                    new Student(03, "SreyTouch", "QC"),
//                    new Student(04, "Sensamsang", "Middle"),
//                    new Student(05, "Seanghay", "Network"),
//                    new Student(06, "Ravuth", "Project Manager")
//
//            ));
//
//    @GetMapping("/student")
//    public List<Student> getStudent(){
//        return stu;
//    }
//
//
//    @GetMapping("/token")
//    public CsrfToken getCsrfToken(HttpServletRequest request){
//       return (CsrfToken) request.getAttribute("_csrf");
//    }
//
//
//    @PostMapping("/add")
//    public void addStudent(@RequestBody Student studentReq){
//       stu.add(studentReq);
//    }
//
//}
