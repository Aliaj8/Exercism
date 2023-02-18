package matrix.saddlePoint;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Matrix {
    private Set<MatrixCoordinate> set =new HashSet<>();
    private final List<MatrixCoordinate> list = new ArrayList<>();
    private final List<List<Integer>> values;
    public Matrix(List<List<Integer>> values) {
        this.values=values;
    }

    public Set<MatrixCoordinate> getSaddlePoints() {
        int row=1;
        for (List<Integer> line : values) {
            int rowMax = line.get(0);
            int colIndex = 0;
            for (Integer number : line) {
                if (number > rowMax) {
                    rowMax = number;
                }
            }
            for (int j = 0; j < line.size(); j++) {
                if (line.get(j)==rowMax){
                    colIndex=j;
                    isSaddlePoint(row,colIndex,rowMax);
                }
            }
            row++;
        }
        return set;
    }
    public void isSaddlePoint (int row,int colIndex,int rowMax){
        boolean saddlePoint =true;
        for (List<Integer> value : values) {
            if (value.get(colIndex) < rowMax) {
                saddlePoint = false;
                break;
            }
        }
        if (saddlePoint){
            list.add(new MatrixCoordinate(row,colIndex+1));
            set=new HashSet<>(list);
        }
    }
}
