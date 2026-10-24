# Word Ladder II

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Hard |
| **URL** | [https://leetcode.com/problems/word-ladder-ii/submissions/2180373734/](https://leetcode.com/problems/word-ladder-ii/submissions/2180373734/) |
| **Problem ID** | word-ladder-ii |
| **Language** | Java |
| **Runtime** | 16 ms |
| **Memory** | 46004000 MB |
| **Accepted At** | 2026-10-24T11:16:59.000Z |

## Tags

`Hash Table`, `String`, `Backtracking`, `Breadth-First Search`, `Bidirectional Search`

## Problem Statement

A **transformation sequence** from word `beginWord` to word `endWord` using a dictionary `wordList` is a sequence of words `beginWord -&gt; s1 -&gt; s2 -&gt; ... -&gt; sk` such that:

	- Every adjacent pair of words differs by a single letter.

	- Every `si` for `1 &lt;= i &lt;= k` is in `wordList`. Note that `beginWord` does not need to be in `wordList`.

	- `sk == endWord`

Given two words, `beginWord` and `endWord`, and a dictionary `wordList`, return *all the **shortest transformation sequences** from* `beginWord` *to* `endWord`*, or an empty list if no such sequence exists. Each sequence should be returned as a list of the words *`[beginWord, s1, s2, ..., sk]`.

&nbsp;

Example 1:**

```

**Input:** beginWord = &quot;hit&quot;, endWord = &quot;cog&quot;, wordList = [&quot;hot&quot;,&quot;dot&quot;,&quot;dog&quot;,&quot;lot&quot;,&quot;log&quot;,&quot;cog&quot;]
**Output:** [[&quot;hit&quot;,&quot;hot&quot;,&quot;dot&quot;,&quot;dog&quot;,&quot;cog&quot;],[&quot;hit&quot;,&quot;hot&quot;,&quot;lot&quot;,&quot;log&quot;,&quot;cog&quot;]]
**Explanation:**&nbsp;There are 2 shortest transformation sequences:
&quot;hit&quot; -&gt; &quot;hot&quot; -&gt; &quot;dot&quot; -&gt; &quot;dog&quot; -&gt; &quot;cog&quot;
&quot;hit&quot; -&gt; &quot;hot&quot; -&gt; &quot;lot&quot; -&gt; &quot;log&quot; -&gt; &quot;cog&quot;

```

Example 2:**

```

**Input:** beginWord = &quot;hit&quot;, endWord = &quot;cog&quot;, wordList = [&quot;hot&quot;,&quot;dot&quot;,&quot;dog&quot;,&quot;lot&quot;,&quot;log&quot;]
**Output:** []
**Explanation:** The endWord &quot;cog&quot; is not in wordList, therefore there is no valid transformation sequence.

```

&nbsp;

**Constraints:**

	- `1 &lt;= beginWord.length &lt;= 5`

	- `endWord.length == beginWord.length`

	- `1 &lt;= wordList.length &lt;= 500`

	- `wordList[i].length == beginWord.length`

	- `beginWord`, `endWord`, and `wordList[i]` consist of lowercase English letters.

	- `beginWord != endWord`

	- All the words in `wordList` are **unique**.

	- The **sum** of all shortest transformation sequences does not exceed `105`.

## Constraints

- 1 &lt;= beginWord.length &lt;= 5
- endWord.length == beginWord.length
- 1 &lt;= wordList.length &lt;= 500
- wordList[i].length == beginWord.length
- beginWord, endWord, and wordList[i] consist of lowercase English letters.
- beginWord != endWord

---
