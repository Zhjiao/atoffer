package zhangjiao.tree;

public class VerifySequenceOfBST {
//   在后续遍历得到的序列中，最后一个元素为树的根结点。
//   从头开始扫描这个序列，比根结点小的元素都应该位于序列的左半部分；
//   从第一个大于根结点开始到根结点前 面的一个元素为止，所有元素都应该大于根结点，这部分元素对应的是树的右子树。
//   这样把序列划分为左右两部分，递归确认序列的左、右 两部分是不是都是二元查找树。
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null||sequence.length==0)
            return false;
        return verify(sequence,0,sequence.length-1);
    }
    private boolean verify(int[]sequence,int first,int last){
        if(last-first<=1)
            return true;
        int rootVal=sequence[last];
        int cutIndex=first;
        while(cutIndex<last&&sequence[cutIndex]<rootVal)
            cutIndex++;
        for(int i=cutIndex;i<last;i++)
            if(sequence[i]<rootVal)
                return false;
        return verify(sequence,first,cutIndex-1)&&verify(sequence,cutIndex,last-1);
    }
}

