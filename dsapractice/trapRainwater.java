public class trapRainwater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        // int l=0;
        // int r=height.length-1;
        // int lmax=0;
        // int rmax=0;
        int trappedWater=0;
        int lheight[]=new int[height.length];
        lheight[0]=height[0];
        int rheight[]=new int[height.length];
        rheight[height.length-1]=height[height.length-1];
        for (int i = 1; i < height.length; i++) {
            lheight[i]=Math.max(lheight[i-1],height[i]);
        }
        for (int i = height.length-2; i >= 0; i--) {
            rheight[i]=Math.max(rheight[i+1],height[i]);
        }
        for (int i = 0; i < rheight.length; i++) {
            trappedWater+=Math.min(rheight[i],lheight[i])-height[i];
        }
        System.out.println("Water Trapped : "+trappedWater);
    }
}
