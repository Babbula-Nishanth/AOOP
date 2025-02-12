 class GenericBubble <T extends Comparable<T>> {
    public T[] bs(T[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    T swap = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
        return arr;
    }
}
