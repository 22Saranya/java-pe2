package com.stackroute.pe2;

class MemberVariable {
    String name;
    double salary;
    int age;

    /* declare the methods */
    void setData(String member_name,double member_value, int member_age) { // stores the input data
        name = member_name;
        salary= member_value;
        age=member_age;
    }
    void getData() { // displays the stored data
        System.out.println("Student Info :- ");
        System.out.println("name : " + name + "  salary : " + salary+"age:"+age);
    }
}

public class Member {
    public static void main(String args[]) {
        MemberVariable  emp = new MemberVariable();//create an object to store a student's info
        // call setData() to store student's roll and percentage
        emp.setData("harrypotter",2500, 30);
        emp.getData();

    }
}
