public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] mas1 = {1, 2, 3};
        System.out.println(mas1[0] + "; " + mas1[1] + "; " + mas1[2]);

//        int[] mas = new int[3];
//        mas[0] = 1;
//        mas[1] = 2;
//        mas[2] = 3;
//        System.out.println(mas[0] + "; " + mas[1] + "; " + mas[2]);
    }

    public static void task2() {
        System.out.println("Задача 1.2");
        double[] mas = new double[3];
        mas[0] = 1.57;
        mas[1] = 7.654;
        mas[2] = 9.986;
        System.out.println(mas[0] + "; " + mas[1] + "; " + mas[2]);

        double[] box = {1, 2, 6.5};
        System.out.println(box[0] + "; " + box[1] + "; " + box[2]);
    }

    public static void task3() {
        System.out.println("Задача 2");
        int oneMas[] = {2, 5, 15, 11};
        int twoMas[] = {34, 66, 33};
        //  twoMas[0] = 34;
        //twoMas[1] = 66;
        //twoMas[2] = 33;
        double treeMas[] = new double[2];
        treeMas[0] = 2;
        treeMas[1] = 0.11;
        // System.out.println(oneMas[0] + "; " + oneMas[1] + "; " + oneMas[2] + "; " + oneMas[3]);
        // System.out.println(twoMas[0] + "; " + twoMas[1] + "; " + twoMas[2]);
        // System.out.println(treeMas[0] + "; " + treeMas[1]);
        for (int i = 0; i < oneMas.length; i++) {
            System.out.print(oneMas[i]);
            if (i < oneMas.length - 1) {
                System.out.print(",");
            }

        }
        System.out.println();

        for (int j = 0; j < twoMas.length; j++) {
            System.out.print(twoMas[j]);
            if (j < twoMas.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println();
        for (int i = 0; i < treeMas.length; i++) {
            System.out.print(treeMas[i]);
            if (i < treeMas.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 3");
        int oneMas[] = {2, 5, 15, 11};
        int twoMas[] = {34, 66, 33};
        double treeMas[] = new double[2];
        treeMas[0] = 2;
        treeMas[1] = 0.11;
        for (int i = oneMas.length - 1; i >= 0; i--) {
            System.out.print(oneMas[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int j = twoMas.length - 1; j >= 0; j--) {
            System.out.print(twoMas[j]);
            if (j > 0) {
                System.out.print(",");
            }
        }

        System.out.println();
        for (int i = treeMas.length - 1; i >= 0; i--) {
            System.out.print(treeMas[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 4");
        int oneMas[] = {2, 5, 15, 11};
        for (int i = 0; i < oneMas.length; i++) {
            if ((oneMas[i]) % 2 == 1) {
                oneMas[i] = oneMas[i] + 1;
            }
            System.out.print(oneMas[i]);
            if (i < oneMas.length - 1) {
                System.out.print(",");
            }
        }
    }
}

