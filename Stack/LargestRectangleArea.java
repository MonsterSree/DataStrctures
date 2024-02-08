import java.util.Stack;
class LargestRectangleArea {
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> nextSmaller=new Stack<>();
        int[] nextSmallerArr=new int[heights.length];
        int nextSmallerPos=heights.length-1;
        nextSmaller.push(heights.length-1);
        nextSmallerArr[nextSmallerPos--]=heights.length;
        for(int i=heights.length-2;i>=0;i--){
            while(!nextSmaller.isEmpty() && heights[nextSmaller.peek()]>=heights[i]){
                nextSmaller.pop();
            }
            int val=nextSmaller.isEmpty()?heights.length:nextSmaller.peek();
            nextSmallerArr[nextSmallerPos--]=val;
            nextSmaller.push(i);
        }
        Stack<Integer> prevSmaller=new Stack<>();
        int[] prevSmallerArr=new int[heights.length];
        prevSmaller.push(0);
        int prevSmallerPos=0;
        prevSmallerArr[prevSmallerPos++]=-1;
        for(int j=1;j<heights.length;j++){
            while(!prevSmaller.isEmpty() && heights[prevSmaller.peek()]>=heights[j]){
                prevSmaller.pop();
            }
            int val=prevSmaller.isEmpty()?-1:prevSmaller.peek();
            prevSmallerArr[prevSmallerPos++]=val;
            prevSmaller.push(j);
        }
        int maxArea=Integer.MIN_VALUE;
        for(int k=0;k<heights.length;k++){
            maxArea=Math.max(maxArea,(nextSmallerArr[k]-prevSmallerArr[k]-1)*heights[k]);
        }
        return maxArea;
       
    }

    public static void main(String[] args) {
        int[] arr={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
}