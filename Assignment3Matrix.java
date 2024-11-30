public class Assignment3Matrix {
    public static void main(String[] args) {
        int[][] carModel = {{2014,2017,2023},
                            {2024,2016,2018},
                            {2021,2019,2020}};
        String[][] carName={{"Honda","Nissan","Tesla"},
                            {"Pixie","Kancil","Myvi"},
                            {"Perdua","Vista","X1"}};
        double[][] carPrice={{85500,75000,120000},
                            {49999,78000,47000},
                            {30000,45000,56000}};

        for(int i=0; i<carModel.length; i++){
            for(int j=0; j<carModel[i].length; j++){
                if(carPrice[i][j]>50000){
                    System.out.println("The car Model of that cost above RM 50000: \n" +carName[i][j]+ " - RM"+carPrice[i][j]);
                    System.out.println();
                }
            }
        }
    }
}
