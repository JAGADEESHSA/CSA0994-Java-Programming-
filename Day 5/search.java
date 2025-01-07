public class search {
    public static void main(String[] ar)
    {
        int [] arr={1,3,5,6,7,8,12};
        int target=10;
        boolean found = false;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==target)
            {
                System.out.println("element is found at index:"+(i+1));
                found=true;
            }
        }
        if(found != true) {
        System.out.println("element is not found");
    }
    }
}
