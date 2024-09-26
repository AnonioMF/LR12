import java.util.Scanner; // Используем библиотеку Сканер
public class Main // Обьявляем основной класс
{
    public static void main(String args[]) // Основной метод класса
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числаааа для проверки:");

        int num=in.nextInt(); // передаем значение переменной из системы
        in.close(); // Закрываем ввод данных
        int temp;
        boolean isPrime=true;

        for (int i=2; i<=num/2; i++)
        {
            temp = num % i;
            if (temp == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(num + " - простое число");
        } else
        {
            System.out.println(num + " - составное число");
        }
    }
}