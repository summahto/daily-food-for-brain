package com.dsa.algorithms;

public class PalindromSubsequences {

    public static void main(String[] args) {

        String s = "111000111";
        //find all palindromic sequences of length 5
        /*
        def getPalindromesCount(s):
        Write your code here
        n = len(s)
        pre_cnt, suf_cnt = [0] * 4, [0] * 4
        cnt, cnt_so_far = [0, 0], [0, 0]
        s = [0 if x =='0' else 1 for x in s]
        mod, ans = 10 ** 9 + 7, 0

        for j in range(n):
            suf_cnt[s[j]] += cnt[0]
            suf_cnt[2 + s[j]] += cnt[1]
            cnt[s[j]] += 1

        for j in range(n):
            cnt[s[j]] -= 1
            suf_cnt[2 * s[j]] -= cnt[0]
            suf_cnt[2 * s[j] + 1] -= cnt[1]

            ans += pre_cnt[0] * suf_cnt[0] # "00" and "00"
            ans += pre_cnt[1] * suf_cnt[2] # "01" and "10"
            ans += pre_cnt[2] * suf_cnt[1] # "10" and "01"
            ans += pre_cnt[3] * suf_cnt[3] # "11" and "11"
            ans %= mod

            pre_cnt[s[j]] += cnt_so_far[0]
            pre_cnt[2 + s[j]] += cnt_so_far[1]
            cnt_so_far[s[j]] += 1

        return ans
         */
        System.out.println(findAllPalindromeSubsequences(s));

    }

    private static int findAllPalindromeSubsequences(String s) {

        return 0;
    }
}
