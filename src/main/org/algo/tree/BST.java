package org.algo.tree;

import org.algo.pojo.TNode;

/**
 * 
 * @author Manish Kankani
 * @param <T>
 * @since 1.0
 */
public class BST<T extends Comparable<? super T>> {

	/**
	 * Returns total number of nodes in BST
	 * 
	 * @param root
	 * @return
	 */
	public int size(TNode<T> root) {
		if (root == null) {
			return 0;
		} else
			return (1 + size(root.getLeft()) + size(root.getRight()));
	}

	/**
	 * Inserts new node in BST
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	public TNode<T> insert(TNode<T> root, T data) {
		if (root == null) {
			return new TNode<T>(data);
		}
		int compare = root.getData().compareTo(data);
		if (compare > 0) {
			root.setLeft(insert(root.getLeft(), data));
		} else {
			root.setRight(insert(root.getRight(), data));
		}
		return root;
	}

	/**
	 * Returns true if the at least one node with with given value exist.
	 * Otherwise returns false
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	public boolean find(TNode<T> root, T data) {
		if (root == null) {
			return false;
		}

		int compare = root.getData().compareTo(data);
		if (compare > 0) {
			return find(root.getLeft(), data);
		}
		if (compare < 0) {
			return find(root.getRight(), data);
		}
		return true;
	}
}
