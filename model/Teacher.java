package model;
public class Teacher extends Peaple {
    protected String classroom;
    /**
     * @param name
     * @param phone
     * @param oldAge
     */
    
     public Teacher(String name, String phone, int oldAge, String classroom){
        super(name, phone, oldAge);
        this.classroom = classroom;
    }

    public Teacher() {
    }

    public String getClassroom(){
        return this.classroom;
    }
    public void setclassroom(String classroom){
        this.classroom = classroom;
    }
    public String toString(){
        return super.toString() + ", classroom: " + this.classroom;
    }
    
}
