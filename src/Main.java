public class Main {
    public static void main(String[] args) {

        // Задание №1
        System.out.println("Задание №1");
        for ( int i=1; i<=10; i++){
            System.out.println("число="+i);}

        // Задание №2
        System.out.println("Задание №2");
        for ( int i=10; i>=1; i--){
            System.out.println("число="+i);}

        // Задание №3
        System.out.println("Задание №3");
        for ( int i=0; i<=17; i=i+2){
            System.out.println("Четные числа="+i);}

        // Задание №4
        System.out.println("Задание №4");
        for ( int i=10; i>=-10; i=i-1){
            System.out.println("Четные числа="+i);}

        // Задание №2.1
        System.out.println("Задание №2.1");
        for ( int year=1094; year<=2096; year++){
            if (year % 4 ==0 && year % 100 !=0 || year % 400 ==0){
            System.out.println("Год является високосным="+year);}}

        // Задание №2.2
        System.out.println("Задание №2.1");
        for ( int i=7; i<=98; i=i+7){
            System.out.print(" "+i);}

        // Задание №2.3
        System.out.println("Задание №2.3");
        for ( int i=1; i<=512; i=i*2){
            System.out.print(" "+i);}

        // Задание №3.1
        System.out.println("Задание №3.1");
        int total=29000;
        int summ=0;
        for ( int i=1; i<=12; i++){
            summ+=total;
        System.out.println("Суммагодовых накоплений за "+i+" месяц равна = "+summ);}

        // Задание №3.2
        System.out.println("Задание №3.2");
        double sumwithpersent=0;
        double persent=total/100*12;
        for ( int i=1; i<=12; i++){
            sumwithpersent=(sumwithpersent+total)*(1+persent);
            System.out.println("Суммагодовых накоплений за "+i+" месяц равна = "+persent);}









    }
}