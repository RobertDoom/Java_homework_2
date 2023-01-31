// 1. Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение).

public class Task_1 {
    public static void main(String args[]) {
        String myString = "2023";
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String data = buffer.toString();
        if (myString.equals(data)) {
            System.out.println("Строка является полиндромом");
        } else {
            System.out.println("Строка нe является полиндромом");
        }
    }
}