public class myQueue implements LimitedSpaceDataStructure {
    public Object[] storage = new Object[100];
    public int putIndex = 0;
    public int getIndex = 0;
    public int amountContained = 0;

    synchronized public boolean put(Object obj) {
        if (amountContained == 100) {
            return false;
        }
        storage[putIndex] = obj;
        putIndex = (putIndex + 1) % 100;
        amountContained++;
        notify();
        return true;
    }

    synchronized public Object get() {
        if (amountContained == 0) {
            return "Empty";
        }
        Object obj = storage[getIndex];
        storage[getIndex] = null;
        getIndex = (getIndex + 1) % 100;
        amountContained--;
        notify();
        return obj;
    }
}