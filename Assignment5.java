import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][]luxury=new String[5][2];
        String [][]cheap=new String[5][2];
        int luxuryIndex=0;
        int cheapIndex=0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Please input your car Price of car "+(i+1)+" :");
            double carPrice = sc.nextDouble();
            if(carPrice>=70000){
                luxury[luxuryIndex][0] = String.valueOf(carPrice);
                luxury[luxuryIndex][1] = "VIP 2024 is available for Pre-order";
                luxuryIndex++;
            }
            else{
                cheap[cheapIndex][0] = String.valueOf(carPrice);
                cheap[cheapIndex][1] = "Cheap and Old car for Sale";
                cheapIndex++;
            }
            
        }

        System.out.println("VIP Cars:");
        for (String[] i : luxury) {
            if (i[0] != null) {
                for (String j : i) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

        System.out.println("Cheap Cars:");
        for (String[] i : cheap) {
            if (i[0] != null) {
                for (String j : i) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
