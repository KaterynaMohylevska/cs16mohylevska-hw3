package ua.edu.ucu.smartarr;

import java.lang.reflect.Array;

// Base array for decorators
public class BaseArray implements SmartArray{
    public Object[] arr = new Object[]{};
    public BaseArray(Object[] arr){
        this.arr = arr;
    }
    public Object[] toArray(){
        return this.arr;
    }

    @Override
    public int size() {
        return this.arr.length;
    }

}
