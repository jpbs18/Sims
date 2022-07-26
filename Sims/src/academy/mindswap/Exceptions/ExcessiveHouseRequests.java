package academy.mindswap.Exceptions;

public class ExcessiveHouseRequests extends Exception{
    public ExcessiveHouseRequests(){
        super("You can't have more than one house.");
    }
}
