package model;
public abstract class Peaple {
    protected String name;
    protected String phone;
    protected int oldAge;

    public Peaple(){
        
    }

    public Peaple(String name, String phone, int oldAge){
        this.name = name;
        this.phone = phone;
        this.oldAge = oldAge;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public int getOldAge(){
        return this.oldAge;
    }
    public void setOldAge(int oldAge){
        this.oldAge = oldAge;
    }

    public String toString(){
        return "name: " + this.name + ", phone: " + this.phone + " and oldAge: " + this.oldAge;
    }


}
