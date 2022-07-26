package academy.mindswap;

import academy.mindswap.Divisions.*;
import academy.mindswap.Exceptions.PhysiologyNotRespected;
import academy.mindswap.Exceptions.TooMuchDirtiness;

public class House {

    private int levelOfCleanliness = 100;

    public void haveAMeal() throws TooMuchDirtiness{
        if(levelOfCleanliness <= 0){
            throw new TooMuchDirtiness();
        }
        Division kitchen = new Kitchen();
        levelOfCleanliness -= kitchen.getDirtiness();
        System.out.println("I am so hungry, i have to eat!");

    }

    public void setHouseCleaned(){
        levelOfCleanliness = 100;
    }

    public void haveAGoToBathroom() throws TooMuchDirtiness{
        if(levelOfCleanliness <= 0){
            throw new TooMuchDirtiness();
        }
        Division toilet = new Toilet();
        levelOfCleanliness -= toilet.getDirtiness();
        System.out.println("What a relief, i can eat more now!");
    }

    public void haveANightSleep() throws TooMuchDirtiness{
        if(levelOfCleanliness <= 0) {
            throw new TooMuchDirtiness();
        }
        Division bedroom = new Bedroom();
        levelOfCleanliness -= bedroom.getDirtiness();
        System.out.println("Slept so well, my energy is restored!");
    }

    public void enjoyTv() throws TooMuchDirtiness {
        if(levelOfCleanliness <= 0){
           throw new TooMuchDirtiness();
        }
        Division livingRoom = new LivingRoom();
        levelOfCleanliness -= livingRoom.getDirtiness();
        System.out.println("This movie is great!");
    }

    public void dayAtTheOffice() throws TooMuchDirtiness{
        if(levelOfCleanliness <= 0){
            throw new TooMuchDirtiness();
        }
        Division office = new Office();
        levelOfCleanliness -= office.getDirtiness();
        System.out.println("Just another day at the office...");
    }
}
