package geekbrains.homeworks.homework4;

import java.util.List;

public class Calculator {
    public Double sum(List<? extends Number> numbers) {
        Double result = 0.;

        for (Number number : numbers) {
            result += number.doubleValue();
        }

        return result;
    }
}
