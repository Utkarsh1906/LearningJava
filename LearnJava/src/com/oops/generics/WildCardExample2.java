package com.oops.generics;

import java.util.List;

//By use of wildcards we actually create constraint on the use of type parameter
//Here T can either be Number class or its subclasses
public class WildCardExample2<T extends Number> {
    private T element;
    public void setValue(T element){
        this.element=element;
    }
    public T getValue(){
        return element;
    }
    public void getList(List<? extends Number> list){
        //body here
    }

    public static void main(String[] args) {
        WildCardExample2<Integer> num=new WildCardExample2<>();
        num.setValue(56);

        System.out.println(num.getValue());
    }
}
