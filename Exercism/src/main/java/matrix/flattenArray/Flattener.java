package matrix.flattenArray;

import java.util.ArrayList;
import java.util.List;

public class Flattener {
    public List<Object> flatten(List<Object> list) {
        ArrayList<Object> result = new ArrayList<>();
        for (Object item : list) {
            if (item instanceof List){
               result.addAll(flatten((List<Object>) item));
            }else if (item != null){
                result.add(item);
            }
        }
        return result;
    }
}
