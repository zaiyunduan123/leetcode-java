package leetcode.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/29 下午9:54
 */
public class EmployeeImportance_690 {
    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }


    Map<Integer, Employee> employeeMap = new HashMap<>();

    public int getImportance(List<Employee> employees, int id) {

        for (Employee e : employees) {
          employeeMap.put(e.id, e);
        }
        return dfs(id);
    }

    private int dfs(int eid){
        Employee employee = employeeMap.get(eid);
        int answer = employee.importance;
        for (int id:employee.subordinates){
           answer += dfs(id);
        }
        return answer;
    }

}
