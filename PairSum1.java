package Array_List;
import java.util.ArrayList;
public class PairSum1 {
    public static boolean pairsum(ArrayList<Integer>list,int target){
        //finds all the pairs
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                //it finds wether pairs sum is equal to target
                if((list.get(i)+list.get(j))==target){
                    return true;
                }
            }
        }
        return false;

    }
    //2 pointer approach
    public static boolean optimum(ArrayList<Integer>list,int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp!=rp){
            //case 1
            if((list.get(lp)+list.get(rp))==target){
                return true;
            }
            //case 2
            if((list.get(lp)+list.get(rp))<target){
                lp++;
            }
            else{
                //case 3
                rp--;
            }
            
        }
        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        //1, 2, 3, 4, 5, 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=5;
        //System.out.println(pairsum(list, target));
        System.out.println(optimum(list, target));
    }
    
}
