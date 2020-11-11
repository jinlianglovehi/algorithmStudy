package day01;

public class TestDemo01 {

    public static void main(String[] args) {
        System.out.println("huhu");
        TreeNode root = initTreeData() ;
        StringBuffer stringBuffer = new StringBuffer() ;
        recursionPrint(root,stringBuffer);
        System.out.println(stringBuffer.toString());


    }

    /**
     * 递归的输出数据信息
     */
    private static void recursionPrint(TreeNode treeNode,StringBuffer stringBuffer){

        if(treeNode != null){
            stringBuffer.append(treeNode.getValue());
            stringBuffer.append(",") ;
            recursionPrint(treeNode.getLeftNode(),stringBuffer);
            recursionPrint(treeNode.getRightNode(),stringBuffer);
        }else{
            stringBuffer.append("null,");
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
