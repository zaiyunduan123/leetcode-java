package 深度优先搜索;

import java.util.ArrayDeque;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/29 下午10:58
 *
 * 给定一个由 0 和 1 组成的矩阵，找出每个元素到最近的 0 的距离。
 */
public class Matrix_542 {
    public int[][] updateMatrix(int[][] matrix) {

        /**
         BFS思想, 把所有1都置为最大值, 把所有为0的位置加入队列中, 每次从队列中poll
         一个节点, 更新其四周的节点, 如果被更新的节点距离变小了就将其入队列准备更新其邻接点
         **/
        int m = matrix.length;
        if (m < 1) {
            return matrix;
        }
        int n = matrix[0].length;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] = Integer.MAX_VALUE;
                } else {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        int[][] dirs = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            for (int[] dir : dirs) {
                int x = node[0] + dir[0];
                int y = node[1] + dir[1];
                if (x < 0 || x >= m || y < 0 || y >= n || matrix[x][y] <= matrix[node[0]][node[1]] + 1)
                    continue;
                matrix[x][y] = matrix[node[0]][node[1]] + 1;
                queue.offer(new int[]{x, y});
            }
        }
        return matrix;
    }
}
