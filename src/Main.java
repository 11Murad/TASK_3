import java.util.Scanner;
//mesele 8892

/*
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 != 0 || n > 99) {
            System.out.println("YES");
        } else
            System.out.println("NO");
    }
}*/

////mesele 8884
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt(); int b = scan.nextInt(); int c = scan.nextInt();
//if (a==b && b==c){
//    System.out.println("equilateral");}
//else if (a==b || b==c) {
//    System.out.println("isosceles");}
//else if (a!=b && a!=c && c!=b){
//    System.out.println("versatile");}
//else System.out.println("invalid");
//    }
//    }

//mesele-1
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int number = in.nextInt();
//        if (number > 10&&number < 99) {
//            int d = number / 10;
//            int q = number % 10;
//            System.out.printf(d + " " + q);
//        }
//    }
//}
/* mesele-8840
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = n%10;
        System.out.print(d);
    }
} */

////Mesele - 8886
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        if (n % 2 == 0) {
//            n = n - 2;
//            System.out.println(n);
//        } else if (!(n % 2 == 0)) {
//            n = n - 1;
//            System.out.println(n);
//        } else System.out.println("Sistem Xetası");
//    }
//    }

////Mesele - 8887
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        if (n % 2 == 0) {
//            n = n + 1;
//            System.out.println(n);
//        } else if (!(n % 2 == 0)) {
//            n = n + 2;
//            System.out.println(n);
//        } else System.out.println("Sistem Xetası");
//    }
//}

//// MESELE - 8888
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        if (n % 2 == 0) {
//            n = n + 2;
//            System.out.println(n);
//        } else if (!(n % 2 == 0)) {
//            n = n + 1;
//            System.out.println(n);
//        } else System.out.println("Sistem Xetası");
//    }
//}

//MESELE - 8895

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a > 0 && b > 0 && c < 0)
        System.out.println("YES");
        else if (a > 0 && b < 0 && c > 0)
        System.out.println("YES");
        else if (a < 0 && b > 0 && c > 0)
        System.out.println("YES");
        else if (a < 0 && b < 0 && c > 0)
        System.out.println("YES");
        else if (a > 0 && b < 0 && c < 0)
        System.out.println("YES");
        else System.out.println("Sistem Xetası");
    }
}