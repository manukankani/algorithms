package org.algo.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.algo.pojo.TNode;

public class TreeAlgo<T> {

	/**
	 * Return list of elements in pre-order traversal. Returns empty list if
	 * there are no elements present in tree.
	 * 
	 * @param root
	 * @return list of elements in pre-order traversal.
	 */
	public static <T> List<T> preOrderTraverse(TNode<T> root) {
		List<T> preOrderList = new ArrayList<T>();
		preOrderTraverse(root, preOrderList);
		return preOrderList;
	}

	private static <T> void preOrderTraverse(TNode<T> root, List<T> list) {
		if (root == null) {
			return;
		}
		list.add(root.getData());
		preOrderTraverse(root.getLeft(), list);
		preOrderTraverse(root.getRight(), list);
	}

	/**
	 * Return list of elements in post-order traversal. Returns empty list if
	 * there are no elements present in tree.
	 * 
	 * @param root
	 * @return
	 */
	public static <T> List<T> postOrderTraversal(TNode<T> root) {
		List<T> postList = new ArrayList<T>();
		postOrderTraverse(root, postList);
		return postList;
	}

	private static <T> void postOrderTraverse(TNode<T> root, List<T> list) {
		if (root == null) {
			return;
		}
		postOrderTraverse(root.getLeft(), list);
		postOrderTraverse(root.getRight(), list);
		list.add(root.getData());
	}

	/**
	 * Returns list of elements in top view order. Returns empty list if there
	 * are no element present in tree.
	 * 
	 * @param root
	 * @return
	 */
	public static <T> List<T> topViewTree(TNode<T> root) {
		List<T> topViewList = new ArrayList<T>();
		Stack<T> stack = new Stack<T>();
		TNode<T> left = root;
		TNode<T> right = root.getRight();
		while (left != null) {
			stack.push(left.getData());
			left = left.getLeft();
		}
		while (!stack.isEmpty()) {
			topViewList.add(stack.pop());
		}
		while (right != null) {
			topViewList.add(right.getData());
			right = right.getRight();
		}

		return topViewList;
	}
}
