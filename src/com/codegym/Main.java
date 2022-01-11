package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point point = new Point();
        System.out.println(point);
        point = new Point(3.5f,7.5f);
        System.out.println(point);
        float[] points = point.getXY(point.getX(), point.getY());
        for (float element:points) {
            System.out.print(element + "\t");


            MoveablePoinbt moveablePoinbt = new MoveablePoinbt(3.5f,4.6f,5.0f,7.5f);
            System.out.println(moveablePoinbt);
            moveablePoinbt.move();
            System.out.println(moveablePoinbt);
        }
    }
}
