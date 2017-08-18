/**
 * Created by apple on 2017/7/27.
 */
public class Coin {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] coins={1,3,5};
        int value=100;
        int[] solu=new int[value];
        int min=solution(coins,value,solu);
        for(int i=value-1;i>=0;){
            System.out.print(solu[i]+"->");
            i=i-solu[i];
        }
        System.out.println();
        System.out.println(min);

    }
    private static int solution(int[] coins,int value, int[] solu){
        int[] mins = new int[value+1];
        mins[0]=0;
        for(int i=1;i<=value;i++) mins[i]=Integer.MAX_VALUE;
        for(int i=1;i<=value;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i&&mins[i]>mins[i-coins[j]]+1){
                    mins[i]=mins[i-coins[j]]+1;
                    solu[i-1]=coins[j];
                }
            }
        }
        return mins[value];
    }
}
