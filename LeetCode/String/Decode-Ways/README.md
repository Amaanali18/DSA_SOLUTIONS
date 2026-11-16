# Decode Ways

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/decode-ways/submissions/2197260845/](https://leetcode.com/problems/decode-ways/submissions/2197260845/) |
| **Problem ID** | decode-ways |
| **Language** | Java |
| **Runtime** | 1 ms |
| **Memory** | 42716000 MB |
| **Accepted At** | 2026-11-16T11:30:29.000Z |

## Tags

`String`, `Dynamic Programming`

## Problem Statement

You have intercepted a secret message encoded as a string of numbers. The message is **decoded** via the following mapping:

`&quot;1&quot; -&gt; &#39;A&#39;

&quot;2&quot; -&gt; &#39;B&#39;

...

&quot;25&quot; -&gt; &#39;Y&#39;

&quot;26&quot; -&gt; &#39;Z&#39;`

However, while decoding the message, you realize that there are many different ways you can decode the message because some codes are contained in other codes (`&quot;2&quot;` and `&quot;5&quot;` vs `&quot;25&quot;`).

For example, `&quot;11106&quot;` can be decoded into:

	- `&quot;AAJF&quot;` with the grouping `(1, 1, 10, 6)`

	- `&quot;KJF&quot;` with the grouping `(11, 10, 6)`

	- The grouping `(1, 11, 06)` is invalid because `&quot;06&quot;` is not a valid code (only `&quot;6&quot;` is valid).

Note: there may be strings that are impossible to decode.

Given a string s containing only digits, return the **number of ways** to **decode** it. If the entire string cannot be decoded in any valid way, return `0`.

The test cases are generated so that the answer fits in a **32-bit** integer.

&nbsp;

Example 1:**

**Input:** s = &quot;12&quot;

**Output:** 2

**Explanation:**

&quot;12&quot; could be decoded as &quot;AB&quot; (1 2) or &quot;L&quot; (12).

Example 2:**

**Input:** s = &quot;226&quot;

**Output:** 3

**Explanation:**

&quot;226&quot; could be decoded as &quot;BZ&quot; (2 26), &quot;VF&quot; (22 6), or &quot;BBF&quot; (2 2 6).

Example 3:**

**Input:** s = &quot;06&quot;

**Output:** 0

**Explanation:**

&quot;06&quot; cannot be mapped to &quot;F&quot; because of the leading zero (&quot;6&quot; is different from &quot;06&quot;). In this case, the string is not a valid encoding, so return 0.

&nbsp;

**Constraints:**

	- `1 &lt;= s.length &lt;= 100`

	- `s` contains only digits and may contain leading zero(s).

---
