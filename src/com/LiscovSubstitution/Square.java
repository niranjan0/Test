package com.LiscovSubstitution;

public class Square extends Ractangle {

    public Square() {
    }
    public Square(int size){
        width=height=size;
    }
    @Override
    public void setWidth(int width){
        super.setWidth(width);
        super.setHeight(width);
    }
    @Override
    public void setHeight(int height){
        super.setWidth(height);
        super.setHeight(height);
    }
}
