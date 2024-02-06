class MedianOfTwoSortedArray{

	/**
	 * T.C O(max(arr1.length,arr2.length))->O(max(n1,n2))
	 * */
	public static double medianOfSortedArray(int[] arr1,int[] arr2){
		int start1=0;
		int start2=0;
		int[] result=new int[arr1.length+arr2.length];
		int i=0;
		while(start1<arr1.length && start2<arr2.length){
			if(arr1[start1]<=arr2[start2]){
				result[i]=arr1[start1];
				start1++;
			}
			else{
				result[i]=arr2[start2];
				start2++;
			}
			i++;
		}
		while(start1<arr1.length){
			result[i]=arr1[start1];
			start1++;
			i++;
		}
		while(start2<arr2.length){
			result[i]=arr2[start2];
			start2++;
			i++;
		}

		if(result.length%2==1){
			return result[result.length/2];
		}
		else{
			int mid=result.length/2;
			return (result[mid]+result[mid-1])/2d;
		}
	}

	/**
	 * 2-approach
	 * T.C O(log(arr1.length))->O(log(n1))
	 * */
	public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int start=0;
        int end=arr1.length;
        if(arr1.length>arr2.length){
            return findMedianSortedArrays(arr2,arr1);
        }
        while(start<=end){
            int mid1=start+(end-start)/2;
            int mid2=(arr1.length+arr2.length+1)/2-mid1;

            int min1=(mid1==arr1.length)?Integer.MAX_VALUE:arr1[mid1];
            int max1=(mid1==0)?Integer.MIN_VALUE:arr1[mid1-1];

            int min2=(mid2==arr2.length)?Integer.MAX_VALUE:arr2[mid2];
            int max2=(mid2==0)?Integer.MIN_VALUE:arr2[mid2-1];
            if(min1>=max2 && min2>=max1){
                if((arr1.length+arr2.length)%2==0){
                    return ((double)Math.min(min1,min2)+Math.max(max1,max2))/2;
                }
                else{
                    return (double)Math.max(max1,max2);
                }
            }
            else if(max1>min2){
                end=mid1-1;
            }
            else{
                start=mid1+1;
            }

        }
        return -1L;
    }   

	
	public static void main(String[] args) {
		int[] arr1={10,20,30};
		int[] arr2={5,15,26};
		double result=medianOfSortedArray(arr1,arr2);
		System.out.println(result);
	}
}