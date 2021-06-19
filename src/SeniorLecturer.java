public class SeniorLecturer extends Lecturer{
    protected int numOfProfs;

    public SeniorLecturer( String name, String dept, int vetek, int numOfProfs) {
        super( name, dept, vetek);
        this.numOfProfs = numOfProfs;
    }
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("And manage: " + numOfProfs + " projects");
    }
    public void doSomthing(){};
    @Override
    public String getType(){
        return "SeniorLecturer";
    }
    @Override
    public void greet(){
        System.out.println("You're more then welcome to the next project");
    }
    @Override
    public String getTitle(){
        return "Dr.";
    }
}
