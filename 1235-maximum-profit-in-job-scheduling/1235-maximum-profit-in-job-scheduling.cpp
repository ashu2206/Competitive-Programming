class Solution {
public:
    int jobScheduling(vector<int>& startTime, vector<int>& endTime, vector<int>& profit) {
        int n = startTime.size();
        vector<tuple<int, int, int>> jobs;
        for (int i = 0; i < n; ++i) {
            jobs.emplace_back(endTime[i], startTime[i], profit[i]);
        }
        sort(jobs.begin(), jobs.end());
        map<int, int> dp = {{0, 0}};
        for (const auto [end, start, profit] : jobs) {
            int cur = prev(dp.upper_bound(start))->second + profit;
            if (cur > dp.rbegin()->second)
                dp[end] = cur;
        }
        return dp.rbegin()->second;
    }
};