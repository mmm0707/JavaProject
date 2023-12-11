/**
 * 
 */
package web_porject01;
	
/**
 * メインプロジェクトクラス
 */
public class MainProject {
	
	public static void main(String[] args) {
		int[] array = new int[5];
		
		// 1~10乱数を配列に格納
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*10) + 1;
			System.out.print(array[i] + " ");
		}
 
	}
}
