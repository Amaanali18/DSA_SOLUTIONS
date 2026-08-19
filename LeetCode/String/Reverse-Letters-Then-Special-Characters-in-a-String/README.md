# Reverse Letters Then Special Characters in a String

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/reverse-letters-then-special-characters-in-a-string/submissions/2112432704/](https://leetcode.com/problems/reverse-letters-then-special-characters-in-a-string/submissions/2112432704/) |
| **Problem ID** | reverse-letters-then-special-characters-in-a-string |
| **Language** | Java |
| **Runtime** | 4 ms |
| **Memory** | 45332000 MB |
| **Accepted At** | 2026-08-19T08:22:13.000Z |

## Tags

`Two Pointers`, `String`, `Simulation`

## Problem Statement

You are given a string `s` consisting of lowercase English letters and special characters.

Your task is to perform these **in order**:

	- **Reverse** the **lowercase letters** and place them back into the positions originally occupied by letters.

	- **Reverse** the **special characters** and place them back into the positions originally occupied by special characters.

Return the resulting string after performing the reversals.

&nbsp;

Example 1:**

**Input:** s = &quot;)ebc#da@f(&quot;

**Output:** &quot;(fad@cb#e)&quot;

**Explanation:**

	- The letters in the string are `[&#39;e&#39;, &#39;b&#39;, &#39;c&#39;, &#39;d&#39;, &#39;a&#39;, &#39;f&#39;]`:

	
		- Reversing them gives `[&#39;f&#39;, &#39;a&#39;, &#39;d&#39;, &#39;c&#39;, &#39;b&#39;, &#39;e&#39;]`

		- `s` becomes `&quot;)fad#cb@e(&quot;`

	
	

	- ​​​​​​​The special characters in the string are `[&#39;)&#39;, &#39;#&#39;, &#39;@&#39;, &#39;(&#39;]`:
	
		- Reversing them gives `[&#39;(&#39;, &#39;@&#39;, &#39;#&#39;, &#39;)&#39;]`

		- `s` becomes `&quot;(fad@cb#e)&quot;`

	
	

Example 2:**

**Input:** s = &quot;z&quot;

**Output:** &quot;z&quot;

**Explanation:**

The string contains only one letter, and reversing it does not change the string. There are no special characters.

Example 3:**

**Input:** s = &quot;!@#$%^&amp;*()&quot;

**Output:** &quot;)(*&amp;^%$#@!&quot;

**Explanation:**

The string contains no letters. The string contains all special characters, so reversing the special characters reverses the whole string.

&nbsp;

**Constraints:**

	- `1 &lt;= s.length &lt;= 100`

	- `s` consists only of lowercase English letters and the special characters in `&quot;!@#$%^&amp;*()&quot;`.

---
