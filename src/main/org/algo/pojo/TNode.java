package org.algo.pojo;

/**
 * 
 * @author Manish Kankani
 * @param <T>
 * @since 1.0
 */
public class TNode<T> {
	
	private T data;
	private TNode<T> left;
	private TNode<T> right;
	
	public TNode(T data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public TNode(T data, TNode<T> left, TNode<T> right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public TNode<T> getLeft() {
		return left;
	}
	
	public void setLeft(TNode<T> left) {
		this.left = left;
	}
	
	public TNode<T> getRight() {
		return right;
	}
	
	public void setRight(TNode<T> right) {
		this.right = right;
	}

}
