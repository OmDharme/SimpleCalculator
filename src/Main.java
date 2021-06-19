import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        sc.close();
        List<String> numbers = new LinkedList<>(Arrays.asList(expression.split("\\+|-| |\\*|/| ")));
        List<String> operators = new LinkedList<>(Arrays.asList(expression.split("1|2|3|4|5|6|7|8|9|0| ")));

        for(int i=0; i<operators.size(); i++){
            if(operators.get(i).equals("")){
                operators.remove(i);
                i--;
            }
        }
        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i).equals("")){
                numbers.remove(i);
                i--;
            }
        }

        while(true){
            double num1 = Double.parseDouble(numbers.get(0));
            double num2 = Double.parseDouble(numbers.get(1));
            switch (operators.get(0)) {
                case "+":
                    double add = num1 + num2;
                    operators.remove(0);
                    numbers.remove(0);
                    numbers.remove(0);
                    numbers.add(0, Double.toString(add));
                    break;
                case "-":
                    double subtract = num1 - num2;
                    operators.remove(0);
                    numbers.remove(0);
                    numbers.remove(0);
                    numbers.add(0, Double.toString(subtract));
                    break;
                case "*":
                    double multiply = num1 * num2;
                    operators.remove(0);
                    numbers.remove(0);
                    numbers.remove(0);
                    numbers.add(0, Double.toString(multiply));
                    break;
                case "/":
                    double divide = num1 / num2;
                    operators.remove(0);
                    numbers.remove(0);
                    numbers.remove(0);
                    numbers.add(0, Double.toString(divide));
                    break;
            }

            if(numbers.size()==1 && operators.size()==0){
                System.out.println(numbers.get(0));
                break;
            }

        }

    }

}
