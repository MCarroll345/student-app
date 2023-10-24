package atu.ie;

public class student {
    String sname;
    String semail;
    String scourse;

    public String getSname() {
        return sname;
    }

    public void setSname(String name) {
        this.sname = name;
    }

    public void display(){
        System.out.println("Name: " + sname + "\n" + "Email: " + semail + "\n" + "Course: " + scourse + "\n");
    }
}
