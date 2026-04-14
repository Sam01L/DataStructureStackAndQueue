public class myQueue implements LimitedSpaceDataStructure {

    public Object[] storage = new Object[100];
    public int putIndex = 0;
    public int getIndex = 0;
    public int amountContained = 0;

    public boolean put(Object obj) {
        if (amountContained == 100) {
            return false;
        }
        storage[putIndex] = obj;
        if (putIndex < 100) {
            putIndex = putIndex + 1;
        } else {
            putIndex = 0;
        }

        amountContained = amountContained + 1;
        return true;
    }

    public Object get() {
        if (amountContained == 0) {
            return "Empty";
        }
        Object obj = storage[getIndex];
        storage[getIndex] = null;
        if (getIndex < 100) {
            getIndex = getIndex + 1;
        } else {
            getIndex = 0;
        }
        amountContained --;
        return obj;
    }
}
