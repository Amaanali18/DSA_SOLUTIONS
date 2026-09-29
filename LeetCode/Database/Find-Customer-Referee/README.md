# Find Customer Referee

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/find-customer-referee/submissions/2156828959/](https://leetcode.com/problems/find-customer-referee/submissions/2156828959/) |
| **Problem ID** | find-customer-referee |
| **Language** | MySQL |
| **Runtime** | 531 ms |
| **Memory** | 0 MB |
| **Accepted At** | 2026-09-29T07:39:46.000Z |

## Tags

`Database`

## Problem Statement

Table: `Customer`

```

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
| referee_id  | int     |
+-------------+---------+
In SQL, id is the primary key column for this table.
Each row of this table indicates the id of a customer, their name, and the id of the customer who referred them.

```

&nbsp;

Find the names of the customer that are either:

	- **referred by**&nbsp;any&nbsp;customer with&nbsp;`id != 2`.

	- **not referred by** any customer.

Return the result table in **any order**.

The result format is in the following example.

&nbsp;

Example 1:**

```

**Input:** 
Customer table:
+----+------+------------+
| id | name | referee_id |
+----+------+------------+
| 1  | Will | null       |
| 2  | Jane | null       |
| 3  | Alex | 2          |
| 4  | Bill | null       |
| 5  | Zack | 1          |
| 6  | Mark | 2          |
+----+------+------------+
**Output:** 
+------+
| name |
+------+
| Will |
| Jane |
| Bill |
| Zack |
+------+

```

---
