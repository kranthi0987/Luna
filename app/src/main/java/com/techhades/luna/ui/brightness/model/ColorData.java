package com.techhades.luna.ui.brightness.model;

/**
 * Created by Meghal on 6/22/2016.
 */
public class ColorData {

    private int color;
    private boolean selected = false;

    public ColorData(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
