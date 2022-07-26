package academy.mindswap;

import academy.mindswap.Exceptions.*;

public class Player {

    private House house;
    private int balance;

    private int energy = 100;
    private boolean paymentMade;

    private boolean physiologyDemands;

    public Player(int balance){
        this.balance = balance;
        paymentMade = false;
        physiologyDemands = false;
    }

    public void buyHouse(House house) throws ExcessiveHouseRequests {
        if (houseWasBought()) {
            throw new ExcessiveHouseRequests();
        }
        System.out.println("You just bought a house, congratulations!");
        this.house = house;
    }

    public boolean houseWasBought(){
        return house != null;
    }

    public void callTheHouseKeeper() throws SalaryMissing, HouseNotFound {
        if(!doIHaveAHouse()) {
            throw new HouseNotFound();
        }
        if(!didYouPayed()) {
            throw new SalaryMissing();
        }

        house.setHouseCleaned();
        System.out.println("The house was cleaned :)");
        paymentMade = false;
    }

    public void eat() throws TooMuchDirtiness, PhysiologyNotRespected, HouseNotFound {
        if(!doIHaveAHouse()) {
            throw new HouseNotFound();
        }
        if(physiologyDemands){
            throw new PhysiologyNotRespected();
        }
        if(doIHaveAHouse()){
            house.haveAMeal();
            physiologyDemands = true;
        }
    }

    public void payTheHouseKeeper() throws HouseNotFound {
        if(!doIHaveAHouse()) {
            throw new HouseNotFound();
        }
        paymentMade = true;
        this.balance -= 20;
        System.out.println("The housekeeper will clean the entire house!");
    }

    private boolean didYouPayed(){
        return paymentMade;
    }

    public void bathroom() throws TooMuchDirtiness, HouseNotFound {
        if(!doIHaveAHouse()) {
            throw new HouseNotFound();
        }
        house.haveAGoToBathroom();
        physiologyDemands = false;
    }

    public void sleep() throws TooMuchDirtiness, PhysiologyNotRespected, HouseNotFound {
        if(!doIHaveAHouse()) {
            throw new HouseNotFound();
        }
        if(physiologyDemands){
            throw new PhysiologyNotRespected();
        }

        house.haveANightSleep();
        energy = 100;
    }

    private boolean doIHaveAHouse(){
        return this.house != null;
    }

    public void watchTv() throws TooMuchDirtiness, PhysiologyNotRespected, HouseNotFound, MissingEnergy {
        if(!doIHaveAHouse()) {
            throw new HouseNotFound();
        }
        if(physiologyDemands){
            throw new PhysiologyNotRespected();
        }
        if(energy <= 0){
            throw new MissingEnergy();
        }
        energy -= 20;
        house.enjoyTv();
    }

    public void work() throws TooMuchDirtiness, PhysiologyNotRespected, HouseNotFound, MissingEnergy {
        if(!doIHaveAHouse()) {
            throw new HouseNotFound();
        }
        if(physiologyDemands){
            throw new PhysiologyNotRespected();
        }
        if(energy <= 0) {
            throw new MissingEnergy();
        }
        energy -= 50;
        house.dayAtTheOffice();
    }
}

