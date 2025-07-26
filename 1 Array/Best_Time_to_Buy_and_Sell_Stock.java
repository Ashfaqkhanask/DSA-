public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[] price={7,1,5,3,6,9};
        System.out.println(maxprofit(price));
    }
    public static int maxprofit(int[] p){
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        int totalprofit=0;
        for(int i=0;i<p.length;i++){
            if(p[i]<minprice){
                minprice=p[i];
            }
            else if(p[i]-minprice>maxprofit){
                maxprofit=p[i]-minprice;
                minprice=p[i];
                totalprofit+=maxprofit;
                maxprofit=0;
            }
        }
        System.out.print("Total Profit is : ");
        return totalprofit;
    }
}