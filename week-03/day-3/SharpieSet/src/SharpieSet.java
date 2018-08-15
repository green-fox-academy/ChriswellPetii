import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> listOfSharpies = new ArrayList<>();

    void countUsable(Sharpie sharpie) {
        if (sharpie.inkAmount != 0) {
            System.out.println("Usable");
        } else System.out.println("Unusable");
    }

    void removeTrash(Sharpie sharpie) {
        for (int i = 0; i < listOfSharpies.size(); i++) {
            if (listOfSharpies.get(i).inkAmount == 0) {
                listOfSharpies.remove(i);
            }

        }

    }

}
