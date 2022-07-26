package academy.mindswap;

import academy.mindswap.Exceptions.*;

public class Main {

    public static void main(String[] args) {

        Player sim = new Player(100);
        House house = new House();
        House house2 = new House();
/*
        try {
            sim.buyHouse(house);//You just bought a house!
        } catch (ExcessiveHouseRequests e) {
            throw new RuntimeException(e);
        }
*/

        //sim.buyHouse(house2);// You can´t have more than one house.


        try {
            sim.eat();// I have to eat
        } catch (TooMuchDirtiness e) {
            System.out.println(e.getMessage());
        } catch (PhysiologyNotRespected e) {
            System.out.println(e.getMessage());
        } catch (HouseNotFound e) {
            System.out.println(e.getMessage());
        }

        try {
            sim.bathroom(); // what a relief
        } catch (TooMuchDirtiness e) {
            System.out.println(e.getMessage());
        } catch (HouseNotFound e) {
            System.out.println(e.getMessage());
        }
        /*
        sim.eat(); // i have to eat
        sim.bathroom(); // Call houseKeeper
        sim.eat();// Call houseKeeper
        sim.bathroom();// Call houseKeeper
        sim.eat();// Call houseKeeper
        sim.callTheHouseKeeper();// you need to pay
        sim.payTheHouseKeeper();// the housekeeper will clean
        sim.callTheHouseKeeper();// the house was cleaned
        sim.eat();// you need bathroom
        sim.bathroom();//what a relief
        sim.eat();// i have to eat
        */

        try {
            sim.watchTv();
        } catch (TooMuchDirtiness | PhysiologyNotRespected | HouseNotFound | MissingEnergy e) {
            System.out.println(e.getMessage());
        }


        try {
            sim.work();
        } catch (TooMuchDirtiness | PhysiologyNotRespected | HouseNotFound | MissingEnergy e) {
            System.out.println(e.getMessage());
        }


        try {
            sim.work();
        } catch (TooMuchDirtiness | PhysiologyNotRespected | HouseNotFound | MissingEnergy e) {
            System.out.println(e.getMessage());
        }

        /*
        try {
            sim.sleep();
        } catch (TooMuchDirtiness | PhysiologyNotRespected | HouseNotFound e) {
            System.out.println(e.getMessage());
        }

         */


        try {
            sim.work();
        } catch (TooMuchDirtiness | PhysiologyNotRespected | HouseNotFound | MissingEnergy e) {
            System.out.println(e.getMessage());
        }

    }
}
