import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        String [][]c1 = new String[3][4];
        String [][]c2 = new String[2][3];

        System.out.println("Do you prefer choice 1 or 2? ");
        int choice = rd.nextInt();

        try{
            switch (choice) {
                case 1:
                
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.println("Please input the [" + i + "][" + j + "] number: ");
                            int num = rd.nextInt();
                            c1[i][j] = String.valueOf(num);
                        }
                    }
                    System.out.println("Choice no 1:");
                    for (int i = 0; i < c1.length; i++) {
                        for (int j = 0; j < c1[i].length; j++) {
                            System.out.print(c1[i][j] + " ");
                        }
                    System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.println("Please input the [" + i + "][" + j + "] number: ");
                            int ber = rd.nextInt();
                            c2[i][j] = String.valueOf(ber);
                        }
                    }
                    System.out.println("Choice no 2:");
                    for (int i = 0; i < c1.length; i++) {
                        for (int j = 0; j < c1[i].length; j++) {
                            System.out.print(c2[i][j] + " ");
                            }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Please input the correct number");
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        }

        rd.close();
    }
}

