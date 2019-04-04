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
        if(this.values == null)
        return 0;
        else {
            int number = values.get(0);
            for(int i = 1; i < values.size(); i++)
                if(values.get(i) < number)
                    number = values.get(i);
                return number;
        }
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
