# Compare Version Numbers

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/compare-version-numbers/submissions/2158816819/](https://leetcode.com/problems/compare-version-numbers/submissions/2158816819/) |
| **Problem ID** | compare-version-numbers |
| **Language** | Java |
| **Runtime** | 1 ms |
| **Memory** | 42976000 MB |
| **Accepted At** | 2026-10-01T05:01:33.000Z |

## Tags

`Two Pointers`, `String`

## Problem Statement

Given two **version strings**, `version1` and `version2`, compare them. A version string consists of **revisions** separated by dots `&#39;.&#39;`. The **value of the revision** is its **integer conversion** ignoring leading zeros.

To compare version strings, compare their revision values in **left-to-right order**. If one of the version strings has fewer revisions, treat the missing revision values as `0`.

Return the following:

	- If `version1 &lt; version2`, return -1.

	- If `version1 &gt; version2`, return 1.

	- Otherwise, return 0.

&nbsp;

Example 1:**

**Input:** version1 = &quot;1.2&quot;, version2 = &quot;1.10&quot;

**Output:** -1

**Explanation:**

version1&#39;s second revision is &quot;2&quot; and version2&#39;s second revision is &quot;10&quot;: 2 &lt; 10, so version1 &lt; version2.

Example 2:**

**Input:** version1 = &quot;1.01&quot;, version2 = &quot;1.001&quot;

**Output:** 0

**Explanation:**

Ignoring leading zeroes, both &quot;01&quot; and &quot;001&quot; represent the same integer &quot;1&quot;.

Example 3:**

**Input:** version1 = &quot;1.0&quot;, version2 = &quot;1.0.0.0&quot;

**Output:** 0

**Explanation:**

version1 has less revisions, which means every missing revision are treated as &quot;0&quot;.

&nbsp;

**Constraints:**

	- `1 &lt;= version1.length, version2.length &lt;= 500`

	- `version1` and `version2`&nbsp;only contain digits and `&#39;.&#39;`.

	- `version1` and `version2`&nbsp;**are valid version numbers**.

	- All the given revisions in&nbsp;`version1` and `version2`&nbsp;can be stored in&nbsp;a&nbsp;**32-bit integer**.

## Constraints

- 1 &lt;= version1.length, version2.length &lt;= 500
- version1 and version2&nbsp;only contain digits and &#39;.&#39;.

---
