# Word Ladder

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Hard |
| **URL** | [https://leetcode.com/problems/word-ladder/submissions/2180122104/](https://leetcode.com/problems/word-ladder/submissions/2180122104/) |
| **Problem ID** | word-ladder |
| **Language** | Java |
| **Runtime** | 90 ms |
| **Memory** | 47340000 MB |
| **Accepted At** | 2026-10-24T04:10:51.000Z |

## Tags

`Hash Table`, `String`, `Breadth-First Search`, `Bidirectional Search`

## Problem Statement

A **transformation sequence** from word `beginWord` to word `endWord` using a dictionary `wordList` is a sequence of words `beginWord -&gt; s1 -&gt; s2 -&gt; ... -&gt; sk` such that:

	- Every adjacent pair of words differs by a single letter.

	- Every `si` for `1 &lt;= i &lt;= k` is in `wordList`. Note that `beginWord` does not need to be in `wordList`.

	- `sk == endWord`

Given two words, `beginWord` and `endWord`, and a dictionary `wordList`, return *the **number of words** in the **shortest transformation sequence** from* `beginWord` *to* `endWord`*, or *`0`* if no such sequence exists.*

&nbsp;

Example 1:**

```

**Input:** beginWord = &quot;hit&quot;, endWord = &quot;cog&quot;, wordList = [&quot;hot&quot;,&quot;dot&quot;,&quot;dog&quot;,&quot;lot&quot;,&quot;log&quot;,&quot;cog&quot;]
**Output:** 5
**Explanation:** One shortest transformation sequence is &quot;hit&quot; -&gt; &quot;hot&quot; -&gt; &quot;dot&quot; -&gt; &quot;dog&quot; -&gt; cog&quot;, which is 5 words long.

```

Example 2:**

```

**Input:** beginWord = &quot;hit&quot;, endWord = &quot;cog&quot;, wordList = [&quot;hot&quot;,&quot;dot&quot;,&quot;dog&quot;,&quot;lot&quot;,&quot;log&quot;]
**Output:** 0
**Explanation:** The endWord &quot;cog&quot; is not in wordList, therefore there is no valid transformation sequence.

```

&nbsp;

**Constraints:**

	- `1 &lt;= beginWord.length &lt;= 10`

	- `endWord.length == beginWord.length`

	- `1 &lt;= wordList.length &lt;= 5000`

	- `wordList[i].length == beginWord.length`

	- `beginWord`, `endWord`, and `wordList[i]` consist of lowercase English letters.

	- `beginWord != endWord`

	- All the words in `wordList` are **unique**.

## Constraints

- 1 &lt;= beginWord.length &lt;= 10
- endWord.length == beginWord.length
- 1 &lt;= wordList.length &lt;= 5000
- wordList[i].length == beginWord.length
- beginWord, endWord, and wordList[i] consist of lowercase English letters.
- beginWord != endWord

---
