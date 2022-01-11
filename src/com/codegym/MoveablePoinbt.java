package com.codegym;

public class MoveablePoinbt extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoinbt() {
    }

    public MoveablePoinbt(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoinbt(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(float xSpeed, float ySpeed){
        float[] arr = new float[2];
        arr[0] = xSpeed;
        arr[1] = ySpeed;
        return arr;
    }
    public void move(){
        super.setXY(super.getX()+xSpeed,super.getY()+ySpeed);
    }

    @Override
    public String toString() {
        return "MoveablePoinbt{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", speed = " + "("+getxSpeed()+", "+getySpeed()+")" ;
    }
}
