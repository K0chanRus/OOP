package org.example.Lison1.Task05.model;

public class StudentsGroup extends User{
    private int groupId;
    private String typeIn;

    public StudentsGroup(Type type, String firstName, String secondName, String lastName, String dateB, int groupId) {
        super(firstName, secondName, lastName, dateB);
        this.groupId = groupId;
        this.typeIn = String.valueOf(type);
    }

    public String getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(String typeIn) {
        this.typeIn = typeIn;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "Tupe = " +  typeIn + '\'' +
                ", groupId=" + groupId + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getLastName() + '\'' +
                ", dateOfBirth=" + super.getDateB() +
                '}';
    }
}
