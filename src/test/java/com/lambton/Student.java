package com.lambton;

public class Student
{
    private int PASSMARKS =50;
 private int studentid;
  private String firstname;
  private String lastname;
  private int marks1;
  private int marks2;
  private int marks3;
  private int marks4;
  private int marks5;
  private int total;
  private float percentage;
  private String result;

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
     public String getfullname()
     {
         return lastname + " " + firstname;
     }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public int getMarks4() {
        return marks4;
    }

    public void setMarks4(int marks4) {
        this.marks4 = marks4;
    }

    public int getMarks5() {
        return marks5;
    }

    public void setMarks5(int marks5) {
        this.marks5 = marks5;
    }

    public int getTotal() {
        return total;
    }



    public float getPercentage() {
        return percentage;
    }



    public String getResult() {
        return result;
    }

    public void calculatetotal()
    {
        total = marks1 + marks2 + marks3 + marks4 + marks5;
    }

    public void calculatepercentage()
    {
        percentage = total / 5*100;
    }

    public void generateresult()
    {
        if (determineresult())
        {





            System.out.println("PASS");
        } else


            System.out.println("FAIL");

    }

    private boolean determineresult()
    {
        int count=0;

        if(marks1 < PASSMARKS)
        {
        count++;
        }

        if(marks2 < PASSMARKS)
        {
            count++;
        }

        if(marks3 < PASSMARKS)
        {
            count++;
        }

        if(marks4 < PASSMARKS)
        {
            count++;
        }

        if(marks5 < PASSMARKS)
        {
            count++;
        }

        if(count >=2)
        {
            return false;
        }
        return true;
    }

    private String calculateGrade() {

        if (percentage <= 49) {
            result = "F";
        } else if (percentage <= 59) {
            result = "D";
        } else if (percentage <= 69) {
            result = "C";
        } else if (percentage <= 79) {
            result = "B";
        } else if (percentage <= 89) {
            result = "B+";
        } else if (percentage <= 95) {
            result = "A";
        } else {
            result = "A+";
        }
        return result;
    }

}
