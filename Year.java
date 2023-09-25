import java.util.Scanner;

public class Year {
    public static void main(String[] args) {{
        int year;
        int century;
        Scanner sc = new Scanner(System.in);
        System.out.println("What year?");
year = sc.nextInt();

century = (((int) year/100)+1);
System.out.println("centry " + century);
    }
}
}