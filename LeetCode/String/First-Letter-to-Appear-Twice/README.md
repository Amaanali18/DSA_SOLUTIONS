# First Letter to Appear Twice

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/first-letter-to-appear-twice/submissions/2155495181/](https://leetcode.com/problems/first-letter-to-appear-twice/submissions/2155495181/) |
| **Problem ID** | first-letter-to-appear-twice |
| **Language** | Java |
| **Runtime** | 0 ms |
| **Memory** | 42064000 MB |
| **Accepted At** | 2026-09-28T03:17:13.000Z |

## Tags

`Hash Table`, `String`, `Bit Manipulation`, `Counting`

## Problem Statement

Given a string `s` consisting of lowercase English letters, return *the first letter to appear **twice***.

**Note**:

	- A letter `a` appears twice before another letter `b` if the **second** occurrence of `a` is before the **second** occurrence of `b`.

	- `s` will contain at least one letter that appears twice.

&nbsp;

Example 1:**

```

**Input:** s = &quot;abccbaacz&quot;
**Output:** &quot;c&quot;
**Explanation:**
The letter &#39;a&#39; appears on the indexes 0, 5 and 6.
The letter &#39;b&#39; appears on the indexes 1 and 4.
The letter &#39;c&#39; appears on the indexes 2, 3 and 7.
The letter &#39;z&#39; appears on the index 8.
The letter &#39;c&#39; is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.

```

Example 2:**

```

**Input:** s = &quot;abcdd&quot;
**Output:** &quot;d&quot;
**Explanation:**
The only letter that appears twice is &#39;d&#39; so we return &#39;d&#39;.

```

&nbsp;

**Constraints:**

	- `2 &lt;= s.length &lt;= 100`

	- `s` consists of lowercase English letters.

	- `s` has at least one repeated letter.

---
