class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int min=std::numeric_limits<int>::max();
        int max = 0;
        for(int i = 0; i<prices.size(); i++){
            if(prices[i]<min)
                min = prices[i];
            else{
                int profit = prices[i]-min;
                if(profit>max)
                    max = profit;
            }

        }
        return max;
    }
};
