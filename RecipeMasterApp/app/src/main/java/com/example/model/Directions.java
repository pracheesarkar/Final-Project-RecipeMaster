package com.example.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Directions implements Serializable{
    @SerializedName("directionStep")
    private int directionStep;
    @SerializedName("directionInstruction")
    private String directionInstruction;

    public int getDirectionStep() {
        return directionStep;
    }

    public void setDirectionStep(int directionStep) {
        this.directionStep = directionStep;
    }

    public String getDirectionInstruction() {
        return directionInstruction;
    }

    public void setDirectionInstruction(String directionInstruction) {
        this.directionInstruction = directionInstruction;
    }
}
