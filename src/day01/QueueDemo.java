package day01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {


    }

//    poll，remove 区别：
//    remove() 和 poll() 方法都是从队列中删除第一个元素。remove() 的行为与 Collection 接口的版本相似， 但是新的 poll() 方法在用空集合调用时不是抛出异常，只是返回 null。因此新的方法更适合容易出现异常条件的情况。
//    peek，element区别：
//    element() 和 peek() 用于在队列的头部查询元素。与 remove() 方法类似，在队列为空时， element() 抛出一个异常，而 peek() 返回 null
//
    private static void queuePrint(TreeNode root){
        // 队列的方式
        Queue<TreeNode> queue = new LinkedList<>() ;

        if(root != null){
            queue.add(root);
        }


    }
}
