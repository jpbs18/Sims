package academy.mindswap.Divisions;

public abstract class Division{

    private int dirtiness;
    public Division(int dirtiness) {
        this.dirtiness = dirtiness;
    }

    public int getDirtiness(){
        return this.dirtiness;
    }
}
