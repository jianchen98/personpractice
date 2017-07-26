package com.chen;

public class RelativePath {

	private final String path1;
	private final String path2;

	public RelativePath(String path2, String path1) {
		this.path2 = path2;
		this.path1 = path1;
	}

	public String relativePath() {
		String[] str1 = path1.split("/");
		String[] str2 = path2.split("/");

		int count = str1.length >= str2.length ? str2.length : str1.length;
		int i = 0;
		int p = 0;
		int q = 0;
		while (i < count) {
			if (str1[p].equals(str2[q])) {
				p++;
				q++;
				continue;
			} else {
				break;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (; q < str2.length + 1; q++)
			sb.append("/").append(str2[q - 1]);

		StringBuilder sb1 = new StringBuilder();
		for (; p < str1.length + 1; p++)
			sb1.append("/").append(str1[p - 1]);
		System.out.println(sb1.toString() + "|||" + sb.toString());

		return sb1.toString() + "|||" + sb.toString();
	}

	public static void main(String[] args) {
		String path1 = "a/b/c/b/d/e/t.txt";
		String path2 = "a/b/d/b/e/h.txt";
		RelativePath r = new RelativePath(path1, path2);
		r.relativePath();
	}

}
