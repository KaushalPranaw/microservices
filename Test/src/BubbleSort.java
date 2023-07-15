public class BubbleSort {
    public static void main(String[] args) {
        int a[]={1,4,3,2,6};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                   int t=a[i];
                   a[i]=a[j];
                   a[j]=t;
                }
            }
        }
        for(int i:a)
            System.out.println(i);
    }
}
