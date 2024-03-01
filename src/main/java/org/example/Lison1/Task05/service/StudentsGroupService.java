package org.example.Lison1.Task05.service;

import org.example.Lison1.Task05.model.StudentsGroup;
import org.example.Lison1.Task05.model.Type;
import org.example.Lison1.Task05.model.User;

import java.util.ArrayList;
import java.util.List;

public class StudentsGroupService {
    private List<User> userList;

    public StudentsGroupService() {
        this.userList = new ArrayList<>();
    }
    public void createGrope(Type type,String firstName, String secondName, String lastName, String dateB, int groupId){
        if (Type.STUDENT == type){
            StudentsGroup studentsGroup = new StudentsGroup(type, firstName, secondName, lastName, dateB, groupId);
            userList.add(studentsGroup);
        }else if (Type.TEACHER == type){
            StudentsGroup studentsGroup = new StudentsGroup(type, firstName, secondName, lastName, dateB, groupId);
            userList.add(studentsGroup);
        }
    }


    public List<User> getAllGroup(int idGroup){
        List<User> result = new ArrayList<>();
        String forwardTeacher = "TEACHER";
        for (User user : userList){
            if (user instanceof StudentsGroup) {
                if (idGroup == ((StudentsGroup) user).getGroupId() && ((StudentsGroup) user).getTypeIn() == forwardTeacher){
                        result.add(0,user);
                } else if (idGroup == ((StudentsGroup) user).getGroupId()) {
                    result.add(user);
                }
            }
        }
        return result;
    }

}
