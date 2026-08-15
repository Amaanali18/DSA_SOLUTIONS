# Count Valid Prefixes

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/count-valid-prefixes/submissions/2107223673/](https://leetcode.com/problems/count-valid-prefixes/submissions/2107223673/) |
| **Problem ID** | count-valid-prefixes |
| **Language** | Java |
| **Runtime** | 1 ms |
| **Memory** | 44232000 MB |
| **Accepted At** | 2026-08-15T04:58:32.000Z |

## Problem Statement

You are given a binary string `s`.

A prefix of `s` is considered **valid** if its characters can be rearranged to form an **alternating** string.

Return the number of valid prefixes of `s`.

A string is considered **alternating** if no two adjacent characters are equal.

&nbsp;

Example 1:**

**Input:** s = &quot;00101&quot;

**Output:** 3

**Explanation:**

The valid prefixes are:

	- `&quot;0&quot;`: It is already an alternating string.

	- `&quot;001&quot;`: It can be rearranged into `&quot;010&quot;`, which is an alternating string.

	- `&quot;00101&quot;`: It can be rearranged into `&quot;01010&quot;`, which is an alternating string.

Thus, the answer is 3.

Example 2:**

**Input:** s = &quot;101&quot;

**Output:** 3

**Explanation:**

All prefixes of `s = &quot;101&quot;` are already alternating strings. Thus, the answer is 3.

&nbsp;

**Constraints:**

	- `1 &lt;= s.length &lt;= 100`

	- `s` consists only of `&#39;0&#39;` and `&#39;1&#39;`.

---
