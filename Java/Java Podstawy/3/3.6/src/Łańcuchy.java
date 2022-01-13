public class Łańcuchy {
    public static void main(String[] arg) {
        String e = "";
        String greeting = "Cześć!";

        String s = greeting.substring(0, 3);

        String expletive = "brzydkie słowo";
        String PG13 = " usunięto";
        String message = expletive + PG13;
        System.out.println(message);

        int age = 13;
        String rating = "PG" + age;
        System.out.println(rating);

        String all = String.join(" / ", "M", "S", "D", "X");
        System.out.println(all);

        String repeated = "Java".repeat(3);
        System.out.println(repeated);

        greeting = greeting.substring(0, 3) + "kaj";
        System.out.println(greeting);


        System.out.println(s.equals(greeting));
        System.out.println("Cześć".equals(greeting));

        greeting = "Cześć!  ";
        int n = greeting.length();

        int cpCount = greeting.codePointCount(0, greeting.length());
        System.out.println(n);
        System.out.println(cpCount);

        int index = greeting.offsetByCodePoints(0, 6);
        int cp = greeting.codePointAt(index);
        System.out.println(index);
        System.out.println(cp);

        System.out.println(greeting.charAt(3));
        System.out.println(greeting.codePointAt(3));
        System.out.println(greeting.codePointAt(0));
        System.out.println(greeting.offsetByCodePoints(3,5));
        System.out.println(greeting.compareTo(repeated));

        String ch = "coś";
        String str = " co można zjeść";
        StringBuilder builder = new StringBuilder();
        builder.append(ch);
        builder.append(str);

        String completedString = builder.toString();
        System.out.println(completedString);
        
    }
}
