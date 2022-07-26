package academy.mindswap.Exceptions;

public class HouseNotFound extends Exception{
    public HouseNotFound(){
        super("You need to buy a house first.");
    }
}
