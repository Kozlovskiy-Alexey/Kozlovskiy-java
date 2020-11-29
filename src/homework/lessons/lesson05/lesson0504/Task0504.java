package homework.lessons.lesson05.lesson0504;

import javax.management.openmbean.TabularType;

/*Создать метод, который принимает массив строк и целое число.
Вывести на консоль только те строки, в которых длина больше или равна
второму параметру метода.
 */
public class Task0504 {
    public static void main(String[] args) {
        TransformerString transformer = new TransformerString();
        String[] strings = new String[]{"Name", "Address", "Phone", "Id"};
        String[] strings1 = new String[4];
        strings1[0] = "I";
        strings1[1] = "am";
        strings1[2] = "learning";
        strings1[3] = "java";

        transformer.getStringTransform(strings, 5);
        System.out.println();
        transformer.getStringTransform(strings1,4);

    }
}
