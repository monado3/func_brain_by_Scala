package chap03.program03;

public class SideEffectsTest {
    public static int globalValue = 100;

    public int doubleGlobalValue() {
        return globalValue * 2;
    }

    public int doubleLocalValue() {
        int[] localValue = new int[1];
        localValue[0] = 100;
        // some processing
        return localValue[0] * 2;
    }
}
