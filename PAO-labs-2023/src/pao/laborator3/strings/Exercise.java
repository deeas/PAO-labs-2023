package pao.laborator3.strings;

public class Exercise {
    public static void main(String[] args) {
        String s1 = "this is a string";
        String s2 = new String("this is another string");

        s1.toUpperCase();

        System.out.println(s1);

        System.out.println(s2.length());
        System.out.println(s1.charAt(2));

        String[] strings = s1.split(" ");

        for (String string : strings) {
            System.out.println(string);
        }

        String substring = s1.substring(2, 7);
        System.out.println(substring);

        StringBuilder sb1 = new StringBuilder("Java");
        String sbToString = sb1.toString();

        String s3 = " Love";
        sb1.append(s3);
        System.out.println(sb1);

        System.out.println(sb1.reverse().toString());

        sb1.substring(4);
        int foundAt = sb1.indexOf(s3);
        System.out.println(foundAt);
    }
}
