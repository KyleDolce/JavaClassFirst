import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        String [][]c1=new String[3][4];
        String [][]c2=new String[2][3];

        System.out.println("Do you prefer choice 1 or 2? ");
        int choice = rd.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j=0; j<4; j++){
                        System.out.println("Please input the [" +i+"]["+j+"] number: " );
                        int num = rd.nextInt();
                        c1[i][j]= String.valueOf(num);
                    }
                    
                }
                for (int x = 0; x < 2; x++) {
                    for (int y=0; y<3; y++){
                        String num =  null;
                        c2[x][y]= String.valueOf(num);
                    }
                }
                break;
            case 2:
                for (int i = 0; i < 2; i++) {
                    for (int j=0; j<3; j++){
                        System.out.println("Please input the [" +i+"]["+j+"] number: " );
                        int num = rd.nextInt();
                        c1[i][j]= String.valueOf(num);
                    }
                }

                for (int x = 0; x < 3; x++) {
                    for (int y=0; y<4; y++){
                        String num =  null;
                        c1[x][y]= String.valueOf(num);
                    }
                }
                break;
            default:
                System.out.println("Please input the correct number");
                break;
            }
            System.out.println("Choice no 1:");
            for (int i = 0; i < c1.length; i++) {
                for (int j = 0; j < c1[i].length; j++) {
                    System.out.print(c1[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Choice no 2:");
            for (int i = 0; i < c2.length; i++) {
                for (int j = 0; j < c2[i].length; j++) {
                    System.out.print(c2[i][j] + " ");
                }
                System.out.println();
            }
            rd.close();
        }
    }

