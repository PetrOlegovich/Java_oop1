public class Kids extends Parents{

    private Status status;
    private Person person;
    public Kids(Person person, Status status){
        super (person, status);
    }
    public Status getStatus(){
        return status;
    }
}
