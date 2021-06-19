public class Professor extends SeniorLecturer{
    protected int numOfPubs;

    public Professor( String name, String dept, int vetek, int numOfProfs, int numOfPubs){
        super( name, dept, vetek, numOfProfs);
        this.numOfPubs = numOfPubs;
    }
    public void introduce(){
        super.introduce();
        System.out.println("And published: " + numOfPubs + " atricles");
    }
    @Override
    public String getType(){
        return "Professor";
    }
    @Override
    public void greet(){
        System.out.println("You're more then welcome to the next research");
    }
    @Override
    public String getTitle(){
        return "Prof.";
    }
}
