import java.util.Scanner;

public class AutoCapitalization {
    public static String skipWhitespace(Scanner s) {
        while (s.hasNext()) {
            String c = s.next();
            if (c.equals(" ") || c.equals("\t") || c.equals("\n"))
                System.out.print(c);
            else
                return c;
        }
        return null;
    }

    public static void main(String[] args) {
        boolean needsToUpper = true;
        java.util.Scanner s = new Scanner(System.in);
        s.useDelimiter("");

        while (true) {
            String c = skipWhitespace(s);
            if (c == null)
                break;

            if (needsToUpper)
                System.out.print(c.toUpperCase());
            else
                System.out.print(c);

            if (c.equals(".") || c.equals("?") || c.equals("!"))
                needsToUpper = true;
            else
                needsToUpper = false;
        }

        s.close();
    }
}
