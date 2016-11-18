package ua.edu.ucu.smartarr;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public abstract class DistinctDecorator extends SmartArrayDecorator{

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        for (int i = 0; i < this.smartArray.size(); i++) {
            for (int j = i + 1; j < this.smartArray.size(); j++) {
                if (this.smartArray[i].equals(this.smartArray[j])) {

                }
            }
        }
    }
}
