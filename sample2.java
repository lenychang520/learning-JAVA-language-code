//package com.leny.text;
//
//import java.util.Scanner;
//
//public class sample2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        int hours = input / 3600;
//        int minutes = input % 3600 / 60;
//        int seconds = input % 60;
//        System.out.println(hours + " " + minutes + " " + seconds);
//    }
//}


//package com.leny.text;
//
//import java.util.Scanner;
//
//public class sample2 {
//    public static void main(String[] args) {
//        double pai = 3.14;
//        Scanner sc = new Scanner(System.in);
//        int h = sc.nextInt();
//        int r = sc.nextInt();
//        int count = (int)Math.ceil((double)20000 / (pai * r * r * h));
//        System.out.println(count);
//    }
//}


//package com.leny.text;
//
//import java.util.Scanner;
//
//public class sample2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long num1 = sc.nextInt();
//        long num2 = sc.nextInt();
//        long sum = num1 * num2;
//        System.out.println(sum);
//    }
//}


//package com.leny.text;
//
//import java.util.Scanner;
//
//public class sample2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char input = sc.next().charAt(0);
//        System.out.println((char)(input + 32));
//    }
//}


//package com.leny.text;
//
//import java.util.Scanner;
//
//public class sample2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        if (num > 1 & num < 10) {
//            System.out.println("该数在1~10之间");
//        } else {
//            System.out.println("该数不在1~10之间");
//        }
//    }
//}
//
//
//
//package com.leny.text;
//
//import java.util.Scanner;
//
//public class sample2 {
//    public static void main(String[] args) {
//        System.out.println("请输入一个四位的整数");
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        if (s.charAt(0) == s.charAt(3) && s.charAt(1) == s.charAt(2)) {
//            System.out.println("这个数是回文数");
//        } else {
//            System.out.println("这个数不是回文数");
//        }
//    }
//}
//
//
//package com.leny.text;
//
//import java.util.Scanner;
//
//public class sample2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int bai = num / 10;
//        int ge = num % 10;
//        if (bai % 7 == 0 || ge % 7 == 0) {
//            System.out.println("该数是7的有缘数");
//        } else {
//            System.out.println("该数不是7的有缘数");
//        }
//    }
//}
//
//
//package com.leny.text;
//
//import java.util.Scanner;
//
//public class sample2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入受到的伤害数");
//        int initial_hp = 200;
//        int x = sc.nextInt();
//        System.out.println("请输入技能恢复的血量数");
//        int y = sc.nextInt();
//        int left = 200 - x + y;
//        if (left >= 1) {
//            System.out.println("剩余HP为：" + left);
//        } else {
//            System.out.println("剩余HP为：1");
//        }
//    }
//}


//package com.leny.text;
//
//import java.util.Scanner;
//
//public class sample2 {
//    public static void main(String[] args) {
//        System.out.println("请输入星期几（用数字表示）");
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("跑步");
//                break;
//            case 2:
//                System.out.println("游泳");
//                break;
//            case 3:
//                System.out.println("慢走");
//                break;
//            case 4:
//                System.out.println("动感单车");
//                break;
//            case 5:
//                System.out.println("拳击");
//                break;
//            case 6:
//                System.out.println("爬山");
//                break;
//            case 7:
//                System.out.println("好好吃一顿");
//                break;
//            default:
//                System.out.println("请输入正确的数字");
//                break;
//        }
//    }
//}


