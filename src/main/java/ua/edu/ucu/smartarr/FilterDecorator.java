package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public abstract class FilterDecorator extends SmartArrayDecorator implements MyPredicate{
    Object[] arr;
    public FilterDecorator(SmartArray smartArray, MyPredicate pr) {
        super(smartArray);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public int size() {
        return 0;
    }
}

