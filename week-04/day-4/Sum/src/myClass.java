import java.util.ArrayList;
import java.util.List;

public class myClass {
    protected List<Integer> integerList = new ArrayList<>();

    int sum() {
        int sum = 0;
        for (Integer anIntegerList : integerList) {
            sum += anIntegerList;
        }
        return sum;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void listFiller() {
        integerList.add(5);
        integerList.add(2);
        integerList.add(3);

    }
}
