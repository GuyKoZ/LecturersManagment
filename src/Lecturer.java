public class Lecturer {
    private String name;
    private String dept;
    private int vetek;

    public Lecturer ( String name, String dept, int vetek){
        this.dept = dept;
        this.name = name;
        this.vetek = vetek;
    }
    public void introduce(){
        System.out.println("The member is: " + getType() + " and the name is " + getTitle() + name +
                ". the vetek is: " + vetek + " yeras. ");
    }
    public String getType(){
        return "Lecturer";
    }
    public String getTitle(){
        return "Dr.";
    }
    public void greet(){
        System.out.println("You're more then welcome to the next course");
    }
}
