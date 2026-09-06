# Alphabet Board Path

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/alphabet-board-path/submissions/2132524504/](https://leetcode.com/problems/alphabet-board-path/submissions/2132524504/) |
| **Problem ID** | alphabet-board-path |
| **Language** | Java |
| **Runtime** | 0 ms |
| **Memory** | 42496000 MB |
| **Accepted At** | 2026-09-06T06:22:18.000Z |

## Tags

`Hash Table`, `String`

## Problem Statement

On an alphabet board, we start at position `(0, 0)`, corresponding to character&nbsp;`board[0][0]`.


Here, `board = [&quot;abcde&quot;, &quot;fghij&quot;, &quot;klmno&quot;, &quot;pqrst&quot;, &quot;uvwxy&quot;, &quot;z&quot;]`, as shown in the diagram below.





We may make the following moves:


	- `&#39;U&#39;` moves our position up one row, if the position exists on the board;

	- `&#39;D&#39;` moves our position down one row, if the position exists on the board;

	- `&#39;L&#39;` moves our position left one column, if the position exists on the board;

	- `&#39;R&#39;` moves our position right one column, if the position exists on the board;

	- `&#39;!&#39;`&nbsp;adds the character `board[r][c]` at our current position `(r, c)`&nbsp;to the&nbsp;answer.




(Here, the only positions that exist on the board are positions with letters on them.)


Return a sequence of moves that makes our answer equal to `target`&nbsp;in the minimum number of moves.&nbsp; You may return any path that does so.


&nbsp;

Example 1:**

```
**Input:** target = "leet"
**Output:** "DDR!UURRR!!DDD!"

```

Example 2:**

```
**Input:** target = "code"
**Output:** "RR!DDRR!UUL!R!"

```


&nbsp;

**Constraints:**


	- `1 &lt;= target.length &lt;= 100`

	- `target` consists only of English lowercase letters.

---
