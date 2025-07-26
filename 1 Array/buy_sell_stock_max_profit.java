public class buy_sell_stock_max_profit {
    public static void main(String[] args) {
        int[] prices={};
        System.out.println(max_profit(prices));
    }//         METHOD 1
    public static int max_profit(int[] p){
        if (p == null || p.length == 0) return 0;
        int maxprofit=0;
        int minprice=Integer.MAX_VALUE;
        for(int i=0;i<p.length;i++){
            if(p[i]<minprice){
                minprice=p[i];
            }
            else if(p[i]-minprice>maxprofit){
                maxprofit=p[i]-minprice;
            }
        }
        //          METHOD 2 (MY METHOD)

        // int n=p.length;
        // int l=0;
        // int r=n-1;
        // int cmin=p[0];
        // int cmax=p[n-1];
        // int lmin=0;
        // int rmax=n-1;
        // for(int i=0;i<p.length;i++){//      {7,1,5,3,6,4};
        //     if(p[l]<=cmin){
        //         lmin=l;
        //         if(lmin<rmax){
        //             cmin=p[l];}
        //     }
        //     if(p[r]>=cmax){
        //         rmax=r;
        //         if(lmin<rmax){
        //             cmax=p[r];
        //         }
        //     }
        //     l++;
        //     r--;
        // }
        // maxprofit=cmax-cmin;
        System.out.print("max profit is : ");
        if(maxprofit<=0){
            return 0;
        }
        else{

        return maxprofit;
        }
    }
}