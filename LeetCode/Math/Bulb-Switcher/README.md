# Bulb Switcher

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/bulb-switcher/submissions/2191306565/](https://leetcode.com/problems/bulb-switcher/submissions/2191306565/) |
| **Problem ID** | bulb-switcher |
| **Language** | Java |
| **Runtime** | 0 ms |
| **Memory** | 41584000 MB |
| **Accepted At** | 2026-11-07T14:10:23.000Z |

## Tags

`Math`, `Brainteaser`

## Problem Statement

There are `n` bulbs that are initially off. You first turn on all the bulbs, then&nbsp;you turn off every second bulb.

On the third round, you toggle every third bulb (turning on if it&#39;s off or turning off if it&#39;s on). For the `ith` round, you toggle every `i` bulb. For the `nth` round, you only toggle the last bulb.

Return *the number of bulbs that are on after `n` rounds*.

&nbsp;

Example 1:**

```

**Input:** n = 3
**Output:** 1
**Explanation:** At first, the three bulbs are [off, off, off].
After the first round, the three bulbs are [on, on, on].
After the second round, the three bulbs are [on, off, on].
After the third round, the three bulbs are [on, off, off]. 
So you should return 1 because there is only one bulb is on.
```

Example 2:**

```

**Input:** n = 0
**Output:** 0

```

Example 3:**

```

**Input:** n = 1
**Output:** 1

```

&nbsp;

**Constraints:**

	- `0 &lt;= n &lt;= 109`

---
