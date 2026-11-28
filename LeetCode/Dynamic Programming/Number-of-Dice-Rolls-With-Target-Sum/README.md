# Number of Dice Rolls With Target Sum

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/submissions/2204980627/](https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/submissions/2204980627/) |
| **Problem ID** | number-of-dice-rolls-with-target-sum |
| **Language** | Java |
| **Runtime** | 11 ms |
| **Memory** | 42920000 MB |
| **Accepted At** | 2026-11-28T07:08:30.000Z |

## Tags

`Dynamic Programming`

## Problem Statement

You have `n` dice, and each dice has `k` faces numbered from `1` to `k`.

Given three integers `n`, `k`, and `target`, return *the number of possible ways (out of the *`kn`* total ways) **to roll the dice, so the sum of the face-up numbers equals *`target`. Since the answer may be too large, return it **modulo** `109 + 7`.

&nbsp;

Example 1:**

```

**Input:** n = 1, k = 6, target = 3
**Output:** 1
**Explanation:** You throw one die with 6 faces.
There is only one way to get a sum of 3.

```

Example 2:**

```

**Input:** n = 2, k = 6, target = 7
**Output:** 6
**Explanation:** You throw two dice, each with 6 faces.
There are 6 ways to get a sum of 7: 1+6, 2+5, 3+4, 4+3, 5+2, 6+1.

```

Example 3:**

```

**Input:** n = 30, k = 30, target = 500
**Output:** 222616187
**Explanation:** The answer must be returned modulo 109 + 7.

```

&nbsp;

**Constraints:**

	- `1 &lt;= n, k &lt;= 30`

	- `1 &lt;= target &lt;= 1000`

---
