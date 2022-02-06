package Leetcode;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    static int  maximumWealth(int[][] accounts) {
        int wealth= accounts[0][0];
        for(int person=0;person<accounts.length;person++)
        {
            int rowSum=0;
            for(int bankAccount=0;bankAccount<accounts[person].length;bankAccount++)
            {
                rowSum=rowSum+accounts[person][bankAccount];
            }
            if(rowSum>wealth)
            {
                wealth=rowSum;
            }

        }

        return wealth;
    }
}

