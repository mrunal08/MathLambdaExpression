public class LambdaFunction {

    public static void main(String[] args) {

        //addition operation
        IMathOperation addition = (firstNum,secondNum) ->(firstNum+secondNum);
        System.out.println("Addition : "+ addition.calculate(20,30));

        //Subtraction Operation
        IMathOperation subtraction=(firstNum, secondNum) ->(firstNum-secondNum);
        System.out.println("Subtraction : "+subtraction.calculate(60,30));

        //Division Operation
        IMathOperation division=(firstNum, secondNum) ->(firstNum/secondNum);
        System.out.println("Division : "+division.calculate(60,30));




    }
}
