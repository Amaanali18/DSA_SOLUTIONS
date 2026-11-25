# Remove Adjacent Almost-Equal Characters

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/remove-adjacent-almost-equal-characters/submissions/2202950548/](https://leetcode.com/problems/remove-adjacent-almost-equal-characters/submissions/2202950548/) |
| **Problem ID** | remove-adjacent-almost-equal-characters |
| **Language** | Java |
| **Runtime** | 2 ms |
| **Memory** | 42240000 MB |
| **Accepted At** | 2026-11-25T03:41:50.000Z |

## Tags

`String`, `Dynamic Programming`, `Greedy`

## Problem Statement

You are given a **0-indexed** string `word`.

In one operation, you can pick any index `i` of `word` and change `word[i]` to any lowercase English letter.

Return *the **minimum** number of operations needed to remove all adjacent **almost-equal** characters from* `word`.

Two characters `a` and `b` are **almost-equal** if `a == b` or `a` and `b` are adjacent in the alphabet.

&nbsp;

Example 1:**

```

**Input:** word = &quot;aaaaa&quot;
**Output:** 2
**Explanation:** We can change word into &quot;a**c**a**c**a&quot; which does not have any adjacent almost-equal characters.
It can be shown that the minimum number of operations needed to remove all adjacent almost-equal characters from word is 2.

```

Example 2:**

```

**Input:** word = &quot;abddez&quot;
**Output:** 2
**Explanation:** We can change word into &quot;**y**bd**o**ez&quot; which does not have any adjacent almost-equal characters.
It can be shown that the minimum number of operations needed to remove all adjacent almost-equal characters from word is 2.
```

Example 3:**

```

**Input:** word = &quot;zyxyxyz&quot;
**Output:** 3
**Explanation:** We can change word into &quot;z**a**x**a**x**a**z&quot; which does not have any adjacent almost-equal characters. 
It can be shown that the minimum number of operations needed to remove all adjacent almost-equal characters from word is 3.

```

&nbsp;

**Constraints:**

	- `1 &lt;= word.length &lt;= 100`

	- `word` consists only of lowercase English letters.

---
