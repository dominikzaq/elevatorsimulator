package com.kieltyka.simulator;


/**
 * Created by domin on 6/12/17.
 */
public class Elevator implements Machine {
    private int currentFloor;

    public Elevator(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    @Override
    public void goToFloor(int floor) {
        System.out.println("Elevator floor " + currentFloor);
        System.out.println("Elevator changed floor" + floor);

        int l = Math.abs(floor - currentFloor);
        if(currentFloor > floor) {
            for(int i = 1; i <= l; i++) {
                goDown();
                currentFloor--;
            }
        } else {
            for(int i = 1; i <= l; i++) {
                goUp();
                currentFloor++;
            }
        }

        openDoor();
        closeDoor();
    }

    @Override
    public void goUp() {
        System.out.println("up" + currentFloor);
    }

    @Override
    public void goDown() {
        System.out.println("down" + currentFloor);
    }


    private void openDoor() {
        System.out.println("the door is opened");
    }

    private void closeDoor() {
        System.out.println("the door is closed");
    }
}
