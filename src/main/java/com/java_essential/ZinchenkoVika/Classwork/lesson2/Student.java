package com.java_essential.ZinchenkoVika.Classwork.lesson2;

 class Student {

    long id;
    private String username;
    private String email;
    private String phone;
    private String name;
    private String lastName;
    private int age;

     public Student(long id, String username, String email, String phone, String name, String lastName, int age) {
     this.id = id;
     this.username = username;
     this.email = email;
     this.phone = phone;
     this.name = name;
     this.lastName = lastName;
     this.age = age;
     }

    public long getId() {
          return id;
        }
        public void setId(long id) {
        this.id = id;
        }
        public String getUsername() {
        return username;
        }
        public void setUsername(String username) {
        this.username = username;
        }
        public String getEmil() {
        return email;
        }
        public void setEmail(String email) {
       this.email = email;
        }
        public String getPhone() {
        return phone;
        }
        public void setPhone() {
        this.phone = phone;
        }
        public String getName() {
        return name;
        }
        public void setName(String a) {
        this.name = name;
        }
        public String getLastName() {
        return lastName;
        }
        public void setLastName(String lastName) {
        this.lastName = lastName;
        }
        public int getAge() {
        return age;
        }
        public void setAge(int age) {
        this.age = age;
        }

    }

