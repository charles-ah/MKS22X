import java.util.*;

public class BSTree<T extends Comparable<T>>{
    private class Node{
	T data;
	Node left;
	Node right;

	public Node(T value){
	    data=value;
	}
	public Node(T value, Node l, Node r){
	    data=value;
	    left=l;
	    right=r;
	}

	private void setLeft(Node l){
	    left=l;
	}
	private Node getLeft(){
	    return left;
	}
	private void setRight(Node r){
	    right=r;
	}
	private Node getRight(){
	    return right;
	}
	private void setData(T val){
	    data=val;
	}
	private T getData(){
	    return data;
	}

	public void add(T value){
	    if(value.compareTo(data)<0){
		if(left==null){
		    left=new Node(value);
		}
		else{
		    left.add(value);
		}
	    }else{
		if(right==null){
		    right=new Node(value);
		}
		else{
		    right.add(value);
		}
	    }
	}
	public String toString(){
	    if(left== null && right == null){
		return data+" _ _";
	    }else if(left == null){
		return data+" _ "+right;
	    }else if(right==null){
		return data+" "+left+" _ ";
	    }else{
		return ""+data+" "+left+" "+right;
	    }
	}
	public boolean contains(T value){
	    if(this==null){
		return false;
	    }else if(data.compareTo(value)==0){
		return true;
	    }else if(data.compareTo(value)<0){
		return left.contains(value);
	    }else{
		return right.contains(value);
	    }
	}
	public int getHeight(Node current){
	    if (current==null){
		return 0;
	    }else{
		return 1+Math.max(getHeight(current.getLeft()),getHeight(current.getRight()));
	    }
	}

    }
    private Node root;

    public void add(T value){
	if(root==null){
	    root=new Node(value);
	}else{
	    root.add(value);
	}
    }

    public String toString(){
	return root.toString();
    }

    public boolean contains(T value){
	return root.contains(value);
    }

    public int getHeight(){
	return root.getHeight(root);
    }

    public static void main(String[]args){
	BSTree<Integer> test =new BSTree<Integer>();
	test.add(3);
	System.out.println(test.toString());
	test.add(4);
	System.out.println(test.toString());
	test.add(2);
	System.out.println(test.toString());
	System.out.println(test.getHeight());
    }
}
