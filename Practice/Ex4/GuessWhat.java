package Ex4;

import java.util.Scanner;

public class GuessWhat {
	public static void main(String[] args) {
		// prog � ����� ��������� ����������
		// user � ����� �������� �������������
		// tries - ����� �������
		int prog, user, tries;
		tries = 0;
		// ���������� ��������� ����� ����� �� 1 �� 10
		do 
			{
			prog = (int) (Math.random() * 20) - 10;
			}
		while (prog == 0);
		System.out.println("� �������� ����� �� -10 �� 10, ��������� ���.");
		System.out.print("������� ���� �����: ");
		Scanner input = new Scanner(System.in);
		// ���������, ���� �� � ������ ����� ����� �����
		if (input.hasNextInt()) {
			do {
				// ������ � ������ ����� ����� �����
				user = input.nextInt();
				tries++;
				if (user == prog) {
					System.out.println("�� ������� c " + tries + " ����!");					
				} else {
					// ���������, ������ �� ����� � ������� [1;10]
					if (user > -10 && user <= 10) {
						System.out.print("�� �� �������! ");
						// ���� ����� ���������� ���������� ������...
					if (user == 0){
						System.out.println("0 �� ����� ���� �������. ���������� ������ �����");
					}
						if (prog < user) {
							System.out.println("�� ����� ������.");
						} else {
							System.out.println("�� ����� ������.");
						}
						if (user > 0 && prog < 0){
							System.out.println("�� ����� ������������� �����, � �������� �������������");
						}
						else if (user < 0 && prog > 0){
							System.out.println("�� ����� ������������� �����, � �������� �������������");
						}
					} else {
						System.out.println("���� ����� ������ �� �� ������� �������!");
					}
				}
			} while (user != prog);
		} else {
			System.out.println("������. �� �� ����� ����� �����!");
		}
		System.out.println("�� ��������!");
	}
}
