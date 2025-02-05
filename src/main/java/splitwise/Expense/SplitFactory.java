package splitwise.Expense;


import splitwise.Expense.Split.EqualExpenseSplit;
import splitwise.Expense.Split.ExpenseSplit;
import splitwise.Expense.Split.PercentageExpenseSplit;
import splitwise.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }
}
