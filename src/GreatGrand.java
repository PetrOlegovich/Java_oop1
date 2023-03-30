public class GreatGrand extends Parents{
    private Status status;
    private Person person;
    public GreatGrand(Person person, Status status){
        super (person, status);
    }
    public Status getStatus(){
        return status;
    }
}
