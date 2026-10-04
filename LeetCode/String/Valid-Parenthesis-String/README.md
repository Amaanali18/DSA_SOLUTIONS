# Valid Parenthesis String

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/valid-parenthesis-string/submissions/2161572898/?envType=daily-question&envId=2026-10-04](https://leetcode.com/problems/valid-parenthesis-string/submissions/2161572898/?envType=daily-question&envId=2026-10-04) |
| **Problem ID** | valid-parenthesis-string |
| **Language** | Java |
| **Runtime** | 0 ms |
| **Memory** | 42896000 MB |
| **Accepted At** | 2026-10-04T02:28:41.000Z |

## Tags

`String`, `Dynamic Programming`, `Stack`, `Greedy`, `Bracket Sequences`

## Problem Statement

Given a string `s` containing only three types of characters: `&#39;(&#39;`, `&#39;)&#39;` and `&#39;*&#39;`, return `true` *if* `s` *is **valid***.

The following rules define a **valid** string:

	- Any left parenthesis `&#39;(&#39;` must have a corresponding right parenthesis `&#39;)&#39;`.

	- Any right parenthesis `&#39;)&#39;` must have a corresponding left parenthesis `&#39;(&#39;`.

	- Left parenthesis `&#39;(&#39;` must go before the corresponding right parenthesis `&#39;)&#39;`.

	- `&#39;*&#39;` could be treated as a single right parenthesis `&#39;)&#39;` or a single left parenthesis `&#39;(&#39;` or an empty string `&quot;&quot;`.

&nbsp;

Example 1:**

```

**Input:** s = &quot;()&quot;
**Output:** true

```

Example 2:**

```

**Input:** s = &quot;(*)&quot;
**Output:** true

```

Example 3:**

```

**Input:** s = &quot;(*))&quot;
**Output:** true

```

Example 4:**

```

**Input:** s = &quot;(&quot;
**Output:** false

```

&nbsp;

**Constraints:**

	- `1 &lt;= s.length &lt;= 100`

	- `s[i]` is `&#39;(&#39;`, `&#39;)&#39;` or `&#39;*&#39;`.

---
