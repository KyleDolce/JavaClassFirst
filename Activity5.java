public class Activity5 {
    public static void main(String[] args) {
        int counter =1;
        while(counter>0){
            if(counter==26){
                break;
            } else if(counter==14){
                continue;
            } else {
                System.out.println("Counter: "+counter);
                counter++;
            }
        }
    }
}
