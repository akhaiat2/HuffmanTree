import java.util.*;
import java.io.*;
public class TreeNode {
	private int frequency;
	private String value;
	private TreeNode left, right;
	private int binaryCode;
	public TreeNode(int frequency, String value, TreeNode left, TreeNode right) {
		super();
		this.frequency = frequency;
		this.value = value;
		this.left = left;
		this.right = right;
	}
	public TreeNode(int frequency, int binaryCode, String value, TreeNode left, TreeNode right) {
		super();
		this.frequency = frequency;
		this.value = value;
		this.left = left;
		this.right = right;
		this.binaryCode = binaryCode;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	public void setBinaryCode(int code) {
		this.binaryCode = code;
	}
	public int getBinaryCode()
	{
		return this.binaryCode;
	}
}