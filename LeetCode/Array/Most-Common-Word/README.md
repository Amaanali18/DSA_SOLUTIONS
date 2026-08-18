# Most Common Word

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/most-common-word/submissions/2110858847/](https://leetcode.com/problems/most-common-word/submissions/2110858847/) |
| **Problem ID** | most-common-word |
| **Language** | Java |
| **Runtime** | 13 ms |
| **Memory** | 44076000 MB |
| **Accepted At** | 2026-08-18T04:09:31.000Z |

## Tags

`Array`, `Hash Table`, `String`, `Counting`

## Problem Statement

Given a string `paragraph` and a string array of the banned words `banned`, return *the most frequent word that is not banned*. It is **guaranteed** there is **at least one word** that is not banned, and that the answer is **unique**.

The words in `paragraph` are **case-insensitive** and the answer should be returned in **lowercase**.

**Note** that words can not contain punctuation symbols.

&nbsp;

Example 1:**

```

**Input:** paragraph = &quot;Bob hit a ball, the hit BALL flew far after it was hit.&quot;, banned = [&quot;hit&quot;]
**Output:** &quot;ball&quot;
**Explanation:** 
&quot;hit&quot; occurs 3 times, but it is a banned word.
&quot;ball&quot; occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as &quot;ball,&quot;), 
and that &quot;hit&quot; isn&#39;t the answer even though it occurs more because it is banned.

```

Example 2:**

```

**Input:** paragraph = &quot;a.&quot;, banned = []
**Output:** &quot;a&quot;

```

&nbsp;

**Constraints:**

	- `1 &lt;= paragraph.length &lt;= 1000`

	- paragraph consists of English letters, space `&#39; &#39;`, or one of the symbols: `&quot;!?&#39;,;.&quot;`.

	- `0 &lt;= banned.length &lt;= 100`

	- `1 &lt;= banned[i].length &lt;= 10`

	- `banned[i]` consists of only lowercase English letters.

---
