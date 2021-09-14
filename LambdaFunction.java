public class LambdaFunction {

    public static void main(String[] args) {

        //addition operation
        MathOperation addition = (firstNum,secondNum) ->(firstNum+secondNum);
        System.out.println("Addition : "+ addition.calculate(20,30));

        //Subtraction Operation
        MathOperation subtraction=(firstNum, secondNum) ->(firstNum-secondNum);
        System.out.println("Subtraction : "+subtraction.calculate(60,30));

        //Division Operation
        MathOperation division=(firstNum, secondNum) ->(firstNum/secondNum);
        System.out.println("Division : "+division.calculate(60,30));




    }
}
