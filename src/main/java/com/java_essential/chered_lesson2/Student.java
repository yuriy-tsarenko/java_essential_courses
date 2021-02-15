package com.java_essential.chered_lesson2;

public class Student {
    public static void main(String[] args) {
      Student[] students = new Student[4];
        Student st1 =new Student();
        Student st2 =new Student();
        Student st3 =new Student();
        Student st4 =new Student();
        st1.setAge(20);
        st1.setId(123213123);
        st1.setLastName("Lastname1");
        st1.setMail("123@mail.com");
        st1.setName("Name1");
        st1.setPhone("1230001221");
        st1.setUsername("Username1");
        st2.setAge(26);
        st2.setId(123213123);
        st2.setLastName("Lastname2");
        st2.setName("Name2");
        st2.setPhone("1230001221");
        st2.setUsername("Username2");
        st3.setAge(20);
        st3.setId(123213123);
        st3.setLastName("Lastname3");
        st3.setMail("123@mail.com");
        st3.setName("Name3");
        st3.setPhone("1230001221");
        st4.setAge(20);
        st4.setId(123213123);
        st4.setLastName("Lastname4");
        st4.setName("Name4");
        st4.setPhone("1230001221");
        students[0]=st1;
        students[1]=st2;
        students[2]=st3;
        students[3]=st4;
        for (Student stu: students)
        {
if(stu.getUsername()==null)
{
    System.out.println("Студент "+stu.getName()+" не указал username");
}
if(stu.getMail()==null)
{
    System.out.println("Студент "+stu.getName()+" не указал mail");
}
if(stu.getAge()>25)
{
    System.out.println("Студент "+stu.getName()+" старше 25");
}

        }
    }
    private  String name;
    private  String phone;
    private  String mail;
    private long id;
    private String username;
    private String lastName;
    private int age;

    public Student(long id, String username, String  mail, String phone, String name, String lastName, int age)
    {
        this.id=id;
        this.username=username;
        this.mail=mail;
        this.phone=phone;
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }
public Student(){}
public void setName(String name)
{
    this.name=name;
}
public void setPhone(String phone)
{
    this.phone=phone;
}
public void setMail(String mail)
{
    this.mail=mail;
}
public void setId(long id)
{
    this.id=id;
}
public void setUsername(String username)
{
    this.username=username;
}
public void setLastName(String lastName)
{
    this.lastName=lastName;
}
public void setAge(int age)
{
    this.age=age;
}
public int getAge()
{
    return age;
}
public long getId()
{
    return id;
}
public String getName()
{
    return name;
}
public String getPhone()
{
    return phone;
}
public String getMail()
{
    return mail;
}
public String getUsername()
{
    return username;
}
public String getLastName()
    {
        return lastName;
    }
}
