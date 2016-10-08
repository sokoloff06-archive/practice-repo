package Ex4;

import java.util.Scanner;

public class GuessWhat {
	public static void main(String[] args) {
		// prog — число созданное программой
		// user — число введённое пользователем
		// tries - число попыток
		int prog, user, tries;
		tries = 0;
		// Генерируем случайное целое число от 1 до 10
		do 
			{
			prog = (int) (Math.random() * 20) - 10;
			}
		while (prog == 0);
		System.out.println("Я загадала число от -10 до 10, отгадайте его.");
		System.out.print("Вводите ваше число: ");
		Scanner input = new Scanner(System.in);
		// Проверяем, есть ли в потоке ввода целое число
		if (input.hasNextInt()) {
			do {
				// Читаем с потока ввода целое число
				user = input.nextInt();
				tries++;
				if (user == prog) {
					System.out.println("Вы угадали c " + tries + " раза!");					
				} else {
					// Проверяем, входит ли число в отрезок [1;10]
					if (user > -10 && user <= 10) {
						System.out.print("Вы не угадали! ");
						// Если число загаданное программой меньше...
					if (user == 0){
						System.out.println("0 не может быть загадан. Попробуйте другое число");
					}
						if (prog < user) {
							System.out.println("Моё число меньше.");
						} else {
							System.out.println("Моё число больше.");
						}
						if (user > 0 && prog < 0){
							System.out.println("Вы ввели положительное число, а загадано отрицательное");
						}
						else if (user < 0 && prog > 0){
							System.out.println("Вы ввели отрицательное число, а загадано положительное");
						}
					} else {
						System.out.println("Ваше число вообще не из нужного отрезка!");
					}
				}
			} while (user != prog);
		} else {
			System.out.println("Ошибка. Вы не ввели целое число!");
		}
		System.out.println("До свидания!");
	}
}
