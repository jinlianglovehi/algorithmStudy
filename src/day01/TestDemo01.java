package day01;

import java.util.Stack;

/**
 * 二分法的 前序， 中序 ，后序 数据排序的算法总结
 *
 *  前序代表的是 父节点优先输出
 *
 *  中序代表的是： 先输出left , 父节点， right
 *
 *  后续代表的是 ：先输出left , right , 父节点
 */
public class TestDemo01 {

    public static void main(String[] args) {
//        System.out.println("huhu");
//        原来的树结构
//         3
//     9       20
//
//          15    7
        TreeNode root = initTreeData() ;
        StringBuffer stringBuffer = new StringBuffer() ;

        // 采用递归的方式输出数据
        recursionBeforePrint(root,stringBuffer);
        System.out.println(stringBuffer.toString());//         3,9,20,15,7,

//       采用栈的方式输出
        stringBuffer.delete(0,stringBuffer.length());
        stackRecursionPrint(root,stringBuffer);
        System.out.println(stringBuffer.toString());

    }

    /**
     * 递归的输出数据信息  (前序)
     */
    private static void recursionBeforePrint(TreeNode treeNode,StringBuffer stringBuffer){

        if(treeNode != null){
            stringBuffer.append(treeNode.getValue());
            stringBuffer.append(",") ;
            recursionBeforePrint(treeNode.getLeftNode(),stringBuffer);
            recursionBeforePrint(treeNode.getRightNode(),stringBuffer);
        }else{
//            stringBuffer.append("null,");
        }

    }

    //       栈的使用  后进先出
//        boolean empty()
//        测试堆栈是否为空。
//        2	Object peek( )
//        查看堆栈顶部的对象，但不从堆栈中移除它。
//        3	Object pop( )
//        移除堆栈顶部的对象，并作为此函数的值返回该对象。
//        4	Object push(Object element)
//        把项压入堆栈顶部。
//        5	int search(Object element)
//        返回对象在堆栈中的位置，以 1 为基数
    private static void stackRecursionPrint(TreeNode treeNode,StringBuffer stringBuffer){

        Stack<TreeNode> stack = new Stack<TreeNode>();
        // push 到栈内的数据
        stack.push(treeNode);
        while (!stack.isEmpty()){
           TreeNode treeNode1 =  stack.pop();
           stringBuffer.append(treeNode1.getValue()+",") ;
           if(treeNode1.getRightNode()!=null){
               stack.push(treeNode1.getRightNode());
           }
           if(treeNode1.getLeftNode()!=null){
               stack.push(treeNode1.getLeftNode());
           }

        }
    }

    /**
     * 初始化算法的数据信息
     * @return
     */
    private static TreeNode initTreeData(){
        TreeNode root = new TreeNode(3);
        root.setLeftNode(new TreeNode(9));
        TreeNode rightNode = new TreeNode(20) ;
        rightNode.setLeftNode(new TreeNode(15));
        rightNode.setRightNode(new TreeNode(7));
        root.setRightNode(rightNode);
        return  root ;


    }
}
