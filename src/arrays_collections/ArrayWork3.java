public class ArrayWork3 {
    public static void main(String[] args) {
        int[] prices ={10,20,30,400,500};

        int total = 0;

        //loop
        for(int i=0;i<prices.length;i++){
            total = total + prices[i];

        }
        System.out.println("Total is " + total);

        double avg = total/prices.length;
        System.out.println("Average is " + avg);

    }
}
