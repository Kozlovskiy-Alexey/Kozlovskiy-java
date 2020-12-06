package homework.lessons.lesson05.lesson0504;

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
        int[] numbers = new int[]{5, 6, 8, 6, 2, 4, 1};

        StringBuffer stringBuffer = new StringBuffer("Hello world!");
        System.out.println(stringBuffer.capacity());
        stringBuffer.ensureCapacity(100);
        System.out.println(stringBuffer.capacity());
        String str = "Capacity";
        StringBuffer stringBuffer1 = new StringBuffer(str);
        System.out.println(stringBuffer1.toString());
        char c = stringBuffer.charAt(0);
        System.out.println(c);
        stringBuffer.setCharAt(0, 'h');
        System.out.println(stringBuffer.toString());
        stringBuffer.append(" everything is awesome");
        System.out.println(stringBuffer.toString());
        stringBuffer.insert(5, '!');
        System.out.println(stringBuffer.toString());
        System.out.println();
        System.out.println(stringBuffer.reverse());


        transformer.getStringTransform(strings, 5);
        System.out.println();
        transformer.getStringTransform(strings1, 4);
        System.out.println();
        System.out.println(transformer.sumArray(numbers));

//        Recursion rec = new Recursion();
//        int recursion = rec.fac(4);
//        System.out.println(recursion);
    }

}