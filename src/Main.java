public class Main {
    public static void main(String[] args) {

        System.out.println("Hello JavaDeveloper! It`s time to create.");
        System.out.println("Go!");
        //task1
        for (int i = 1; i < 11; i = i + 1) {
            System.out.println("Следующее значение " + i);
        }
        System.out.println("***end of task 1***");


        //task2
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println("Следующее значение " + i);
        }
        System.out.println("***end of task 2***");

        //task3
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Следующее значение " + i);
        }
        System.out.println("***end of task 3***");

        //task4
        for (int i = 10; i > (-10); i = i - 1) {
            System.out.println("Следующее значение " + i);
        }
        System.out.println("***end of task 4***");

        //task5
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("***end of task 5***");

        //task 6
        for (int l = 7; l <= 98; l = l + 7) {
            System.out.println("Число последовательности " + l);}
        System.out.println("***end of task 6***");

        //task 7
        for (int i=1;i<=256;i=i*2){
            System.out.println("Число последовательности "+ i);}
        System.out.println("***end of task 7***");


        //task 8

        int siquence=12;//инициализировал длину последовательности
        int sum=0;
        for(int i=0;i<siquence;i++){
            sum+=i+29000;//29000 накопления за месяц
            System.out.println("Сумма накоплений в этот месяц равна "+sum+" рублей");}
        System.out.println("***end of task8***");

        //task 9
        int siquence2=12;//инициализировал длину последовательности
        double total=0;
        for(int i=0;i<siquence;i++){
            total+=i+29000+(29000/100);//29000+1% в месяц накопления за месяц
            System.out.println("Сумма накоплений в этот месяц равна "+total+" рублей");}
        System.out.println("***end of task9***");

        //task 10
        for (int i=1;i<=10;i++){
            System.out.println("2*"+i+"="+2*i);}
        System.out.println("***end of task 10***");

    }
}