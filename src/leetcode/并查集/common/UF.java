package leetcode.并查集.common;

/**
 * Created by jiangyunxiong on 2018/5/2.
 */
public class UF {
    int[] id;

    //初始化
    public UF(int N) {
        id = new int[N + 1];
        for(int i = 0;i < id.length; i++){
            id[i] = i;
        }
    }

    public void union(int u, int v){
        int uID = find(u);
        int vID = find(v);
        if (uID == vID){
            return;
        }
        for (int i = 0;i < id.length;i++){
            if(id[i] == uID){
                id[i] = vID;
            }
        }
    }

    public int find(int p){
        return id[p];
    }
}
