package org.example.Lison1.Task05.controller;

import org.example.Lison1.Task05.model.Student;
import org.example.Lison1.Task05.model.StudentsGroup;
import org.example.Lison1.Task05.model.Type;
import org.example.Lison1.Task05.model.User;
import org.example.Lison1.Task05.service.DataService;
import org.example.Lison1.Task05.service.StudentsGroupService;
import org.example.Lison1.Task05.view.StudentView;
import org.example.Lison1.Task05.view.StudentsGroupView;

import java.util.List;

public class Controller {

        private final DataService service = new DataService();
        private final StudentView studentView = new StudentView();

        private final StudentsGroupService studentsGroupService = new StudentsGroupService();
        private final StudentsGroupView studentsGroupView = new StudentsGroupView();

        public void createStudent(String firstName, String secondName,
                                  String lastName, String dateB){
            service.create(firstName, secondName, lastName, dateB, Type.STUDENT);
        }

        public void createTeacher(String firstName, String secondName,
                                  String lastName, String dateB){
            service.create(firstName,secondName,lastName,dateB, Type.TEACHER);
        }
        public void createGroup(String tupe,String firstName, String secondName, String lastName, String dateB, int groupId){
            studentsGroupService.createGrope(Type.valueOf(tupe), firstName, secondName,lastName,dateB,groupId);
        }

        public void getAllStudent(){
            List<User> userList = service.getAllStudent();
            for (User user: userList){
                studentView.printOnConsole((Student) user);
            }
        }

        public void getGroup(int idGroup){
            List<User> userList = studentsGroupService.getAllGroup(idGroup);
            for (User user: userList){
                studentsGroupView.printOnConsole((StudentsGroup) user);
            }
        }

}
