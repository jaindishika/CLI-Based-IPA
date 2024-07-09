package com.ImageProcessing.Observer;


import com.ImageProcessing.SingletonPattern.Logger;

import java.util.ArrayList;
import java.util.List;

public class ImageProcessingContext extends Subject {
    private List<OperationState> states = new ArrayList<>();
    private double totalCost = 0;

    public void addState(OperationState state) {
        states.add(state);
    }

    public void execute() {
        for (OperationState state : states) {
            notifyObservers("Starting operation: " + state.getClass().getSimpleName());
            state.execute(this);
            notifyObservers("Completed operation: " + state.getClass().getSimpleName());
        }
        Logger.getInstance().log("Total cost for bundled operations: $" + totalCost);
        notifyObservers("Total cost for bundled operations: $" + totalCost);
    }

    public void addCost(double cost) {
        totalCost += cost;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
