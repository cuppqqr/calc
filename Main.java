import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static String calc(String str) throws Exception {
        int a =0;
        int b =0;
        int result = 0;



        String[]arr=str.split(" ");
        if(arr.length!=3){
            throw new Exception();
        }

        try{
            a=Integer.parseInt(arr[0]);
            b=Integer.parseInt(arr[2]);


        }catch (NumberFormatException e){
            throw new IllegalArgumentException("Ошибка:вы ввели не число");
        }

        switch (arr[1]){
            case "+":
                result=a+b;
                break;
            case "-":
                result=a-b;
                break;
            case "*":
                result=a*b;
                break;
            case "/":
                if(b==0){
                    throw new ArithmeticException("Нельзя делить на 0");
                }
                result=a/b;
                break;
            default:
                throw new IllegalArgumentException("некорректный знак");
        }
        if(a<1||b<1||a>10||b>10){
            throw new IllegalArgumentException("Число больше 10!!");
        }














        return "Результат: "+result;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Введите арефметическое выражение (числа не должны быть больше 10)");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
            if (str.trim().isEmpty() ||str.length()<3) {
                throw new IllegalArgumentException("Ошибка: не является математической операцией");
            }
        String[] arr = str.split(" ");
        if (arr.length > 3) {
            throw new IllegalArgumentException("Ошибка: Формат математической операции не удовлетворяет заданию - два операнда и один оператор.");
        }

        System.out.println(calc(str));


    }
}