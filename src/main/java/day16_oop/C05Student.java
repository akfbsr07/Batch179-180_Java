package day16_oop;

 /*
        Encapsulation: It means "data hiding"

        Why do you need to hide data?
        i)Because some data should not be public, like "ID", "Credit Card Number", "Social Security Number"
        ii)Because we do not want to some data to be accessible from the other classes

        How do you do Encapsulation?
        To hide data I use "private" access modifiers

        Note: set() and get() methods are called "Java Beans"
     */


public class C05Student {

    private String stdId = "TH001";
    private  String illness = "Depression";
    private double gpa = 3.98;
    private boolean disability = false;

    //How to read encapsulated data even if we do not see them
    //get() methods are called getter
    public String getStdId(){
        return stdId;
    }

    public  String getIllness(){
        return illness;
    }

    public double getGpa(){
        return gpa;
    }

    public boolean isDisability(){     // get method for booleans start with "is", all the others start with "get"
        return disability;
    }


    //How to update encapsulated data even we do not see them
    //set() methods are called setter
    public void setStdId(String stdId){
        this.stdId = stdId;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setDisability(boolean disability) {
        this.disability = disability;
    }
}
