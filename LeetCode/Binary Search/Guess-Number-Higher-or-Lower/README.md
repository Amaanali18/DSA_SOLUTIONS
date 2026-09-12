# Guess Number Higher or Lower

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/guess-number-higher-or-lower/submissions/2139178441/](https://leetcode.com/problems/guess-number-higher-or-lower/submissions/2139178441/) |
| **Problem ID** | guess-number-higher-or-lower |
| **Language** | Java |
| **Runtime** | 0 ms |
| **Memory** | 42208000 MB |
| **Accepted At** | 2026-09-12T05:56:34.000Z |

## Tags

`Binary Search`, `Interactive`

## Problem Statement

We are playing the Guess Game. The game is as follows:

I pick a number from `1` to `n`. You have to guess which number I picked (the number I picked stays the same throughout the game).

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API `int guess(int num)`, which returns three possible results:

	- `-1`: Your guess is higher than the number I picked (i.e. `num &gt; pick`).

	- `1`: Your guess is lower than the number I picked (i.e. `num &lt; pick`).

	- `0`: your guess is equal to the number I picked (i.e. `num == pick`).

Return *the number that I picked*.

&nbsp;

Example 1:**

```

**Input:** n = 10, pick = 6
**Output:** 6

```

Example 2:**

```

**Input:** n = 1, pick = 1
**Output:** 1

```

Example 3:**

```

**Input:** n = 2, pick = 1
**Output:** 1

```

&nbsp;

**Constraints:**

	- `1 &lt;= n &lt;= 231 - 1`

	- `1 &lt;= pick &lt;= n`

---
