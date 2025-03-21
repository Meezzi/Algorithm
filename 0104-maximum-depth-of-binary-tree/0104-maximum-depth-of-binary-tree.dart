/**
 * Definition for a binary tree node.
 * class TreeNode {
 *   int val;
 *   TreeNode? left;
 *   TreeNode? right;
 *   TreeNode([this.val = 0, this.left, this.right]);
 * }
 */
class Solution {
  int maxDepth(TreeNode? root) {

    // root가 null이면 종료
    if(root ==  null) {
        return 0;
    }

    // 오른쪽 노드의 깊이 구하기
    int rightDepth = maxDepth(root.right);

    // 왼쪽 노드의 깊이 구하기
    int leftDepth = maxDepth(root.left);

    // 오른쪽 노드와 왼쪽 노드 중 가장 큰 값을 구한 후, 1을 더해서 반환
    return 1 + (rightDepth > leftDepth ? rightDepth : leftDepth);
  }
}