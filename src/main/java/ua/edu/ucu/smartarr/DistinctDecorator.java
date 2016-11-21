package ua.edu.ucu.smartarr;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator{
    Object[] arr;
    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        Object arr[] = this.smartArray.toArray();
        int size = this.smartArray.size();
        for (int i = 0; i < this.smartArray.size(); i++) {
            for (int j = i + 1; j < this.smartArray.size(); j++) {
                if (arr[i].equals(arr[j])) {
                    arr[j] = null;
                    size -= 1;
                }
            }
        }
        Object newArr[] = new Object[size];
        int j = 0;
        for (int i = 0; i < this.smartArray.size(); i++){
            if(arr[i]!= null){
                newArr[j] = arr[i];
                j += 1;
            }
        }
        this.arr = newArr;
        SmartArray newSmartArray = new BaseArray(newArr);
        this.smartArray = newSmartArray;
    }

    @Override
    public Object[] toArray() {
        return this.arr;
    }

    @Override
    public int size() {
        return this.arr.length;
    }
}
