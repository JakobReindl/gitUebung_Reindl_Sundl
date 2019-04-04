import java.util.ArrayList;

public class CalculatorImpl implements Calculator {
    private ArrayList<Integer> values;


    CalculatorImpl(){}
    public int sum() {
        return 0;
    }

    public int getMaximum() {
        return 0;
    }

    public int getMinimum() {
        return 0;
    }

    public ArrayList<Integer> getValues(){
        return this.values;
    }



    public void addValue(int value) {
        if(this.values == null)
            this.values = new ArrayList<Integer>();
        this.values.add(value);
    }
}
