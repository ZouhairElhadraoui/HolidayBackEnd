package com.backMan.Service;

import com.backMan.dao.EmployeeRepository;
import com.backMan.dao.UserRepository;
import com.backMan.entity.Employee;
import com.backMan.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;

@Service
@Transactional
public class CapManInitServiceImplementation  implements  IcapManInitService{
    @Autowired
    private UserRepository  userRepository;
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public void initUser() {
        Stream.of("Zouhair","Adil","Yahya","Mohamed","Hamza","Jassir","Ratiba","Rayyan")
                .forEach(first_name ->{
                    Users user = new Users();
                    user.setFirstName(first_name);
                    userRepository.save(user);
                });

    }

    @Override
    public void initEmployee() {

//        DateFormat df = new SimpleDateFormat("HH:mm");
//        Stream.of("12:00","16:00","17:00","13:00","18:00","19:00","19:00").forEach(employee_hire_date->{
//            Employee  employee = new Employee();
//            try {
//                employee.setHireDate(df.parse(employee_hire_date));
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
//
//            employeeRepository.save(employee);




//        });





    }

    @Override
    public void initSkill() {

    }

    @Override
    public void initAbsence() {

    }

    @Override
    public void initProject() {

    }

    @Override
    public void initEmployeeHasProject() {

    }

    @Override
    public void initabsenceType() {

    }
}
