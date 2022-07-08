package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

    // ��� ����� ������ ������ � ����� ���������� ������ ����� �����.
    // �� ���� ���, ��� �������� ��� ����� ������� "???"
    // ��� �� �������� ��� ����������� �������� ���-�� � 
    // ���� import � �������� ��� ������
    // � ��������� ������ ����� ����� ��� ������ �� �����������.

public final class ActiveCat {
    private static final Random r = new Random();
    private static final List<String> names = List.of("Peach", "Ginger", "Toby", "Seth", "Tibbles", "Tabby", "Poppy", "Millie", "Daisy", "Jasper", "Misty", "Minka");
    private final String name;
    
    private final Actionable action;

    public ActiveCat(Actionable action) {
        name = names.get(r.nextInt(names.size()));
        this.action = action;
    }

    public final String getName() {
        return name;
    }
    
    public void doAction() {
        System.out.printf("� %s. %s%n", name, action.perform());
    }

    /*****/
    // �������� ��������� ��� �����

    public static String jump() {
        return "� ������!";
    }

    public static String sleep() {
        return "� ����!";
    }

    public static String eat() {
        return "� �����!";
    }
    /*****/
}
interface Actionable {

    Object perform();
}
