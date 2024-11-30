public class Activity5 {
    public static void main(String[] args) {
        int counter =1;
        while(counter>0){
            if(counter==26){
                break;
            }
            if(counter==14){
                counter++;
                continue;
            }
            System.out.println("Counter: "+counter);
                counter++;
        }
    }
}
