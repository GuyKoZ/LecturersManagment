public class DeptChair extends Professor{
    private int manageSince;

    public DeptChair( String name, String dept, int vetek, int numOfProfs, int numOfPubs,int manageSince) {
        super(name, dept, vetek, numOfProfs, numOfPubs);
        this.manageSince = manageSince;
    }
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("he manage since: " + manageSince);
    }
    @Override
    public String getType(){
        return "DeptChair";
    }
    @Override
    public void greet(){
        System.out.println("You're more then welcome to second degree");
    }
    @Override
    public String getTitle(){
        return "Prof.";
    }
}
