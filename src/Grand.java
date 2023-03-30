public class Grand extends Parents{
    private Status status;
    private Person person;
    public Grand(Person person, Status status){
        super (person, status);
    }
    public Status getStatus(){
        return status;
    }

}
