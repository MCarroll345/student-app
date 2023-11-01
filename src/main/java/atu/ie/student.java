package atu.ie;

public class student {
    private String sname;
    private String semail;
    private String scourse;

    public void setSname(String name) {
        this.sname = name;
    }
    public void setSemail(String email) {
        this.semail = email;
    }
    public void setScourse(String course) {
        this.scourse = course;
    }
    public String getSname() {
        return sname;
    }
    public String getSemail() {
        return semail;
    }
    public String getScourse() {
        return scourse;
    }

    public student(String sname) { this.sname = sname; }

    public student() {
        this.sname = " ";
        this.semail = " ";
        this.scourse = " ";
    }

   public student(String sname,String semail, String scourse) {
        this.sname = sname;
        this.semail = semail;
        this.scourse = scourse;
    }

    public void display(){
        System.out.println("Name: " + getSname() + "\n" + "Email: " + getSemail() + "\n" + "Course: " + getScourse() + "\n");
    }
}
