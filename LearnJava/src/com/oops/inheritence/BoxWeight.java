package com.oops.inheritence;

import com.oops.interfaces.Media;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        super();
        this.weight = -1;
    }
    BoxWeight(BoxWeight old){
        super(old);
        weight=old.weight;
    }
    static void greeting(){
        System.out.println("Hey I am in BoxWeight class greeting method");
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);
        //System.out.println(super.w);
        this.weight = weight;
        //this.weight=super.w;
    }

    public static class CDPlayer implements Media {

        @Override
        public void start() {
            System.out.println("Music start");
        }

        @Override
        public void stop() {
            System.out.println("Music stop");
        }
    }
}
