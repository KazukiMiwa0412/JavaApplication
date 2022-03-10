package mypkg;

import java.util.Arrays;
import java.util.List;

public class MyClass1 {

	public static void main(String[] args) {
		// コマンドプロンプトからの入力をリストに格納
		List<String> list = Arrays.asList(args);

		for (String object : list) {
			System.out.println(object);
		}
	}

}
