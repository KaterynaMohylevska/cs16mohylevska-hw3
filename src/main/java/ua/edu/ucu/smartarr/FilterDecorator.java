package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public abstract class FilterDecorator extends SmartArrayDecorator implements MyPredicate{

    public FilterDecorator(SmartArray smartArray) {
        super(smartArray);
    }

    public FilterDecorator(SmartArray smartArray, MyPredicate method) {
        super(smartArray);
    }
}

