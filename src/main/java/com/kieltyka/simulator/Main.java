package com.kieltyka.simulator;

import javax.crypto.Mac;

/**
 * Created by domin on 6/12/17.
 */
public class Main {
    public static void main(String[] args) {
        Machine m = new Elevator(10);

        m.goToFloor(2);
    }
}
