package com.lambton;

public class collegeExample
{
    public static void main(String[] args)
    {

        int a,b;
        Arithmetic arithmetic = new Arithmetic();
        System.out.println("SUM : " + arithmetic.add( a=10, b=20));
        System.out.println("SUB : " + arithmetic.sub(a=30, b=10));
        System.out.println(" MUL :" +arithmetic.mul(a=5,b=6));
        System.out.println("DIV :" +arithmetic.div(a=30,b=8));

        Student s1 = new Student();
        s1.setFirstname("Varinder");
        s1.setLastname("Dhillon");
        s1.setMarks1(40);
        s1.setMarks2(40);
        s1.setMarks3(50);
        s1.setMarks4(50);
        s1.setMarks5(50);
        System.out.println(s1.getfullname());
        System.out.println(s1.getMarks1());
        System.out.println(s1.getMarks2());
        System.out.println(s1.getMarks3());
        System.out.println(s1.getMarks4());
        System.out.println(s1.getMarks5());

        System.out.println(s1.getTotal());
        System.out.println(s1.getPercentage());


        s1.generateresult();
        System.out.printf(s1.calculateGrade());



    }



}
