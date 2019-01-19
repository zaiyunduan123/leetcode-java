<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**  *generated with [DocToc](https://github.com/thlorenz/doctoc)*

- [二分查找](#%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE)
- [双指针](#%E5%8F%8C%E6%8C%87%E9%92%88)
- [kSum](#ksum)
- [哈希表](#%E5%93%88%E5%B8%8C%E8%A1%A8)
- [字典树](#%E5%AD%97%E5%85%B8%E6%A0%91)
- [字符串](#%E5%AD%97%E7%AC%A6%E4%B8%B2)
- [尺取法](#%E5%B0%BA%E5%8F%96%E6%B3%95)
- [并查集](#%E5%B9%B6%E6%9F%A5%E9%9B%86)
- [排序](#%E6%8E%92%E5%BA%8F)
- [数学](#%E6%95%B0%E5%AD%A6)
- [数组](#%E6%95%B0%E7%BB%84)
- [栈](#%E6%A0%88)
- [链表](#%E9%93%BE%E8%A1%A8)
  - [链表删除](#%E9%93%BE%E8%A1%A8%E5%88%A0%E9%99%A4)
  - [链表反转](#%E9%93%BE%E8%A1%A8%E5%8F%8D%E8%BD%AC)
  - [链表合并](#%E9%93%BE%E8%A1%A8%E5%90%88%E5%B9%B6)
  - [双向链表](#%E5%8F%8C%E5%90%91%E9%93%BE%E8%A1%A8)
- [二叉树](#%E4%BA%8C%E5%8F%89%E6%A0%91)
  - [二叉树的遍历](#%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E9%81%8D%E5%8E%86)
  - [二叉树的层序遍历](#%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%B1%82%E5%BA%8F%E9%81%8D%E5%8E%86)
  - [二叉树的路径](#%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E8%B7%AF%E5%BE%84)
  - [二叉树的搜索](#%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E6%90%9C%E7%B4%A2)
  - [二叉树的构造](#%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E6%9E%84%E9%80%A0)
  - [二叉树的性质](#%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E6%80%A7%E8%B4%A8)
- [深度优先搜索](#%E6%B7%B1%E5%BA%A6%E4%BC%98%E5%85%88%E6%90%9C%E7%B4%A2)
- [贪心](#%E8%B4%AA%E5%BF%83)
- [回溯](#%E5%9B%9E%E6%BA%AF)
- [分治](#%E5%88%86%E6%B2%BB)
- [动态规划](#%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92)
  - [GameDP](#gamedp)
  - [MatrixDP](#matrixdp)
  - [SequenceDP](#sequencedp)
  - [TwoSequenceDP](#twosequencedp)
  - [背包问题](#%E8%83%8C%E5%8C%85%E9%97%AE%E9%A2%98)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->



## 二分查找
- [[704]  Binary Search](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE/BinarySearch_704.java)
- [[441]  Arranging Coins](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE/ArrangeCoins_441.java)
- [[222]  Count Complete Tree Nodes](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE/CountCompleteTreeNodes_222.java)
- [[162]  Find Peak Element](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE/FindPeakElement_162.java)
- [[744]  Find Smallest Letter Greater Than Target](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE/FindSmallestLetterGreaterThan_744.java)
- [[278]  First Bad Version](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE/FirstBadVersion_278.java)
- [[374]  Guess Number Higher or Lower](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE/GuessNumberHigherorLower_374.java)
- [[69]   Sqrt(x)](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE/MySqrt_69.java)
- [[852]  Peak Index in a Mountain Array](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE/PeakIndexInMountainArray_852.java)
- [[35]   Search Insert Position](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE/SearchInsertPosition_35.java)
- [[540]  Single Element in a Sorted Array](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE/SingleNonDuplicate_540.java)
- [[454]  4Sum II](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE/Sum4_454.java)
- [[33]  Search in Rotated Sorted Array](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE/SearchRotatedSortedArray_33.java)
- [[81]  Search in Rotated Sorted Array II](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE/SearchinRotatedSortedArrayII_81.java)
   


## 双指针
- [[633]  Sum of Square Numbers ](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%8F%8C%E6%8C%87%E9%92%88/JudgeSquareSum_633.java)


## kSum
- [[1]  Two Sum](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/kSum/TwoSum_1.java)
- [[15]  3Sum](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/kSum/ThreeSum_15.java)
- [[16]  3Sum Closest](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/kSum/ThreeSumClosest_16.java)


## 哈希表
- [[575]  Distribute Candies ](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%93%88%E5%B8%8C%E8%A1%A8/DistributeCandies_575.java)
- [[500]  Keyboard Row](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%93%88%E5%B8%8C%E8%A1%A8/KeyboardRow_500.java)
- [[771]  Jewels and Stones](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%93%88%E5%B8%8C%E8%A1%A8/NumJewelsInStones_771.java)
- [[884]  Uncommon Words from Two Sentences](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%93%88%E5%B8%8C%E8%A1%A8/UncommonWordsfromTwoSentences_884.java)


## 字典树
- [[211]  Add and Search Word - Data structure design](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%AD%97%E5%85%B8%E6%A0%91/AddSearchWord_211.java)
- [[208]  Implement Trie (Prefix Tree)](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%AD%97%E5%85%B8%E6%A0%91/Trie_208)

## 字符串
- [[22]   Generate Parentheses](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%AD%97%E7%AC%A6%E4%B8%B2/GenerateParentheses_22.java)
- [[929]  Unique Email Addresses](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%AD%97%E7%AC%A6%E4%B8%B2/NumUniqueEmails_929.java)
- [[821]  Shortest Distance to a Character](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%AD%97%E7%AC%A6%E4%B8%B2/ShortestToChar_821.java)
- [[709]  To Lower Case](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%AD%97%E7%AC%A6%E4%B8%B2/ToLowerCase_709.java)
- [[804]  Unique Morse Code Words](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%AD%97%E7%AC%A6%E4%B8%B2/UniqueMorseRepresentations_804.java)

## 尺取法
- [[209]  Minimum Size Subarray Sum](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%B0%BA%E5%8F%96%E6%B3%95/MinSubArrayLen_209.java)

## 并查集
- [[107]  Binary Tree Level Order Traversal II](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%B9%B6%E6%9F%A5%E9%9B%86/BinaryTreeLevelOrderTraversal_107.java)
- [[684]  Redundant Connection](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%B9%B6%E6%9F%A5%E9%9B%86/FindRedundantConnection_684.java)
- [[112]  Path Sum](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%B9%B6%E6%9F%A5%E9%9B%86/PathSum_112.java)
- [[297]  Serialize and Deserialize Binary Tree](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%B9%B6%E6%9F%A5%E9%9B%86/SerializeDeserializeBinary_297.java)
- [[79]   Word Search](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%B9%B6%E6%9F%A5%E9%9B%86/WordSearch_79.java)

## 排序
- [[215]  Kth Largest Element in an Array](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%8E%92%E5%BA%8F/KthLargestElementinanArray_215.java)
- [[75]  Sort Colors](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%8E%92%E5%BA%8F/SortColors_75.java)

## 数学
- [[868]  Binary Gap](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%95%B0%E5%AD%A6/BinaryGap_868.java)
- [[204]  Count Primes](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%95%B0%E5%AD%A6/CountPrimes_204.java)
- [[942]  DI String Match](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%95%B0%E5%AD%A6/DiStringMatch_942.java)
- [[461]  Hamming Distance](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%95%B0%E5%AD%A6/HammingDistance_461.java)
- [[476]  Number Complement](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%95%B0%E5%AD%A6/NumberComplement_476.java)
- [[728]  Self Dividing Numbers](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%95%B0%E5%AD%A6/SelfDividingNumbers_728.java)

## 数组
- [[717]  1-bit and 2-bit Characters](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%95%B0%E7%BB%84/BitAnd2bitCharacters_717.java)
- [[412]  Fizz Buzz](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%95%B0%E7%BB%84/FizzBuzz_412.java)
- [[832]  Flipping an Image](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%95%B0%E7%BB%84/FlipAndInvertImage_832.java)
- [[349]  Intersection of Two Arrays](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%95%B0%E7%BB%84/IntersectionTwoArrays_349.java)
- [[350]  Intersection of Two Arrays II](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%95%B0%E7%BB%84/IntersectionTwoArraysII_350.java)
- [[905]  Sort Array By Parity](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%95%B0%E7%BB%84/SortArrayByParity_905.java)
- [[922]  Sort Array By Parity II](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%95%B0%E7%BB%84/SortArrayByParityII_922.java)
- [[766]  Toeplitz Matrix](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%95%B0%E7%BB%84/ToeplitzMatrix_766.java)
- [[867]  Transpose Matrix](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%95%B0%E7%BB%84/Transpose_867.java)

## 栈
- [[844]  Backspace String Compare](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%A0%88/BackspaceStringCompare_844.java)
- [[682]  Baseball Game](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%A0%88/BaseballGame_682.java)
- [[224]  Basic Calculator](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%A0%88/BasicCalculator_224.java)
- [[150]  Evaluate Reverse Polish Notation](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%A0%88/EvaluateReversePolishNotation_150.java)
- [[232]  Implement Queue using Stacks](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%A0%88/ImplementQueueusingStacks_232.java)
- [[225]  Implement Stack using Queues](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%A0%88/ImplementStackusingQueues_225.java)
- [[32]   Longest Valid Parentheses](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%A0%88/LongestValidParentheses_32.java)
- [[155]  Min Stack](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%A0%88/MinStack_155.java)
- [[496]  Next Greater Element I](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%A0%88/NextGreaterElementI_496.java)
- [[71]   Simplify Path](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%A0%88/SimplifyPath_71.java)
- [[20]   Valid Parentheses](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%A0%88/ValidParentheses_20.java)



## 链表

### 链表删除
- [[237]  Delete Node in a Linked List](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E9%93%BE%E8%A1%A8/%E5%88%A0%E9%99%A4/DeleteNodeInLinkedList_237.java)

### 链表反转
- [[77]  Combinations](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E9%93%BE%E8%A1%A8/%E5%8F%8D%E8%BD%AC/ReverseList_77.java)
- [[24]  Swap Nodes in Pairs](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E9%93%BE%E8%A1%A8/%E5%8F%8D%E8%BD%AC/SwapNodesinPairs_24.java)

### 链表合并
- [[160]   Intersection of Two Linked Lists](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E9%93%BE%E8%A1%A8/%E5%90%88%E5%B9%B6/GetIntersectionNode_160.java)
- [[21]  Merge Two Sorted Lists](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E9%93%BE%E8%A1%A8/%E5%90%88%E5%B9%B6/MergeTwoLists_21.java)

### 双向链表
- [[707]  Design Linked List](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E9%93%BE%E8%A1%A8/%E5%8F%8C%E5%90%91/MyLinkedList_707.java)




## 二叉树

### 二叉树的遍历
- [[144]  Binary Tree Preorder Traversal](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E9%81%8D%E5%8E%86/BinaryTreePreorderTraversal_144.java)
- [[94]  Binary Tree Inorder Traversal](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E9%81%8D%E5%8E%86/BinaryTreeInorderTraversal_94.java)
- [[145]  Binary Tree Postorder Traversal](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E9%81%8D%E5%8E%86/BinaryTreePostorderTraversal_145.java)

### 二叉树的层序遍历
- [[102]  Binary Tree Level Order Traversal](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E5%B1%82%E5%BA%8F%E9%81%8D%E5%8E%86/BinaryTreeLevelOrderTraversal_102.java)
- [[107]  Binary Tree Level Order Traversal II](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E5%B1%82%E5%BA%8F%E9%81%8D%E5%8E%86/BinaryTreeLevelOrderTraversalII_107.java)
- [[103]  Binary Tree Zigzag Level Order Traversal](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E5%B1%82%E5%BA%8F%E9%81%8D%E5%8E%86/BinaryTreeZigzagLevelOrderTraversal_103.java)
- [[429]  N-ary Tree Level Order Traversal](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E5%B1%82%E5%BA%8F%E9%81%8D%E5%8E%86/NaryTreeLevelOrderTraversal_429.java)

### 二叉树的路径
- [[124]  Binary Tree Maximum Path Sum](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E8%B7%AF%E5%BE%84/BinaryTreeMaximumPathSum_124.java)

### 二叉树的搜索

- [[623]  Add One Row to Tree](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E6%90%9C%E7%B4%A2/AddOneRowtoTree_623.java)
- [[637]  Average of Levels in Binary Tree](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E6%90%9C%E7%B4%A2/AverageofLevelsinBinaryTree_637.java)
- [[199]  Binary Tree Right Side View](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E6%90%9C%E7%B4%A2/BinaryTreeRightSideView_199.java)
- [[513]  Find Bottom Left Tree Value](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E6%90%9C%E7%B4%A2/FindBottomLeftTreeValue_513.java)
- [[515]  Find Largest Value in Each Tree Row](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E6%90%9C%E7%B4%A2/FindLargestValueinEachTreeRow_515.java)
- [[236]  Lowest Common Ancestor of a Binary Tree](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E6%90%9C%E7%B4%A2/LowestCommonAncestorofBinaryTree_236.java)
- [[617]  Merge Two Binary Trees](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E6%90%9C%E7%B4%A2/MergeTrees_617.java)
- [[530]  Minimum Absolute Difference in BST](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E6%90%9C%E7%B4%A2/MinimumAbsoluteDifferenceinBST_530.java)
- [[116]  Populating Next Right Pointers in Each Node](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E6%90%9C%E7%B4%A2/PopulatingNextRightPointersinEachNode_116.java)
- [[700]  Search in a Binary Search Tree](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E6%90%9C%E7%B4%A2/SearchBST_700.java)

### 二叉树的构造
- [[108]  Convert Sorted Array to Binary Search Tree](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/构造/ConvertSortedArrayBinarySearchTree_108.java)


### 二叉树的性质
- [[669]  Trim a Binary Search Tree](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E4%BA%8C%E5%8F%89%E6%A0%91/%E6%80%A7%E8%B4%A8/TrimBinarySearchTree_669.java)



## 深度优先搜索
- [[690]  Employee Importance](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%B7%B1%E5%BA%A6%E4%BC%98%E5%85%88%E6%90%9C%E7%B4%A2/EmployeeImportance_690.java)
- [[897]  Increasing Order Search Tree](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%B7%B1%E5%BA%A6%E4%BC%98%E5%85%88%E6%90%9C%E7%B4%A2/IncreasingOrderSearchTree_897.java)
- [[872]  Leaf-Similar Trees](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%B7%B1%E5%BA%A6%E4%BC%98%E5%85%88%E6%90%9C%E7%B4%A2/LeafSimilar_872.java)
- [[542]  01 Matrix](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%B7%B1%E5%BA%A6%E4%BC%98%E5%85%88%E6%90%9C%E7%B4%A2/Matrix_542.java)
- [[104]  Maximum Depth of Binary Tree](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%B7%B1%E5%BA%A6%E4%BC%98%E5%85%88%E6%90%9C%E7%B4%A2/MaximumDepthofBinaryTree_104.java)
- [[46]   Permutations](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%B7%B1%E5%BA%A6%E4%BC%98%E5%85%88%E6%90%9C%E7%B4%A2/Permutations_46.java)
- [[590]  N-ary Tree Postorder Traversal](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%B7%B1%E5%BA%A6%E4%BC%98%E5%85%88%E6%90%9C%E7%B4%A2/TreePostorderTraversal_590.java)
- [[589]  N-ary Tree Preorder Traversal](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E6%B7%B1%E5%BA%A6%E4%BC%98%E5%85%88%E6%90%9C%E7%B4%A2/TreePreorderTraversal_589.java)

## 贪心
- [[455]  Assign Cookies](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E8%B4%AA%E5%BF%83/FindContentChildren_455.java)
- [[392]  Is Subsequence](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E8%B4%AA%E5%BF%83/IsSubsequence_392.java)
- [[452]  Minimum Number of Arrows to Burst Balloons ](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E8%B4%AA%E5%BF%83/MinimumNumberofArrowstoBurstBalloons_452.java)
- [[435]  Non-overlapping Intervals](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E8%B4%AA%E5%BF%83/NonOverlappingIntervals_435.java)
- [[406]  Queue Reconstruction by Height](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E8%B4%AA%E5%BF%83/ReconstructQueue_406.java)


## 回溯
- [[401]  Binary Watch](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%9B%9E%E6%BA%AF/BinaryWatch_401.java)
- [[784]  Letter Case Permutation ](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%9B%9E%E6%BA%AF/LetterCasePermutation_784.java)


## 分治
- [[241]  Different Ways to Add Parentheses](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%88%86%E6%B2%BB/DiffWaysToCompute_241.java)

## 动态规划

### GameDP
- [[198]  House Robber](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92/GameDP/HouseRobber_198.java)
- [[486]  Predict the Winner](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92/GameDP/PredicttheWinner_486.java)

### MatrixDP
- [[64]  Minimum Path Sum](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92/MatrixDP/MinimumPathSum_64.java)
- [[120]  Triangle](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92/MatrixDP/Triangle_120.java)
- [[62]  Unique Paths](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92/MatrixDP/UniquePaths_62.java)
- [[63]  Unique Paths II](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92/MatrixDP/UniquePathsII_63.java)

### SequenceDP
- [[70]  Climbing Stairs](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92/SequenceDP/ClimbStairs_70.java)
- [[55]  Jump Game](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92/SequenceDP/JumpGame_55.java)
- [[300]  Longest Increasing Subsequence](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92/SequenceDP/LongestIncreasingSubsequence_300.java)

### TwoSequenceDP
- [[72]  Edit Distance](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92/TwoSequencesDP/EditDistance_72.java)
- [[77]  Combinations](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92/TwoSequencesDP/LongestCommonSubsequence_77.java)

### 背包问题
- [[416] Partition Equal Subset Sum](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92/背包问题/PartitionEqualSubsetSum_416.java)
- [[322] Coin Change](https://github.com/zaiyunduan123/leetcode-java/blob/master/src/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92/背包问题/CoinChange_322.java)



